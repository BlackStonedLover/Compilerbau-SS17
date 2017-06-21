package semant;

import table.*;
import types.*;
import absyn.*;

class ProcedureBodyChecker {
	
	void check(Absyn program, Table globalTable) {
		program.accept(new CheckVisitor(globalTable));
	}

	private class CheckVisitor extends DoNothingVisitor {
		Table globalTable;
		CheckVisitor(Table globalTable){
			this.globalTable = globalTable;
		}
		public void visit(ProcDec procDec) {

		}
		public void visit(ArrayTy node) {

		}
		public void visit(ArrayVar node) {

		}
		public void visit(AssignStm node) {

		}
		public void visit(CallStm node) {
//1. Schritt ist die Prozedur dekleriert Look up
// Eintrag der Prozedur in der globalTable suchen
// daraus erhalten wir => paramTypeList + localTable
	Entry e = globalTable.lookup(node);

//2 Listen Abgleichen: paramTypeList | node.args
// z.B. for-Schleife
// Für jede Parameterposition:
//Typ des aktuellen Arguements berechnen
for(ParamTypeList p : e){
	if(p == node.args[0]){
		arg.accept(this); // zu finden danach in resultType
		instance.of(VarExp); // checkclass
		if(node.next != null){

			// Überprüfen ob die andere Liste .hasNext()? weiter mit Next: Fehler! Abbruch
		}
		else // error
	}
	else // Error
}

//Abgleich mit dem Type aus der paramTypeList wenn gleich ok ansonsten fehler
//Typen vergleichen
// bei isref = true => Prüfen ob variable übergeben wurde!


/*
*/


//2. ? Schritt schauen ob der Eintrag instance of ProcDec ist oder ob wir es finden

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
