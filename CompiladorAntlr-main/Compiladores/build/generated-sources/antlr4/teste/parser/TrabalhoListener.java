// Generated from C:\Users\vinic\Videos\Captures\CompiladorAntlr-main\Compiladores\grammar\teste\parser\Trabalho.g4 by ANTLR 4.6
 
package teste.parser;
import java.util.*;
import compiladores.Simbolo;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrabalhoParser}.
 */
public interface TrabalhoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrabalhoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TrabalhoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TrabalhoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(TrabalhoParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(TrabalhoParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputintvar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputintvar(TrabalhoParser.InputintvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputintvar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputintvar(TrabalhoParser.InputintvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputintvarexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputintvarexpr(TrabalhoParser.InputintvarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputintvarexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputintvarexpr(TrabalhoParser.InputintvarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputdoublevar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputdoublevar(TrabalhoParser.InputdoublevarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputdoublevar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputdoublevar(TrabalhoParser.InputdoublevarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputdoublevarexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputdoublevarexpr(TrabalhoParser.InputdoublevarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputdoublevarexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputdoublevarexpr(TrabalhoParser.InputdoublevarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputstringvarecpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputstringvarecpr(TrabalhoParser.InputstringvarecprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputstringvarecpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputstringvarecpr(TrabalhoParser.InputstringvarecprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputstringvar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputstringvar(TrabalhoParser.InputstringvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputstringvar}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputstringvar(TrabalhoParser.InputstringvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputexpr(TrabalhoParser.InputexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputexpr}
	 * labeled alternative in {@link TrabalhoParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputexpr(TrabalhoParser.InputexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrabalhoParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(TrabalhoParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrabalhoParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(TrabalhoParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprxsoma}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterEprxsoma(TrabalhoParser.EprxsomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprxsoma}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitEprxsoma(TrabalhoParser.EprxsomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprxmenos}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterEprxmenos(TrabalhoParser.EprxmenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprxmenos}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitEprxmenos(TrabalhoParser.EprxmenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprx}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterEprx(TrabalhoParser.EprxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprx}
	 * labeled alternative in {@link TrabalhoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitEprx(TrabalhoParser.EprxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprxdmulti}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterEprxdmulti(TrabalhoParser.EprxdmultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprxdmulti}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitEprxdmulti(TrabalhoParser.EprxdmultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprxdividir}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterEprxdividir(TrabalhoParser.EprxdividirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprxdividir}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitEprxdividir(TrabalhoParser.EprxdividirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eprxresto}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterEprxresto(TrabalhoParser.EprxrestoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eprxresto}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitEprxresto(TrabalhoParser.EprxrestoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr1expr2}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1expr2(TrabalhoParser.Expr1expr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr1expr2}
	 * labeled alternative in {@link TrabalhoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1expr2(TrabalhoParser.Expr1expr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exprparentes}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExprparentes(TrabalhoParser.ExprparentesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprparentes}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExprparentes(TrabalhoParser.ExprparentesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprnum}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExprnum(TrabalhoParser.ExprnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprnum}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExprnum(TrabalhoParser.ExprnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprvar}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExprvar(TrabalhoParser.ExprvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprvar}
	 * labeled alternative in {@link TrabalhoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExprvar(TrabalhoParser.ExprvarContext ctx);
}