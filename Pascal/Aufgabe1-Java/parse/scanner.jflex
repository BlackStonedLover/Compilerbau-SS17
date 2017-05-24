/*
 * scanner.jflex -- SPL scanner specification
 */
 
import java_cup.runtime.*;

package parse;


%%


%class Scanner
%public
%line
%column

%cup

%{

  private Symbol symbol(int type) {
    return new Symbol(type, yyline + 1, yycolumn + 1);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline + 1, yycolumn + 1, value);
  }

  public void showToken(Symbol token) {
    String s;
    switch (token.sym) {
      case sym.EOF:
        s = "-- EOF --";
        break;
	case sym.RBRACK:
        s = "-- RBRACK --";
        break;
	case sym.LT:
        s = "-- LT --";
        break;
	case sym.NE:
        s = "-- NE --";
        break;
	case sym.IDENT:
        s = "-- IDENT --";
        break;
	case sym.ASGN:
        s = "-- ASGN --";
        break;
	case sym.ELSE:
        s = "-- ELSE --";
        break;
	case sym.PLUS:
        s = "-- PLUS --";
        break;
	case sym.RPAREN:
        s = "-- RPAREN --";
        break;
	case sym.LCURL:
        s = "-- LCURL --";
        break;
	case sym.WHILE:
        s = "-- WHILE --";
        break;
	case sym.SLASH:
        s = "-- SLASH --";
        break;
	case sym.STAR:
        s = "-- STAR --";
        break;
	case sym.LBRACK:
        s = "-- LBRACK --";
        break;
	case sym.REF:
        s = "-- REF --";
        break;
	case sym.IF:
        s = "-- IF --";
        break;
	case sym.COLON:
        s = "-- COLON --";
        break;
	case sym.GT:
        s = "-- GT --";
        break;
	case sym.LPAREN:
        s = "-- LPAREN --";
        break;
	case sym.LE:
        s = "-- LE --";
        break;
	case sym.OF:
        s = "-- OF --";
        break;
	case sym.INTLIT:
        s = "-- INTLIT --";
        break;
	case sym.SEMIC:
        s = "-- SEMIC --";
        break;
	case sym.TYPE:
        s = "-- TYPE --";
        break;
	case sym.COMMA:
        s = "-- COMMA --";
        break;
	case sym.EOF:
        s = "-- MINUS --";
        break;
	case sym.GE:
        s = "-- GE --";
        break;
	case sym.error:
        s = "-- error --";
        break;
	case sym.PROC:
        s = "-- PROC --";
        break;
	case sym.EQ:
        s = "-- EQ --";
        break;
	case sym.RCURL:
        s = "-- RCURL --";
        break;
	case sym.ARRAY:
        s = "-- ARRAY --";
        break;
	case sym.VAR:
        s = "-- VAR --";
        break;
		
		
      default:
        /* this should never happen */
        throw new RuntimeException(
          "unknown token " + token.sym + " in showToken"
        );
    }
    System.out.println(
      "TOKEN = " + s +
      " in line " + token.left +
      ", column " + token.right
    );
  }

%}


%%

// Keywords

"if" {return symbol(sym.IF);}
"array" {return symbol(sym.Array);}
"else" {return symbol(sym.ELSE);}
"of" {return symbol(sym.of);}
"proc" {return symbol(sym.proc);}
"ref" {return symbol(sym.ref);}
"type" {return symbol(sym.var);}
"while" {return symbol(sym.while);}

//Operatoren

"<=" {return symbol(sym.LE);}
">=" {return symbol(sym.GE);}
":=" {return symbol(sym.ASGN);}
"(" {return symbol(sym.LPAREN);}
")" {return symbol(sym.RPAREN);}
"[" {return symbol(sym.LBRACK);}
"]" {return symbol(sym.RBRACK);}
"{" {return symbol(sym.LCURL);}
"}" {return symbol(sym.RCURL);}
"=" {return symbol(sym.EQ);}
"#" {return symbol(sym.NE);}
"<" {return symbol(sym.LT);}
">" {return symbol(sym.GT);}
":" {return symbol(sym.COLON);}
"," {return symbol(sym.COMMA);}
";" {return symbol(sym.SEMIC);}
"+" {return symbol(sym.PLUS);}
"-" {return symbol(sym.MINUS);}
"*" {return symbol(sym.STAR);}
"/" {return symbol(sym.SLASH);}


" " {} 
"/t" {}
"\n" {}
[0-9]+ {return symbol(sym.INTLIT,(int)yytext();}
0x[0-9a-fA-F]+ {return symbol(sym.INTLIT,parseInt(yytext).substring(2);}
[a-zA-Z_][0-9a-zA-Z_]* {return symbol(sym.IDENT,yytext());}
\/\/.* {}
\'\\n\' {return symbol(sym.INTLIT,10;(}
\'.\' {return symbol(sym.INTLIT,character.getNumericValue(yytext().charAt(1));}


.		{
		  throw new RuntimeException(
		    "illegal character 0x" +
		    Integer.toString((int) yytext().charAt(0), 16) +
		    " in line " + (yyline + 1) +
		    ", column " + (yycolumn + 1)
		  );
		}
