/*
 * IntExp.java -- abstract syntax for integer expression
 */


package absyn;

import sym.Sym;


public class IntExp extends Exp {

  public int val;

  public IntExp(int r, int c, int v) {
    row = r;
    col = c;
    val = v;
  }

  public void show(int n) {
    indent(n);
    say("IntExp(");
    sayInt(val);
    say(")");
  }

}
