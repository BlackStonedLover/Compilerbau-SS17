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
		Table localTable;
		ParamTypeList paramTypeList;

		public void visit(DecList list) {
			for (Absyn elem: list)
				elem.accept(this);
		}

		public void visit(TypeDec node) {
		node.ty.accept(this);
		globalTable.enter(node.name,new TypeEntry(resultType)); //redeclaraiton of type
		}

		public void visit(NameTy node) {
		Entry e = sym.Table.getDeclaration(node.name,"undefined procedure "+ node.name +" in line "+node.row)
		SemanticCheck.checkclass(e,TypeEntry.class,e + " is not a type in line "+ e.row)
		resultType = (TypeEntry)e type;
		}

		public void visit(ArrayTy node) {
		node.baseTy.accept(this);
		resultType = new ArrayType(node.size,resultType);
		}

		public void visit(ProcDec node) {

		localTable = new Table(globalTable);
		paramTypeList = new ParamTypeList();
		node.params.accept(this);
		node.vars.accept(this);
		//enter Declaration(node.name,new TypeEntry(resultType));
		gloabalTable.enter(node.name,new ProcEntry(paramTypeList,localTable),"redeclaration of " + node.name + " as procedure in line " + node.row);
		}


		public void visit(ParDec node) {
		node.ty.accept(this);
		if(!node.isRef)SemanticChecker.checkClass(resultType,PrimitiveType.class," parameter "+ node.name + " must be a reference parameter in line " + node.row);
		paramTypeList.add(new ParamTyp(resultType),node.isRef);
		localTable.enter(new VarEntry(node.name,node.isRef),"redeclaration of "+ node.name + " as parameter in line " + node.row);
		}

		public void visit(VarDec node) {
		node.ty.accept(this);
		localTable.enter(node.name,new TypeEntry(resultType),); //redec of var
		}
	}
}
