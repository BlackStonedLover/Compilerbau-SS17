package semant;

import sym.Sym;
import table.*;
import types.*;
import absyn.*;

class TableBuilder {

	private boolean showTables;

	Table buildSymbolTables(Absyn program, boolean showTables) {
	}

	private class TableBuilderVisitor extends DoNothingVisitor {

		Type resultType;
		Table table;

		public void visit(DecList list) {
		list.ListNode.accept(this);

		}

		public void visit(TypeDec node) {
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType));
		}

		public void visit(NameTy node) {
		Entry e = sym.Table.getDeclaration(node.name,errorMsg)
		SemanticCheck.checkclass(e,TypeEntry.class,errorMsg)
		resultType = (TypeEntry)e type;
		}

		public void visit(ArrayTy node) {
		node.baseTy.accept(this);
		resultType = new ArrayType(node.size,resultType);
		}

		public void visit(ProcDec node) {
		localTable = new Table(globalTable);
		paramypeList = new ParamTypeList();
		node.params.accept(this);
		node.vars.accept(this);
		//enter Declaration(node.name,new TypeEntry(resultType));
		gloabalTable.enter(node.name,new ProcEntry(paramTypeList,localTable),"redeclaration of " + node.name + " as procedure in line " + node.row);
		}


		public void visit(ParDec node) {
		node.ty.accept(this);
		if(!node.isRef)SemanticChecker.checkClass(resultType,PrimitiveType.class," parameter "+ node.name + " must be a reference parameter in line " + node.row);
		paramTypeList.add(new ParamTyp(resultType),node.isRef);
		table.enter(new VarEntry(node.name,node.isRef),"redeclaration of "+ node.name + " as parameter in line " + node.row);
		}

		public void visit(VarDec node) {
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType));
		}
	}
}
