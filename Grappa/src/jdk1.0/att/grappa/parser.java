/*
 *  This software may only be used by you under license from AT&T Corp.
 *  ("AT&T").  A copy of AT&T's Source Code Agreement is available at
 *  AT&T's Internet website having the URL:
 *  <http://www.research.att.com/sw/tools/graphviz/license/source.html>
 *  If you received this software without first entering into a license
 *  with AT&T, you have an infringing copy of this software and cannot use
 *  it without violating AT&T's intellectual property rights.
 */

//----------------------------------------------------
// The following code was generated by CUP v0.9e
// Fri Jan 09 14:17:55 EST 1998
//----------------------------------------------------

package att.grappa;

import java.io.*;
import java_cup.runtime.*;

public class parser extends java_cup.runtime.lr_parser {

  /** constructor */
  public parser() {super();}

  /** production table */
  protected static final short _production_table[][] = {
        {0, 2},     {21, 0},     {22, 0},     {1, 7},     {1, 1}, 
        {1, 0},     {18, 1},     {18, 2},     {18, 1},     {18, 2}, 
        {2, 1},     {2, 1},     {2, 1},     {3, 3},     {3, 0}, 
        {4, 0},     {4, 1},     {5, 3},     {6, 2},     {6, 0}, 
        {7, 1},     {8, 3},     {9, 1},     {9, 0},     {10, 1}, 
        {10, 2},     {11, 1},     {11, 2},     {12, 1},     {12, 1}, 
        {12, 1},     {12, 1},     {13, 2},     {13, 1},     {20, 1}, 
        {20, 3},     {23, 0},     {14, 3},     {24, 0},     {25, 0}, 
        {15, 5},     {26, 0},     {15, 4},     {19, 1},     {19, 1}, 
        {16, 2},     {27, 0},     {16, 4},     {16, 2},     {16, 3}, 
        {28, 0},     {17, 5},     {29, 0},     {17, 6},     {17, 2}
      };

  /** access to production table */
  public short[][] production_table() {return _production_table;}

