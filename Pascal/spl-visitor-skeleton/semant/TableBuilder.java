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
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType));
		}

		public void visit(ParDec node) {
		node.VarDec.accept(this);

		}

		public void visit(VarDec node) {
		node.ty.accept(this);
		enter Declaration(node.name,new TypeEntry(resultType));
		}
	}
}
