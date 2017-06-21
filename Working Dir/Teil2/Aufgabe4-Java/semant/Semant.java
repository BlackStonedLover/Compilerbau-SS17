/*
 * Semant.java -- semantic checks
 */


package semant;

import absyn.*;
import sym.Sym;
import table.*;
import types.*;

public class Semant {

  private boolean showTables;
  static final Type intType = new PrimitiveType("int",VarAllocator,INTBYTESIZE);

  public Semant(boolean s) {
    showTables = s;
  }

  public Table check(Absyn program) {
    /* generate built-in types */
    /* setup global symbol table */       
    Table globalTable = new TableBuilder().buildSymbolTables(program,showTables);
    /* do semantic checks in 2 passes */


    new ProcedureBodyChecker().check(program,globalTable);
    /* check if "main()" is present */
     check MainProcedure(globalTable);
    /* return global symbol table */
    return globalTable;


  }

}



class TableBuilder{
  Table globalTable;
  // Programm
    Table buildSymbolTables(){
        globalTable = new Table();
        initalizeSymbolTable();

        program.accept(new TableBuilderVisitor(globalTable));
      return globalTable;
    }
   void  initalizeSymbolTable(){
     
     globalTable.enter(node.name ,new PrimitiveType("int"));
   }

}

private class TableBuilderVisitor extends DoNothingVisitor{
  private Table SymTable;
  private Type resultType;
  private ParamTypeList paramTypeList;
  
public void visit(TypeDec node){
   node.ty.accept(this);
    if(node.instance.of(IntExp)){
    paramTypeList.add(new ParamTyp(resultType),node.isRef);
    SymTable.enter(new VarEntry(resultType,node.isRef));
    }
}

   
  public void visit(VarDec node){
  node.ty.accept(this);
  localTable.enter(new VarEntry(resultType,node.isRef),false);
  }


}


private class TableInitializer {
  private Table SymTable;
  private Type resultType;
  private ParamTypeList ParamTypeList;
  
  public void initalizeSymbolTable(Table globalTable){
    
  }

}

class CheckVisitor ...{
Typ resultType;
public void visit (CallStm node){
//1. Schritt ist die Prozedur dekleriert Look up
// Eintrag der Prozedur in der globalTable suchen
// daraus erhalten wir => paramTypeList + localTable

//2 Listen Abgleichen: paramTypeList | node.args
// z.B. for-Schleife
// Für jede Parameterposition:
//Typ des aktuellen Arguements berechnen
arg.accept(this); // zu finden danach in resultType
//Abgleich mit dem Type aus der paramTypeList wenn gleich ok ansonsten fehler
//Typen vergleichen
// bei isref = true => Prüfen ob variable übergeben wurde!
instance.of(VarExp); // checkclass
// Überprüfen ob die andere Liste .hasNext()? weiter mit Next: Fehler! Abbruch
/*
*/


//2. ? Schritt schauen ob der Eintrag instance of ProcDec ist oder ob wir es finden
}
}






/*
class TableBuilder{
...
Table buildSymbolTables(){
  Table globalTable = new Table()
  new TableInitializer().initalize SymbolTable(globalTable)
  ..
  program.accept(new TableBuilderVisitor(globalTable))
  return globalTable
  }
private class TableBuilderVisitor extends DoNothingVisitor{
  private Table SymTable;
  private Type resultType;
  private ParamTypeList ParamTypeList;
  ..
  public void visit(TypeDec node){
  node.ty.accept(this);
  enter Declaration(node.name,new TypeEntry(resultType))
  }

}
public void visit(ArrayTy node){
node.baseTy.accept(this);
resultType = new ArrayType(node.size,resultType);
}
public void visit(NameTy node){
Entry e = symTable.getDeclaration(node.name,errorMsg)
SemanticCheck.checkClass(e,TypeEntry.class,errorMsg)
resultType=(TypeEntry)e)type;
}
}


ProcedureBodyChecker Overview
DeclList : alle Elemente besuchen

TypeDec : /////

ProcDec :
Eintrag aus globaler Tabelle holen:
  -lokeale Tabelle
  -Parametertypliste
Rumpf checken(accept)

WhileStmt :
node.test.accept(this);
checkType(boolType,"errorMsg",node.row);
node.body.accept(this);

*/
