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
    /* generate built-in types */
    /* setup global symbol table */


    Table globalTable = new TableBuilder().buildSymbolTables(program,showTables);
    /* do semantic checks in 2 passes */
    /* check if "main()" is present */
    /* return global symbol table */
    return globalTable;

    /* public table check(Absyn program, boolean showtables){
    table globalTable = new TableBuilder().buildSymbolTables(program,showTables)
    new ProcedureBodyChecker().check(program,globalTable)
    check MainProcedure(globalTable),
    return globalTable
    }
    */

    // check Class(Object,Class<?>,String errorMsg, int lineNo)
    // check Main Procedure
  }

}
class TableBuilder{
    Table buildSymbolTables(){
        Table globalTable = new Table()
        new TableInitializer().initalizeSymbolTable(globalTable);
        program.accept(new TableBuilderVisitor(globalTable));
      return globalTable;
    }
	
	
}

private class TableBuilderVisitor extends DoNothingVisitor{
  private Table SymTable;
  private Type resultType;
  private ParamTypeList ParamTypeList;
  
    public void visit(TypeDec node){
    node.ty.accept(this);
    enter Declaration(node.name,new TypeEntry(resultType))
    }
	public void visit(ArrayTy node){
	node.baseTy.accept(this);
	resultType = new ArrayType(node.size,resultType);
	}
 
	public void visit(NameTy node){
	Entry e = symTable.getDeclaration(node.name,errorMsg)
	SemanticCheck.checkClass(e,TypeEntry.class,errorMsg)
	resultType=(TypeEntry)e type;
	}
}


private class TableInitializer {
  private Table SymTable;
  private Type resultType;
  private ParamTypeList ParamTypeList;
  private DecList DecList;
 
  
  public void initalizeSymbolTable(Table globalTable){
 
  }

}



/*
ProcedureBodyChecker Overview

DecList : alle Elemente besuchen

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