  /** parse action table */
  protected static final short[][] _action_table = {
    /*0*/{0,-6,1,6,2,5,3,7,4,2,-1,0},
    /*1*/{18,-9,-1,0},
    /*2*/{18,11,-1,0},
    /*3*/{0,10,-1,0},
    /*4*/{18,-7,-1,0},
    /*5*/{0,-5,-1,0},
    /*6*/{2,9,4,8,-1,0},
    /*7*/{18,-10,-1,0},
    /*8*/{18,-8,-1,0},
    /*9*/{0,-1,-1,0},
    /*10*/{12,-2,-1,0},
    /*11*/{12,13,-1,0},
    /*12*/{2,-3,5,-3,6,-3,7,-3,13,-3,18,-3,-1,0},
    /*13*/{2,27,5,26,6,20,7,18,13,-24,18,24,-1,0},
    /*14*/{13,75,-1,0},
    /*15*/{2,-25,5,-25,6,-25,7,-25,13,-25,18,-25,-1,0},
    /*16*/{2,-27,5,-27,6,-27,7,-27,10,74,13,-27,18,-27,-1,0},
    /*17*/{12,66,18,65,-1,0},
    /*18*/{2,-31,5,-31,6,-31,7,-31,10,-31,13,-31,18,-31,-1,0},
    /*19*/{14,-13,-1,0},
    /*20*/{2,27,5,26,6,20,7,18,13,-23,18,24,-1,0},
    /*21*/{2,-34,5,-34,6,-34,7,-34,10,-34,13,-34,18,-34,-1,0},
    /*22*/{2,-30,5,-30,6,-30,7,-30,10,-30,13,-30,18,-30,-1,0},
    /*23*/{2,-35,5,-35,6,-35,7,-35,8,-35,9,-35,10,-35,13,-35,14,-35,16,55,17,39,18,-35,-1,0},
    /*24*/{14,47,-1,0},
    /*25*/{14,-12,-1,0},
    /*26*/{14,-11,-1,0},
    /*27*/{2,-29,5,-29,6,-29,7,-29,10,-29,13,-29,18,-29,-1,0},
    /*28*/{2,-37,5,-37,6,-37,7,-37,8,-39,9,-39,10,-37,13,-37,14,-37,18,-37,-1,0},
    /*29*/{2,-32,5,-32,6,-32,7,-32,8,31,9,34,10,-32,13,-32,18,-32,-1,0},
    /*30*/{7,-45,18,-45,-1,0},
    /*31*/{2,-42,5,-42,6,-42,7,-42,10,-42,13,-42,14,-42,18,-42,-1,0},
    /*32*/{7,18,18,36,-1,0},
    /*33*/{7,-44,18,-44,-1,0},
    /*34*/{2,-46,5,-46,6,-46,7,-46,8,-47,9,-47,10,-46,13,-46,14,-46,18,-46,-1,0},
    /*35*/{2,-35,5,-35,6,-35,7,-35,8,-35,9,-35,10,-35,13,-35,14,-35,17,39,18,-35,-1,0},
    /*36*/{2,-49,5,-49,6,-49,7,-49,8,31,9,34,10,-49,13,-49,14,-49,18,-49,-1,0},
    /*37*/{2,-50,5,-50,6,-50,7,-50,10,-50,13,-50,14,-50,18,-50,-1,0},
    /*38*/{18,40,-1,0},
    /*39*/{2,-36,5,-36,6,-36,7,-36,8,-36,9,-36,10,-36,13,-36,14,-36,18,-36,-1,0},
    /*40*/{8,31,9,34,-1,0},
    /*41*/{2,-48,5,-48,6,-48,7,-48,10,-48,13,-48,14,-48,18,-48,-1,0},
    /*42*/{2,-20,5,-20,6,-20,7,-20,10,-20,13,-20,14,-20,18,-20,-1,0},
    /*43*/{2,-21,5,-21,6,-21,7,-21,10,-21,13,-21,14,47,18,-21,-1,0},
    /*44*/{2,-43,5,-43,6,-43,7,-43,10,-43,13,-43,18,-43,-1,0},
    /*45*/{2,-19,5,-19,6,-19,7,-19,10,-19,13,-19,14,-19,18,-19,-1,0},
    /*46*/{15,-15,18,48,-1,0},
    /*47*/{16,55,-1,0},
    /*48*/{11,52,15,-16,18,-16,-1,0},
    /*49*/{15,51,-1,0},
    /*50*/{2,-18,5,-18,6,-18,7,-18,10,-18,13,-18,14,-18,18,-18,-1,0},
    /*51*/{15,-17,18,-17,-1,0},
    /*52*/{15,-15,18,48,-1,0},
    /*53*/{15,-14,-1,0},
    /*54*/{18,56,-1,0},
    /*55*/{2,-22,5,-22,6,-22,7,-22,10,-22,11,-22,13,-22,15,-22,18,-22,-1,0},
    /*56*/{8,31,9,34,-1,0},
    /*57*/{2,-20,5,-20,6,-20,7,-20,10,-20,13,-20,14,-20,18,-20,-1,0},
    /*58*/{2,-38,5,-38,6,-38,7,-38,10,-38,13,-38,18,-38,-1,0},
    /*59*/{2,-40,5,-40,6,-40,7,-40,10,-40,13,-40,14,-40,18,-40,-1,0},
    /*60*/{2,-20,5,-20,6,-20,7,-20,10,-20,13,-20,14,-20,18,-20,-1,0},
    /*61*/{2,-41,5,-41,6,-41,7,-41,10,-41,13,-41,18,-41,-1,0},
    /*62*/{2,-33,5,-33,6,-33,7,-33,10,-33,13,-33,18,-33,-1,0},
    /*63*/{2,-26,5,-26,6,-26,7,-26,13,-26,18,-26,-1,0},
    /*64*/{2,-55,5,-55,6,-55,7,-55,8,-55,9,-55,10,-55,12,70,13,-55,14,-55,18,-55,-1,0},
    /*65*/{2,-51,5,-51,6,-51,7,-51,13,-51,18,-51,-1,0},
    /*66*/{2,27,5,26,6,20,7,18,13,-24,18,24,-1,0},
    /*67*/{13,69,-1,0},
    /*68*/{2,-52,5,-52,6,-52,7,-52,8,-52,9,-52,10,-52,13,-52,14,-52,18,-52,-1,0},
    /*69*/{2,-53,5,-53,6,-53,7,-53,13,-53,18,-53,-1,0},
    /*70*/{2,27,5,26,6,20,7,18,13,-24,18,24,-1,0},
    /*71*/{13,73,-1,0},
    /*72*/{2,-54,5,-54,6,-54,7,-54,8,-54,9,-54,10,-54,13,-54,14,-54,18,-54,-1,0},
    /*73*/{2,-28,5,-28,6,-28,7,-28,13,-28,18,-28,-1,0},
    /*74*/{0,-4,-1,0},
  };

