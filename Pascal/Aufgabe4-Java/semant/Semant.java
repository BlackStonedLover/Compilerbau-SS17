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

  public Semant(boolean s) {
    showTables = s;
  }

  public Table check(Absyn program) {
    table globalTable = new TableBuilder().buildSymbolTables(program,showTables)
    new ProcedureBodyChecker().check(program,globalTable);
    check MainProcedure(globalTable);

    Table globalTable = ??;
    /* do semantic checks in 2 passes */
    /* check if "main()" is present */
    /* return global symbol table */
    return globalTable;
    }

    // check Class(Object,Class<?>,String errorMsg, int lineNo)
    // check Main Procedure
  }

}

/*
class Table Builder{
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
