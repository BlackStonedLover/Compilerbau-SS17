/* The following code was generated by JFlex 1.4.1 on 31.05.17 17:22 */

/*
* scanner.jflex -- SPL scanner specification
*/

 import java_cup.runtime.*;
package parse;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 31.05.17 17:22 from the specification file
 * <tt>parse/scanner.jflex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 33, 34,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    33,  0,  0, 24,  0,  0,  0, 40, 25, 26, 22, 20, 32, 21,  0, 23, 
    37, 36, 36, 36, 36, 36, 36, 36, 36, 36, 19, 31, 16, 17, 18,  0, 
     0, 39, 39, 39, 39, 39, 39, 35, 35, 35, 35, 35, 35, 35, 35, 35, 
    35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 29, 41, 30,  0, 35, 
     0,  7, 39, 13, 39,  3,  2, 35, 10,  1, 35, 35,  4, 35, 42, 12, 
    11, 35,  8,  5, 15, 35,  6,  9, 38, 14, 35, 27,  0, 28,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\12\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\2\25\1\1\1\26"+
    "\6\2\1\27\1\2\1\30\1\31\1\32\1\24\3\0"+
    "\1\2\1\33\1\2\1\34\3\2\1\35\1\36\1\0"+
    "\1\37\2\2\1\40\1\41\1\42\1\43\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[67];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\u012d"+
    "\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\53\0\u022f\0\u025a"+
    "\0\53\0\53\0\53\0\u0285\0\53\0\53\0\53\0\53"+
    "\0\53\0\53\0\53\0\53\0\53\0\53\0\u02b0\0\u02db"+
    "\0\u0306\0\201\0\u0331\0\u035c\0\u0387\0\u03b2\0\u03dd\0\u0408"+
    "\0\201\0\u0433\0\53\0\53\0\53\0\u045e\0\u0489\0\u04b4"+
    "\0\u04df\0\u050a\0\201\0\u0535\0\201\0\u0560\0\u058b\0\u05b6"+
    "\0\u0489\0\53\0\u05e1\0\201\0\u060c\0\u0637\0\201\0\201"+
    "\0\53\0\201\0\201";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[67];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\4\1\6\1\7\1\10"+
    "\1\11\1\4\1\12\1\13\2\4\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\36"+
    "\1\4\1\37\1\40\2\4\1\41\1\2\1\4\54\0"+
    "\1\4\1\42\15\4\23\0\5\4\2\0\1\4\1\0"+
    "\17\4\23\0\5\4\2\0\1\4\1\0\3\4\1\43"+
    "\13\4\23\0\5\4\2\0\1\4\1\0\6\4\1\44"+
    "\10\4\23\0\5\4\2\0\1\4\1\0\7\4\1\45"+
    "\7\4\23\0\5\4\2\0\1\4\1\0\2\4\1\46"+
    "\14\4\23\0\5\4\2\0\1\4\1\0\11\4\1\47"+
    "\5\4\23\0\5\4\2\0\1\4\1\0\7\4\1\50"+
    "\7\4\23\0\5\4\2\0\1\4\1\0\1\4\1\51"+
    "\15\4\23\0\5\4\2\0\1\4\1\0\15\4\1\52"+
    "\1\4\23\0\5\4\2\0\1\4\21\0\1\53\52\0"+
    "\1\54\52\0\1\55\60\0\1\56\67\0\2\37\51\0"+
    "\2\37\1\57\4\0\42\60\1\0\6\60\1\61\1\60"+
    "\1\0\4\4\1\62\12\4\23\0\5\4\2\0\1\4"+
    "\1\0\7\4\1\63\7\4\23\0\5\4\2\0\1\4"+
    "\1\0\7\4\1\64\7\4\23\0\5\4\2\0\1\4"+
    "\1\0\1\4\1\65\15\4\23\0\5\4\2\0\1\4"+
    "\1\0\1\66\16\4\23\0\5\4\2\0\1\4\1\0"+
    "\13\4\1\67\3\4\23\0\5\4\2\0\1\4\1\0"+
    "\12\4\1\70\4\4\23\0\5\4\2\0\1\4\42\56"+
    "\1\0\10\56\2\0\2\71\3\0\1\71\5\0\1\71"+
    "\26\0\2\71\1\0\1\71\53\0\1\72\52\0\1\72"+
    "\1\0\1\73\1\0\2\4\1\74\14\4\23\0\5\4"+
    "\2\0\1\4\1\0\6\4\1\75\10\4\23\0\5\4"+
    "\2\0\1\4\1\0\3\4\1\76\13\4\23\0\5\4"+
    "\2\0\1\4\1\0\14\4\1\77\2\4\23\0\5\4"+
    "\2\0\1\4\1\0\2\4\1\100\14\4\23\0\5\4"+
    "\2\0\1\4\50\0\1\101\3\0\15\4\1\102\1\4"+
    "\23\0\5\4\2\0\1\4\1\0\2\4\1\103\14\4"+
    "\23\0\5\4\2\0\1\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1634];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\13\1\1\11\2\1\3\11\1\1\12\11"+
    "\14\1\3\11\1\1\3\0\10\1\1\11\1\0\5\1"+
    "\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[67];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

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
        s = "--RBRACK--";
        break;
        case sym.LT:
        s = "--LT--";
        break;
        case sym.NE:
        s ="--NE--";
        break;
        case sym.IDENT:
        s="--IDENT--";
        break;
        case sym.ASGN:
        s="--ASGN--";
        break;
        case sym.ELSE:
        s="--ELSE--";
        break;
        case sym.PLUS:
        s="--PLUS--";
        break;
        case sym.RPAREN:
        s="--RPAREN--";
        break;
        case sym.LCURL:
        s="--LCURL--";
        break;
        case sym.WHILE:
        s="--WHILE--";
        break;
        case sym.SLASH:
        s="--SLASH--";
        break;
        case sym.STAR:
        s="--STAR--";
        break;
        case sym.LBRACK:
        s="--LBRACK--";
        break;
        case sym.REF:
        s="--REF--";
        break;
        case sym.IF:
        s="--IF--";
        break;
        case sym.COLON:
        s="--COLON--";
        break;
        case sym.GT:
        s="--GT--";
        break;
        case sym.LPAREN:
        s="--LPAREN--";
        break;
        case sym.LE:
        s="--LE--";
        break;
        case sym.OF:
        s="--OF--";
        break;
        case sym.INTLIT:
        s="--INTLIT--";
        break;
        case sym.SEMIC:
        s="--SEMIC--";
        break;
        case sym.TYPE:
        s="--TYPE--";
        break;
        case sym.COMMA:
        s="--COMMA--";
        break;
        case sym.EOF:
        s="--EOF--";
        break;
        case sym.MINUS:
        s="--MINUS--";
        break;
        case sym.GE:
        s="--GE--";
        break;
        case sym.error:
        s="--error--";
        break;
        case sym.PROC:
        s="--PROC--";
        break;
        case sym.EQ:
        s="--EQ--";
        break;
        case sym.RCURL:
        s="--RCURL--";
        break;
        case sym.ARRAY:
        s="--ARRAY--";
        break;
        case sym.VAR:
        s="--VAR--";
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



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 23: 
          { return symbol(sym.OF);
          }
        case 37: break;
        case 18: 
          { return sym.SEMIC;
          }
        case 38: break;
        case 12: 
          { return symbol(sym.RPAREN);
          }
        case 39: break;
        case 32: 
          { return symbol(sym.PROC);
          }
        case 40: break;
        case 2: 
          { return symbol(sym.IDENT,yytext());
          }
        case 41: break;
        case 5: 
          { return symbol(sym.GT);
          }
        case 42: break;
        case 3: 
          { return symbol(sym.LT);
          }
        case 43: break;
        case 14: 
          { return symbol(sym.RCURL);
          }
        case 44: break;
        case 15: 
          { return symbol(sym.LCURL);
          }
        case 45: break;
        case 10: 
          { return symbol(sym.SLASH);
          }
        case 46: break;
        case 7: 
          { return symbol(sym.PLUS);
          }
        case 47: break;
        case 6: 
          { return sym.COLON;
          }
        case 48: break;
        case 35: 
          { return symbol(sym.ARRAY);
          }
        case 49: break;
        case 33: 
          { return symbol(sym.TYPE);
          }
        case 50: break;
        case 21: 
          { return symbol(sym.INTLIT,(int)yytext());
          }
        case 51: break;
        case 17: 
          { return symbol(sym.LBRACK);
          }
        case 52: break;
        case 31: 
          { return symbol(sym.ELSE);
          }
        case 53: break;
        case 27: 
          { return symbol(sym.VAR);
          }
        case 54: break;
        case 26: 
          { return symbol(sym.ASGN);
          }
        case 55: break;
        case 36: 
          { return symbol(sym.WHILE);
          }
        case 56: break;
        case 13: 
          { return symbol(sym.LPAREN);
          }
        case 57: break;
        case 9: 
          { return symbol(sym.STAR);
          }
        case 58: break;
        case 4: 
          { return symbol(sym.EQ);
          }
        case 59: break;
        case 28: 
          { return symbol(sym.REF);
          }
        case 60: break;
        case 30: 
          { return symbol(sym,INTLIT,Character.getNumericValue(yytext().charAt(1)) );
          }
        case 61: break;
        case 11: 
          { return symbol(sym.NE);
          }
        case 62: break;
        case 8: 
          { return symbol(sym.MINUS);
          }
        case 63: break;
        case 1: 
          { throw new RuntimeException(
                      "illegal character 0x" +
                      Integer.toString((int) yytext().charAt(0), 16) +
                      " in line " + (yyline + 1) +
                      ", column " + (yycolumn + 1)
                      );
          }
        case 64: break;
        case 25: 
          { return symbol(sym.GE);
          }
        case 65: break;
        case 29: 
          { return symbol(sym.INTLIT,Integer.parseInt(yytext().substring(2)));
          }
        case 66: break;
        case 34: 
          { return symbol(sym.INTLIT,10);
          }
        case 67: break;
        case 22: 
          { return symbol( sym.IF);
          }
        case 68: break;
        case 19: 
          { return symbol(sym.COMMA);
          }
        case 69: break;
        case 24: 
          { return symbol(sym.LE);
          }
        case 70: break;
        case 16: 
          { return symbol(sym.RBRACK);
          }
        case 71: break;
        case 20: 
          { 
          }
        case 72: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