  /** access to parse action table */
  public short[][] action_table() {return _action_table;}

  /** reduce_goto table */
  protected static final short[][] _reduce_table = {
    /*0*/{1,3,18,2,-1,-1},
    /*1*/{-1,-1},
    /*2*/{-1,-1},
    /*3*/{-1,-1},
    /*4*/{-1,-1},
    /*5*/{-1,-1},
    /*6*/{-1,-1},
    /*7*/{-1,-1},
    /*8*/{-1,-1},
    /*9*/{-1,-1},
    /*10*/{21,11,-1,-1},
    /*11*/{-1,-1},
    /*12*/{22,13,-1,-1},
    /*13*/{2,24,8,21,9,14,10,20,11,15,12,16,13,18,14,27,15,22,17,29,20,28,-1,-1},
    /*14*/{-1,-1},
    /*15*/{-1,-1},
    /*16*/{-1,-1},
    /*17*/{-1,-1},
    /*18*/{-1,-1},
    /*19*/{-1,-1},
    /*20*/{2,24,8,21,11,63,12,16,13,18,14,27,15,22,17,29,20,28,-1,-1},
    /*21*/{-1,-1},
    /*22*/{-1,-1},
    /*23*/{-1,-1},
    /*24*/{5,62,-1,-1},
    /*25*/{-1,-1},
    /*26*/{-1,-1},
    /*27*/{-1,-1},
    /*28*/{23,57,24,56,-1,-1},
    /*29*/{16,31,19,32,-1,-1},
    /*30*/{-1,-1},
    /*31*/{26,42,-1,-1},
    /*32*/{17,36,20,34,-1,-1},
    /*33*/{-1,-1},
    /*34*/{27,40,-1,-1},
    /*35*/{-1,-1},
    /*36*/{16,37,19,32,-1,-1},
    /*37*/{-1,-1},
    /*38*/{-1,-1},
    /*39*/{-1,-1},
    /*40*/{16,41,19,32,-1,-1},
    /*41*/{-1,-1},
    /*42*/{6,43,7,44,-1,-1},
    /*43*/{5,45,-1,-1},
    /*44*/{-1,-1},
    /*45*/{-1,-1},
    /*46*/{3,49,8,48,-1,-1},
    /*47*/{-1,-1},
    /*48*/{4,52,-1,-1},
    /*49*/{-1,-1},
    /*50*/{-1,-1},
    /*51*/{-1,-1},
    /*52*/{3,53,8,48,-1,-1},
    /*53*/{-1,-1},
    /*54*/{-1,-1},
    /*55*/{-1,-1},
    /*56*/{16,59,19,32,-1,-1},
    /*57*/{6,43,7,58,-1,-1},
    /*58*/{-1,-1},
    /*59*/{25,60,-1,-1},
    /*60*/{6,43,7,61,-1,-1},
    /*61*/{-1,-1},
    /*62*/{-1,-1},
    /*63*/{-1,-1},
    /*64*/{-1,-1},
    /*65*/{28,66,-1,-1},
    /*66*/{2,24,8,21,9,67,10,20,11,15,12,16,13,18,14,27,15,22,17,29,20,28,-1,-1},
    /*67*/{-1,-1},
    /*68*/{-1,-1},
    /*69*/{29,70,-1,-1},
    /*70*/{2,24,8,21,9,71,10,20,11,15,12,16,13,18,14,27,15,22,17,29,20,28,-1,-1},
    /*71*/{-1,-1},
    /*72*/{-1,-1},
    /*73*/{-1,-1},
    /*74*/{-1,-1},
  };

