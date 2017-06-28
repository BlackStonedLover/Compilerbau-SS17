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
			for (Absyn elem: list)
				elem.accept(this);
		}

		public void visit(TypeDec node) {
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType));
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
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType),"procedure "+node.name+ "called with too few arguments in line "+node.row,"procedure "+node.name+" called with too many arguments in line "+node.row);
		}

		public void visit(ParDec node) {
		node.ty.accept(this);
		if(!node.isRef)SemanticChecker.checkClass(resultType,PrimitiveType.class," parameter "+ node.name + " must be a reference parameter in line " + node.row);
		paramTypeList.add(new ParamTyp(resultType),node.isRef);
		table.enter(new VarEntry(node.name,node.isRef),"redeclaration of "+ node.name + " as parameter in line " + node.row);
		}

		public void visit(VarDec node) {
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType),);
		}
	}
}
