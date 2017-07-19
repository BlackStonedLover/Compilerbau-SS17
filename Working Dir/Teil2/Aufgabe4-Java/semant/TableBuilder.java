package semant;

import sym.Sym;
import table.*;
import types.*;
import absyn.*;

class TableBuilder {

	private boolean showTables;
	Table globalTable;
	Table buildSymbolTables(Absyn program, boolean showTables) {
	globalTable = new Table();
    new TableInitializer().intializeSymbolTable();
			program.accept(new TableBuilderVisitor(globalTable));
      return globalTable;
	}

	private class TableBuilderVisitor extends DoNothingVisitor {
	  private Table localTable;
	  private Type resultType;
	  private ParamTypeList paramTypeList;

		public void visit(DecList list) {
		list.ListNode.accept(this);
		}

		public void visit(TypeDec node) {
		node.ty.accept(this);
		globalTable.enter(node.name, new TypeEntry(resultType),"redeclaration of " + node.name + " as type in line ", node.row);		
		

		public void visit(NameTy node) {
		Entry e = localTable.getDeclaration(node.name,"undefined variable " + node.name + " in line " + node.row);
		SemanticChecker.checkClass(e,TypeEntry.class,"assignment has different types in line",node.row);
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
		globalTable.enter(node.name,new ProcEntry(paramTypeList,localTable),errorMsg);
		}

		public void visit(ParDec node) {
		node.ty.accept(this);
		SemanticChecker.checkClass(resultType,IntExp,"errorMsg",node.row);
		paramTypeList.add(new ParamType(resultType),node.isRef);
		localTable.enter(node.name,new VarEntry(resultType,node.isRef));
		}

		public void visit(VarDec node) {
		node.ty.accept(this);
		localTable.enter(node.name,new VarEntry(resultType,false),"redeclaration of "+ node.name +" as variable in line " + node.row);
		}
	}
}