  /** access to reduce_goto table */
  public short[][] reduce_table() {return _reduce_table;}

  /** instance of action encapsulation class */
  protected CUP$actions action_obj;

  /** action encapsulation object initializer */
  protected void init_actions()
    {
      action_obj = new CUP$actions();
    }

  /** invoke a user supplied parse action */
  public java_cup.runtime.symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$do_action(act_num, parser, stack, top);
  }

  /** start state */
  public int start_state() {return 0;}
  /** start production */
  public int start_production() {return 0;}

  /** EOF symbol index */
  public int EOF_sym() {return 0;}

  /** error symbol index */
  public int error_sym() {return 1;}


  /** user initialization */
  public void user_init() throws java.lang.Exception
    {

  mylexer.init();
  action_obj.dotGraph = theGraph;

    }

  /** scan to get the next token */
  public java_cup.runtime.token scan()
    throws java.lang.Exception
    {
 return mylexer.next_token(debugLevel); 
    }


  private DotGraph theGraph = null;
  private InputStream inStream;
  private PrintStream errStream;
  private lexer mylexer;
  private int debugLevel = 0;

  public parser (InputStream inputStream, PrintStream errorStream, DotGraph graph) {
    super ();
    inStream = inputStream;
    errStream = errorStream;
    theGraph = graph;
    mylexer = new lexer (inputStream, errorStream);
  }

  public parser (InputStream inputStream, PrintStream errorStream) {
    this(inputStream,errorStream,null);
  }

  public parser (InputStream inputStream) {
    this(inputStream,null,null);
  }

  public PrintStream getErrorStream() {
    return(errStream);
  }

  public int getDebugLevel() {
    return(debugLevel);
  }

  public void report_error(String message, Object info) {
    if(errStream != null) {
      errStream.println("ERROR: parser: " + message);
    }
    throw new GraphParserException(message);
  }

  public void report_warning(String message, Object info) {
    if(errStream != null) {
      errStream.println("WARNING: parser: " + message);
    }
  }

  public void debug_message(String message) {
    debug_message(5, message);
  }

  public void debug_message(int level, String message) {
    if(debugLevel < level) {
      return;
    }
    if(errStream != null) {
      errStream.println("DEBUG: parser: " + message);
    }
  }

  public void debug_parse(int debug) throws java.lang.Exception {
    if(debug == 0) {
      parse();
      return;
    }

    debugLevel = debug;

    // the current action code 
    int act;

    // the symbol/stack element returned by a reduce 
    symbol lhs_sym;

    // information about production being reduced with 
    short handle_size, lhs_sym_num;

    // set up direct reference to tables to drive the parser 
    production_tab = production_table();
    action_tab = action_table();
    reduce_tab = reduce_table();

    debug_message(5, "# Initializing parser");

    // initialize the action encapsulation object 
    init_actions();

    // do user initialization 
    user_init();

    // the current token 
    cur_token = scan();

    debug_message(5, "# Current token is #" + cur_token.sym);

    // push dummy symbol with start state to get us underway 
    stack.push(new symbol(0, start_state()));
    tos = 0;

    // continue until we are told to stop 
    for (_done_parsing = false; !_done_parsing;) {
      // current state is always on the top of the stack 

      // look up action out of the current state with the current input 
      act = get_action(((symbol) stack.peek()).parse_state, cur_token.sym);

      // decode the action -- > 0 encodes shift 
      if (act > 0) {
	// shift to the encoded state by pushing it on the stack 
	cur_token.parse_state = act - 1;
	debug_shift(cur_token);
	stack.push(cur_token);
	tos++;

	// advance to the next token 
	cur_token = scan();
	debug_message(5, "# Current token is #" + cur_token.sym);
      }
      // if its less than zero, then it encodes a reduce action 
      else if (act < 0) {
	// perform the action for the reduce 
	lhs_sym = do_action((-act) - 1, this, stack, tos);

	// look up information about the production 
	lhs_sym_num = production_tab[(-act) - 1][0];
	handle_size = production_tab[(-act) - 1][1];

	debug_reduce((-act) - 1, lhs_sym_num, handle_size);

	// pop the handle off the stack 
	for (int i = 0; i < handle_size; i++) {
	  stack.pop();
	  tos--;
	}

	// look up the state to go to from the one popped back to 
	act = get_reduce(((symbol) stack.peek()).parse_state, lhs_sym_num);

	// shift to that state 
	lhs_sym.parse_state = act;
	stack.push(lhs_sym);
	tos++;

	debug_message(5, "# Goto state #" + act);
      }
      // finally if the entry is zero, we have an error 
      else if (act == 0) {
	// call user syntax error reporting routine 
	syntax_error(cur_token);

	// try to error recover 
	if (!error_recovery(true)) {
	  // if that fails give up with a fatal syntax error 
	  unrecovered_syntax_error(cur_token);

	  // just in case that wasn't fatal enough, end parse 
	  done_parsing();
	}
      }
    }
  }

  public CUP$actions getActionObject () {
    return action_obj;
  }

  public DotGraph getGraph () {
    return action_obj.dotGraph;
  }

};

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$actions {


  DotSubgraph rootSubgraph;
  DotGraph    dotGraph;
  DotSubgraph thisGraph;
  DotNode     thisNode;
  DotEdge     thisEdge;
  DotNode     fromNode;
  DotNode     toNode;
  String      portName;
  String      toPortName;
  String      fromPortName;
  int         thisAttrType;
  int         thisElemType;
  String      graphType;
  private int anon_id = 0;


  /** Constructor */
  CUP$actions() { }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.symbol CUP$do_action(
    int                        CUP$act_num,
    java_cup.runtime.lr_parser CUP$parser,
    java.util.Stack            CUP$stack,
    int                        CUP$top)
    throws java.lang.Exception
    {
      /* object for return from actions */
      java_cup.runtime.symbol CUP$result;

      /* select the action based on the action number */
      switch (CUP$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // subg_stmt ::= SUBGRAPH ID 
            {
              CUP$result = new symbol(/*subg_stmt*/17);
              
		thisGraph = new DotSubgraph(thisGraph, (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
                ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + thisGraph.getName() + ")");
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // subg_stmt ::= SUBGRAPH ID LCUR NT$8 stmt_list RCUR 
            {
              CUP$result = new symbol(/*subg_stmt*/17);
              
		// getSubgraph() gets the parent subgraph
		thisGraph = thisGraph.getSubgraph();
                ((parser)(CUP$parser)).debug_message(1, "Creating subgraph in subgraph (" + thisGraph.getName() + ")...");
                ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + thisGraph.getName() + ")");
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // NT$8 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$8*/29);
              
		thisGraph = new DotSubgraph(thisGraph, (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-1)).str_val);
                ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + thisGraph.getName() + ")");
		thisElemType = Grappa.DOT_GRAPH;
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // subg_stmt ::= SUBGRAPH LCUR NT$7 stmt_list RCUR 
            {
              CUP$result = new symbol(/*subg_stmt*/17);
              
		// getSubgraph() gets the parent subgraph
		thisGraph = thisGraph.getSubgraph();
                ((parser)(CUP$parser)).debug_message(1, "Creating subgraph in subgraph (" + thisGraph.getName() + ")...");
                ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + thisGraph.getName() + ")");
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // NT$7 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$7*/28);
              
		String anon = att.grappa.Grappa.ANONYMOUS_PREFIX + anon_id++;
		thisGraph = new DotSubgraph(thisGraph, anon);
                ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + thisGraph.getName() + ")");
		thisElemType = Grappa.DOT_GRAPH;
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // edgeRHS ::= edgeOP subg_stmt edgeRHS 
            {
              CUP$result = new symbol(/*edgeRHS*/16);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // edgeRHS ::= edgeOP subg_stmt 
            {
              CUP$result = new symbol(/*edgeRHS*/16);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // edgeRHS ::= edgeOP node_id NT$6 edgeRHS 
            {
              CUP$result = new symbol(/*edgeRHS*/16);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // NT$6 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$6*/27);
              
	       if((toNode = rootSubgraph.findNodeByName((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val)) == null) {
		 toNode = new DotNode(thisGraph, (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
	       }
	       if(portName == null) {
		 toPortName = null;
	       } else {
		 toPortName = new String(portName);
	       }
	       thisEdge = new DotEdge(thisGraph, fromNode, fromPortName, toNode, toPortName);
               ((parser)(CUP$parser)).debug_message(1, "thisEdge(" + thisEdge.getName() + ")");
	       fromNode = toNode;
	       fromPortName = toPortName;
             
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // edgeRHS ::= edgeOP node_id 
            {
              CUP$result = new symbol(/*edgeRHS*/16);
              
	       if((toNode = rootSubgraph.findNodeByName((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val)) == null) {
                 ((parser)(CUP$parser)).debug_message(1, "Creating node in subgraph (" + thisGraph.getName() + ")...");
		 toNode = new DotNode(thisGraph, (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
	       }
               ((parser)(CUP$parser)).debug_message(1, "toNode(" + toNode.getName() + ")");
	       if(portName == null) {
		 toPortName = null;
	       } else {
		 toPortName = new String(portName);
	       }
	       thisEdge = new DotEdge(thisGraph, fromNode, fromPortName, toNode, toPortName);
               ((parser)(CUP$parser)).debug_message(1, "Creating edge in subgraph (" + thisGraph.getName() + ")...");
               ((parser)(CUP$parser)).debug_message(1, "thisEdge(" + thisEdge.getName() + ")");
             
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // edgeOP ::= ND_EDGE_OP 
            {
              CUP$result = new str_token(/*edgeOP*/19);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // edgeOP ::= D_EDGE_OP 
            {
              CUP$result = new str_token(/*edgeOP*/19);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // edge_stmt ::= subg_stmt edgeRHS NT$5 opt_attr_list 
            {
              CUP$result = new symbol(/*edge_stmt*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // NT$5 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$5*/26);
              
		   thisElemType = Grappa.DOT_EDGE;
                 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // edge_stmt ::= node_id NT$3 edgeRHS NT$4 opt_attr_list 
            {
              CUP$result = new symbol(/*edge_stmt*/15);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // NT$4 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$4*/25);
              
		 thisElemType = Grappa.DOT_EDGE;
               
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // NT$3 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$3*/24);
              
		 if((fromNode = rootSubgraph.findNodeByName((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val)) == null) {
                   ((parser)(CUP$parser)).debug_message(1, "Creating node in subgraph (" + thisGraph.getName() + ")...");
		   fromNode = new DotNode(thisGraph, (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
		 }
                 ((parser)(CUP$parser)).debug_message(1, "fromNode(" + fromNode.getName() + ")");
		 if(portName == null) {
		   fromPortName = null;
		 } else {
		   fromPortName = new String(portName);
		 }
               
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // node_stmt ::= node_id NT$2 opt_attr_list 
            {
              CUP$result = new symbol(/*node_stmt*/14);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // NT$2 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$2*/23);
              
		 if((thisNode = rootSubgraph.findNodeByName((/*node_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val)) == null) {
                   ((parser)(CUP$parser)).debug_message(1, "Creating node in subgraph (" + thisGraph.getName() + ")...");
		   thisNode = new DotNode(thisGraph, (/*node_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val);
		 } else {
                   ((parser)(CUP$parser)).debug_message(1, "Node already in subgraph (" + thisNode.getSubgraph().getName() + ")...");
		   // thisNode.setSubgraph(thisGraph);
		 }
                 ((parser)(CUP$parser)).debug_message(1, "thisNode(" + thisNode.getName() + ")");
		 thisElemType = Grappa.DOT_NODE;
               
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // node_id ::= ID COLON ID 
            {
              CUP$result = new str_token(/*node_id*/20);
              
	      ((str_token)CUP$result).str_val = (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val;
	      portName = (/*port_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
	    
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // node_id ::= ID 
            {
              CUP$result = new str_token(/*node_id*/20);
              
	      ((str_token)CUP$result).str_val = (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val;
	      portName = null;
	    
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // attr_stmt ::= attr_set 
            {
              CUP$result = new symbol(/*attr_stmt*/13);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // attr_stmt ::= attr_class attr_list 
            {
              CUP$result = new symbol(/*attr_stmt*/13);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // stmt1 ::= subg_stmt 
            {
              CUP$result = new symbol(/*stmt1*/12);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // stmt1 ::= attr_stmt 
            {
              CUP$result = new symbol(/*stmt1*/12);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // stmt1 ::= edge_stmt 
            {
              CUP$result = new symbol(/*stmt1*/12);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // stmt1 ::= node_stmt 
            {
              CUP$result = new symbol(/*stmt1*/12);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // stmt ::= stmt1 SEMI 
            {
              CUP$result = new symbol(/*stmt*/11);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // stmt ::= stmt1 
            {
              CUP$result = new symbol(/*stmt*/11);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // stmt_list1 ::= stmt_list1 stmt 
            {
              CUP$result = new symbol(/*stmt_list1*/10);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // stmt_list1 ::= stmt 
            {
              CUP$result = new symbol(/*stmt_list1*/10);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // stmt_list ::= 
            {
              CUP$result = new symbol(/*stmt_list*/9);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // stmt_list ::= stmt_list1 
            {
              CUP$result = new symbol(/*stmt_list*/9);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // attr_set ::= ID EQUAL ID 
            {
              CUP$result = new symbol(/*attr_set*/8);
              
		switch(thisElemType) {
		case Grappa.DOT_GRAPH:
		  switch(thisAttrType) {
		  case Grappa.DOT_GRAPH:
                    ((parser)(CUP$parser)).debug_message(1, "Setting graph attribute of graph (" + thisGraph.getName() + ")...");
		    thisGraph.setGraphAttribute(new Attribute((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,(/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
		    break;
		  case Grappa.DOT_NODE:
                    ((parser)(CUP$parser)).debug_message(1, "Setting node attribute of graph (" + thisGraph.getName() + ")...");
		    thisGraph.setNodeAttribute(new Attribute((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,(/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
		    break;
		  case Grappa.DOT_EDGE:
                    ((parser)(CUP$parser)).debug_message(1, "Setting edge attribute of graph (" + thisGraph.getName() + ")...");
		    thisGraph.setEdgeAttribute(new Attribute((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,(/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
		    break;
		  }
		  break;
		case Grappa.DOT_NODE:
                  ((parser)(CUP$parser)).debug_message(1, "Setting attribute of node (" + thisNode.getName() + ")...");
		  thisNode.setAttribute(new Attribute((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,(/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
		  break;
		case Grappa.DOT_EDGE:
                  ((parser)(CUP$parser)).debug_message(1, "Setting attribute of edge (" + thisEdge.getName() + ")...");
		  thisEdge.setAttribute(new Attribute((/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val,(/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val));
		  break;
		}
                ((parser)(CUP$parser)).debug_message(1, "attribute(" + (/*id_name*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val + "," + (/*id_val*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val + ")");
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // opt_attr_list ::= rec_attr_list 
            {
              CUP$result = new symbol(/*opt_attr_list*/7);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // rec_attr_list ::= 
            {
              CUP$result = new symbol(/*rec_attr_list*/6);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // rec_attr_list ::= rec_attr_list attr_list 
            {
              CUP$result = new symbol(/*rec_attr_list*/6);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // attr_list ::= LBR inside_attr_list RBR 
            {
              CUP$result = new symbol(/*attr_list*/5);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // optcomma ::= COMMA 
            {
              CUP$result = new symbol(/*optcomma*/4);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // optcomma ::= 
            {
              CUP$result = new symbol(/*optcomma*/4);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // inside_attr_list ::= 
            {
              CUP$result = new symbol(/*inside_attr_list*/3);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // inside_attr_list ::= attr_set optcomma inside_attr_list 
            {
              CUP$result = new symbol(/*inside_attr_list*/3);
              
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // attr_class ::= EDGE 
            {
              CUP$result = new symbol(/*attr_class*/2);
               thisAttrType = Grappa.DOT_EDGE; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // attr_class ::= NODE 
            {
              CUP$result = new symbol(/*attr_class*/2);
               thisAttrType = Grappa.DOT_NODE; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // attr_class ::= GRAPH 
            {
              CUP$result = new symbol(/*attr_class*/2);
               thisAttrType = Grappa.DOT_GRAPH; 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // graph_type ::= STRICT DIGRAPH 
            {
              CUP$result = new str_token(/*graph_type*/18);
              
                   graphType = "strict digraph";
                 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // graph_type ::= DIGRAPH 
            {
              CUP$result = new str_token(/*graph_type*/18);
              
                   graphType = "digraph";
                 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // graph_type ::= STRICT GRAPH 
            {
              CUP$result = new str_token(/*graph_type*/18);
              
                   graphType = "strict graph";
                 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // graph_type ::= GRAPH 
            {
              CUP$result = new str_token(/*graph_type*/18);
              
                   graphType = "graph";
                 
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // file ::= 
            {
              CUP$result = new symbol(/*file*/1);
              
             dotGraph = new DotGraph("empty", "digraph");
             ((parser)(CUP$parser)).report_warning ("The graph to parse is empty.", null);
           
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // file ::= error 
            {
              CUP$result = new symbol(/*file*/1);
              
             CUP$parser.report_error ("An error was encountered while graph parsing.", null);
           
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // file ::= graph_type ID NT$0 LCUR NT$1 stmt_list RCUR 
            {
              CUP$result = new symbol(/*file*/1);
              
             parser thisParser = ((parser)(CUP$parser));
             int level = 1;

             if(thisParser.getErrorStream() != null && thisParser.getDebugLevel() >= level) {
               
               thisParser.debug_message(level, "parsed graph follows:");
               rootSubgraph.printSubgraph(thisParser.getErrorStream());
             }
           
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$1 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$1*/22);
              
	     thisGraph = rootSubgraph;
	     thisElemType = Grappa.DOT_GRAPH;
             ((parser)(CUP$parser)).debug_message(1, "thisGraph(" + (/*graph_id*/(str_token)CUP$stack.elementAt(CUP$top-2)).str_val + ")");
           
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              CUP$result = new java_cup.runtime.token(/*NT$0*/21);
              
	     if(dotGraph == null) {
	       dotGraph = new DotGraph((/*graph_id*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, graphType);
	     } else {
	       dotGraph.reset((/*graph_id*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val, graphType);
	     }
	     rootSubgraph = dotGraph.getRoot();
             ((parser)(CUP$parser)).debug_message(1, "Creating top level graph (" + (/*graph_id*/(str_token)CUP$stack.elementAt(CUP$top-0)).str_val + ")");
           
            }
          return CUP$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= file EOF 
            {
              CUP$result = new java_cup.runtime.token(/*$START*/0);
              
            }
          /* ACCEPT */
          CUP$parser.done_parsing();
          return CUP$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
};
