package semant;

import table.*;
import types.*;
import absyn.*;

class ProcedureBodyChecker {

	void check(Absyn program, Table globalTable) {
		program.accept(new CheckVisitor(globalTable));
	}

	private class CheckVisitor extends DoNothingVisitor {
		Type resultType;
		Table localTable;
		ParamTypeList paramTypeList; 
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
		
		Entry e = node.lookUp(node.name);
		if(e == null)throw new RuntimeException("is not declared yet");
		SemanticChecker.checkclass(node,ProcDec.class,"Is not a proc dec",node.row);
		paramTypeList = e.paramTypes;
		localTable = e.localTable;
		
		
		
		for(int i =0; i<node.args.size();i++){
			//SemanticChecker.check(intType,ArrayType,errorMsg,node.row) // intType,ArrayType so nicht richtig?
			arg.accept(this);
			SemanticChecker.check(node.args[i],paramTypeList[i],"error msg", node.row);
			if(node.args[i].isref) SemanticChecker.checkclass(node.args[i],VarExp.class,"ErrorMsg",node.row);			
			if(paramTypeList[i+1]==null  node.args[i+1]!=null){
					throw new RuntimeException("has less arguments...");
			}else if(paramTypeList[i+1]!=null  node.args[i+1]==null){
					throw new RuntimeException("has less arguments...");
			}
		}
		//2 Listen Abgleichen: paramTypeList | node.args
		// z.B. for-Schleife
		// Für jede Parameterposition:
		//Typ des aktuellen Arguements berechnen
		//arg.accept(this); // zu finden danach in resultType
		//Abgleich mit dem Type aus der paramTypeList wenn gleich ok ansonsten fehler
		//Typen vergleichen
		// bei isref = true => Prüfen ob variable übergeben wurde!
		//instance.of(VarExp); // checkclass
		// Überprüfen ob die andere Liste .hasNext()? weiter mit Next: Fehler! Abbruch
		/*
		*/


		//2. ? Schritt schauen ob der Eintrag instance of ProcDec ist oder ob wir es finden

		}
		public void visit(CompStm node) {
		node.lookUp();
		//überprüfe
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
			Entry e = node.lookUp();
			if(e == null)
			//SemanticChecker.checkclass(node,ParDec.class,)
			node.accept(this);
			else throw new RuntimeException("redeclaration of " + node.name + " as parameter in line " + node.row);
		}
		public void visit(ProcDec node) {

		}
		public void visit(SimpleVar node) {

		}
		public void visit(StmList node) {
			node.accept(this);
		}
		public void visit(TypeDec node) {
			/*Bleibt leer*/
		}
		public void visit(VarDec node) {
			Entry e = node.lookUp();
			if(e == null){
			SemanticChecker.checkclass(node.ty,TypeDec.class,"undefined type",nod.row);
			node.accept(this);
			}
			else throw new RuntimeException("redeclaration of " + node.name + " as variable in line " + node.row);
	
		}
		public void visit(VarExp node) {

		}
		public void visit(WhileStm node) {
		node.test.accept(this);
		SemanticChecker.checkType(resultType,boolType,"'while' test expression must be of type boolean ",node.row);
		node.body.accept(this);

		}
	

	}
}
