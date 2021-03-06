
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue May 30 08:22:19 CEST 2017
//----------------------------------------------------

package parse;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue May 30 08:22:19 CEST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\067\000\002\002\004\000\002\004\002\000\002\004" +
    "\004\000\002\004\004\000\002\005\007\000\002\007\003" +
    "\000\002\007\003\000\002\010\010\000\002\010\010\000" +
    "\002\006\013\000\002\012\002\000\002\012\010\000\002" +
    "\011\002\000\002\011\005\000\002\011\003\000\002\015" +
    "\005\000\002\015\006\000\002\013\002\000\002\013\004" +
    "\000\002\014\003\000\002\014\003\000\002\014\003\000" +
    "\002\014\003\000\002\014\003\000\002\022\010\000\002" +
    "\026\002\000\002\026\004\000\002\023\007\000\002\024" +
    "\005\000\002\025\007\000\002\016\002\000\002\016\003" +
    "\000\002\027\003\000\002\027\003\000\002\030\006\000" +
    "\002\030\006\000\002\017\003\000\002\021\005\000\002" +
    "\021\005\000\002\021\005\000\002\021\005\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\002\003" +
    "\000\002\002\003\000\002\002\003\000\002\020\003\000" +
    "\002\020\005\000\002\020\005\000\002\020\005\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\003" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\010\002\000\012\006\014\010\001\002\000" +
    "\004\002\157\001\002\000\010\002\000\012\006\014\010" +
    "\001\002\000\004\042\027\001\002\000\010\002\000\012" +
    "\006\014\010\001\002\000\004\042\011\001\002\000\004" +
    "\024\012\001\002\000\006\004\016\042\015\001\002\000" +
    "\004\036\025\001\002\000\010\030\ufffb\036\ufffb\037\ufffb" +
    "\001\002\000\010\030\ufffc\036\ufffc\037\ufffc\001\002\000" +
    "\004\035\017\001\002\000\004\041\020\001\002\000\004" +
    "\034\021\001\002\000\004\013\022\001\002\000\006\004" +
    "\016\042\024\001\002\000\010\030\ufffa\036\ufffa\037\ufffa" +
    "\001\002\000\010\030\ufff9\036\ufff9\037\ufff9\001\002\000" +
    "\010\002\ufffd\012\ufffd\014\ufffd\001\002\000\004\002\uffff" +
    "\001\002\000\004\031\030\001\002\000\010\011\031\030" +
    "\ufff5\042\033\001\002\000\004\042\153\001\002\000\004" +
    "\030\041\001\002\000\004\040\037\001\002\000\006\030" +
    "\ufff3\037\035\001\002\000\010\011\031\030\ufff5\042\033" +
    "\001\002\000\004\030\ufff4\001\002\000\006\004\016\042" +
    "\015\001\002\000\006\030\ufff2\037\ufff2\001\002\000\004" +
    "\033\042\001\002\000\020\005\ufff7\007\043\010\ufff7\017" +
    "\ufff7\032\ufff7\036\ufff7\042\ufff7\001\002\000\004\042\146" +
    "\001\002\000\016\005\056\010\045\017\uffe3\032\ufff0\036" +
    "\051\042\047\001\002\000\004\031\142\001\002\000\004" +
    "\017\uffe2\001\002\000\010\017\uffe1\031\136\035\070\001" +
    "\002\000\020\005\uffee\006\uffee\010\uffee\017\uffee\032\uffee" +
    "\036\uffee\042\uffee\001\002\000\020\005\uffea\006\uffea\010" +
    "\uffea\017\uffea\032\uffea\036\uffea\042\uffea\001\002\000\020" +
    "\005\uffeb\006\uffeb\010\uffeb\017\uffeb\032\uffeb\036\uffeb\042" +
    "\uffeb\001\002\000\004\032\135\001\002\000\052\005\uffe0" +
    "\006\uffe0\010\uffe0\015\uffe0\016\uffe0\017\uffe0\020\uffe0\021" +
    "\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0\026\uffe0\027\uffe0" +
    "\030\uffe0\032\uffe0\034\uffe0\035\132\036\uffe0\042\uffe0\001" +
    "\002\000\020\005\uffec\006\uffec\010\uffec\017\uffec\032\uffec" +
    "\036\uffec\042\uffec\001\002\000\004\031\123\001\002\000" +
    "\016\005\056\010\045\017\uffe3\032\ufff0\036\051\042\047" +
    "\001\002\000\004\017\062\001\002\000\020\005\uffed\006" +
    "\uffed\010\uffed\017\uffed\032\uffed\036\uffed\042\uffed\001\002" +
    "\000\006\041\063\042\066\001\002\000\012\020\113\021" +
    "\115\022\111\023\114\001\002\000\032\005\uffd2\006\uffd2" +
    "\010\uffd2\017\uffd2\020\113\021\115\022\111\023\114\030" +
    "\uffd2\032\uffd2\036\uffd2\042\uffd2\001\002\000\020\005\uffe5" +
    "\006\uffe5\010\uffe5\017\uffe5\032\uffe5\036\uffe5\042\uffe5\001" +
    "\002\000\052\005\uffe1\006\uffe1\010\uffe1\015\uffe1\016\uffe1" +
    "\017\uffe1\020\uffe1\021\uffe1\022\uffe1\023\uffe1\024\uffe1\025" +
    "\uffe1\026\uffe1\027\uffe1\030\uffe1\032\uffe1\034\uffe1\035\070" +
    "\036\uffe1\042\uffe1\001\002\000\020\005\uffdd\006\uffdd\010" +
    "\uffdd\017\uffdd\032\uffdd\036\uffdd\042\uffdd\001\002\000\006" +
    "\041\071\042\066\001\002\000\016\015\100\016\102\024" +
    "\075\025\103\026\076\027\077\001\002\000\016\015\100" +
    "\016\102\024\075\025\103\026\076\027\077\001\002\000" +
    "\004\034\074\001\002\000\052\005\uffde\006\uffde\010\uffde" +
    "\015\uffde\016\uffde\017\uffde\020\uffde\021\uffde\022\uffde\023" +
    "\uffde\024\uffde\025\uffde\026\uffde\027\uffde\030\uffde\032\uffde" +
    "\034\uffde\035\uffde\036\uffde\042\uffde\001\002\000\006\041" +
    "\uffd3\042\uffd3\001\002\000\006\041\uffd8\042\uffd8\001\002" +
    "\000\006\041\uffd5\042\uffd5\001\002\000\006\041\uffd7\042" +
    "\uffd7\001\002\000\006\041\104\042\066\001\002\000\006" +
    "\041\uffd6\042\uffd6\001\002\000\006\041\uffd4\042\uffd4\001" +
    "\002\000\006\030\uffda\034\uffda\001\002\000\006\030\uffdc" +
    "\034\uffdc\001\002\000\006\041\107\042\066\001\002\000" +
    "\006\030\uffdb\034\uffdb\001\002\000\006\030\uffd9\034\uffd9" +
    "\001\002\000\006\041\uffcc\042\uffcc\001\002\000\006\041" +
    "\116\042\066\001\002\000\006\041\uffce\042\uffce\001\002" +
    "\000\006\041\uffcb\042\uffcb\001\002\000\006\041\uffcd\042" +
    "\uffcd\001\002\000\022\005\uffd1\006\uffd1\010\uffd1\017\uffd1" +
    "\030\uffd1\032\uffd1\036\uffd1\042\uffd1\001\002\000\022\005" +
    "\uffd0\006\uffd0\010\uffd0\017\uffd0\030\uffd0\032\uffd0\036\uffd0" +
    "\042\uffd0\001\002\000\004\041\121\001\002\000\022\005" +
    "\uffcf\006\uffcf\010\uffcf\017\uffcf\030\uffcf\032\uffcf\036\uffcf" +
    "\042\uffcf\001\002\000\004\032\uffef\001\002\000\006\041" +
    "\063\042\066\001\002\000\004\030\125\001\002\000\014" +
    "\005\056\010\045\017\uffe3\036\051\042\047\001\002\000" +
    "\020\005\uffe8\006\130\010\uffe8\017\uffe8\032\uffe8\036\uffe8" +
    "\042\uffe8\001\002\000\020\005\uffe9\006\uffe9\010\uffe9\017" +
    "\uffe9\032\uffe9\036\uffe9\042\uffe9\001\002\000\014\005\056" +
    "\010\045\017\uffe3\036\051\042\047\001\002\000\020\005" +
    "\uffe7\006\uffe7\010\uffe7\017\uffe7\032\uffe7\036\uffe7\042\uffe7" +
    "\001\002\000\006\041\071\042\066\001\002\000\004\034" +
    "\134\001\002\000\052\005\uffdf\006\uffdf\010\uffdf\015\uffdf" +
    "\016\uffdf\017\uffdf\020\uffdf\021\uffdf\022\uffdf\023\uffdf\024" +
    "\uffdf\025\uffdf\026\uffdf\027\uffdf\030\uffdf\032\uffdf\034\uffdf" +
    "\035\uffdf\036\uffdf\042\uffdf\001\002\000\010\002\ufff8\012" +
    "\ufff8\014\ufff8\001\002\000\004\042\137\001\002\000\004" +
    "\030\140\001\002\000\004\036\141\001\002\000\020\005" +
    "\uffe4\006\uffe4\010\uffe4\017\uffe4\032\uffe4\036\uffe4\042\uffe4" +
    "\001\002\000\006\041\071\042\066\001\002\000\004\030" +
    "\144\001\002\000\014\005\056\010\045\017\uffe3\036\051" +
    "\042\047\001\002\000\020\005\uffe6\006\uffe6\010\uffe6\017" +
    "\uffe6\032\uffe6\036\uffe6\042\uffe6\001\002\000\004\040\147" +
    "\001\002\000\004\042\150\001\002\000\004\036\151\001" +
    "\002\000\020\005\ufff7\007\043\010\ufff7\017\ufff7\032\ufff7" +
    "\036\ufff7\042\ufff7\001\002\000\016\005\ufff6\010\ufff6\017" +
    "\ufff6\032\ufff6\036\ufff6\042\ufff6\001\002\000\004\040\154" +
    "\001\002\000\006\004\016\042\015\001\002\000\006\030" +
    "\ufff1\037\ufff1\001\002\000\004\002\ufffe\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\155\000\010\004\003\005\006\006\004\001\001\000" +
    "\002\001\001\000\010\004\155\005\006\006\004\001\001" +
    "\000\002\001\001\000\010\004\025\005\006\006\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\007\012" +
    "\010\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\022\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\011\031\015\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\011\035\015\033\001\001\000" +
    "\002\001\001\000\006\007\037\010\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\043\001\001\000" +
    "\002\001\001\000\024\013\052\014\056\016\057\022\047" +
    "\023\060\024\054\025\051\027\045\030\053\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\024\013\121\014\056\016\057\022\047\023\060\024" +
    "\054\025\051\027\045\030\053\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\017\064\020\066\027\063\030" +
    "\053\001\001\000\004\003\117\001\001\000\004\003\111" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\021\072\027\071\030\053\001\001\000\004" +
    "\002\105\001\001\000\004\002\100\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\027\104\030" +
    "\053\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\027\107\030\053\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\027\116\030\053\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\020\123\027\063\030\053\001\001\000\002" +
    "\001\001\000\022\014\125\016\057\022\047\023\060\024" +
    "\054\025\051\027\045\030\053\001\001\000\004\026\126" +
    "\001\001\000\002\001\001\000\022\014\130\016\057\022" +
    "\047\023\060\024\054\025\051\027\045\030\053\001\001" +
    "\000\002\001\001\000\010\021\132\027\071\030\053\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\021\142\027\071\030\053\001\001" +
    "\000\002\001\001\000\022\014\144\016\057\022\047\023" +
    "\060\024\054\025\051\027\045\030\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\151\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\007\154\010\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




  public void syntax_error(Symbol currToken) {
    System.out.println(
      "**** Error: syntax error" +
      " in line " + currToken.left +
      ", column " + currToken.right
    );
    System.exit(0);
  }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // Operator ::= SLASH 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operator",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // Operator ::= STAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operator",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // Operator ::= MINUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operator",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // Operator ::= PLUS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Operator",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // Expressions ::= INTLIT Operator INTLIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expressions",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // Expressions ::= Variable Operator Variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expressions",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // Expressions ::= Variable Operator INTLIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expressions",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // Expressions ::= Variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expressions",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // MatchSign ::= EQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // MatchSign ::= NE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // MatchSign ::= GT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // MatchSign ::= GE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // MatchSign ::= LE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // MatchSign ::= LT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MatchSign",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Ausdruck ::= INTLIT MatchSign Variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ausdruck",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Ausdruck ::= Variable MatchSign INTLIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ausdruck",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Ausdruck ::= INTLIT MatchSign INTLIT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ausdruck",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Ausdruck ::= Variable MatchSign Variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Ausdruck",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // RightHandSide ::= Expressions 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("RightHandSide",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // VariableArray ::= IDENT LBRACK Ausdruck RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VariableArray",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // VariableArray ::= VariableArray LBRACK Ausdruck RBRACK 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("VariableArray",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Variable ::= VariableArray 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Variable",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Variable ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Variable",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // LeftHandSide ::= Variable 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LeftHandSide",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // LeftHandSide ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LeftHandSide",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ProcCall ::= IDENT LPAREN IDENT RPAREN SEMIC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ProcCall",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // AssignStmt ::= LeftHandSide ASGN RightHandSide 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("AssignStmt",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // WhileStmt ::= WHILE LPAREN Ausdruck RPAREN Stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("WhileStmt",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // OptElse ::= ELSE Stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OptElse",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // OptElse ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("OptElse",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IfStmt ::= IF LPAREN Expressions RPAREN Stmt OptElse 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("IfStmt",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Stmt ::= SEMIC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Stmt ::= ProcCall 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Stmt ::= AssignStmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Stmt ::= WhileStmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Stmt ::= IfStmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Stmt",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // StmtList ::= Stmt StmtList 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // StmtList ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("StmtList",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Para ::= REF IDENT COLON Typ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Para",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Para ::= IDENT COLON Typ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Para",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Paralist ::= Para 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Paralist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Paralist ::= Para COMMA Paralist 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Paralist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Paralist ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Paralist",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Deklaration ::= VAR IDENT COLON IDENT SEMIC Deklaration 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Deklaration",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Deklaration ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Deklaration",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Prozedur ::= PROC IDENT LPAREN Paralist RPAREN LCURL Deklaration StmtList RCURL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Prozedur",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Array ::= ARRAY LBRACK INTLIT RBRACK OF IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Array",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Array ::= ARRAY LBRACK INTLIT RBRACK OF Array 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Array",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Typ ::= Array 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Typ",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Typ ::= IDENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Typ",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // TypV ::= TYPE IDENT EQ Typ SEMIC 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("TypV",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Program ::= Prozedur Program 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Program ::= TypV Program 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

