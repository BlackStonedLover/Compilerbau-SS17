package semant;

import table.*;
import types.*;
import absyn.*;

class ProcedureBodyChecker {

	void check(Absyn program, Table globalTable) {
		program.accept(new CheckVisitor(globalTable));
	}

	private class CheckVisitor extends DoNothingVisitor {

		public void visit(ProcDec procDec) {

		}
		public void visit(ArrayTy node) {

		}
		public void visit(ArrayVar node) {

		}
		public void visit(AssignStm node) {

		}
		public void visit(CallStm node) {

		}
		public void visit(CompStm node) {

		}
		public void visit(DecList node) {

		}
		public void visit(EmptyStm node) {

		}
		public void visit(ExpList node) {

		}
		public void visit(IfStm node) {

		}
		public void visit(IntExp node) {

		}
		public void visit(NameTy node) {

		}
		public void visit(OpExp node) {

		}
		public void visit(ParDec node) {

		}
		public void visit(ProcDec node) {

		}
		public void visit(SimpleVar node) {

		}
		public void visit(StmList node) {

		}
		public void visit(TypeDec node) {

		}
		public void visit(VarDec node) {

		}
		public void visit(VarExp node) {

		}
		public void visit(WhileStm node) {

		}

	}
}
