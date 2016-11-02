// Generated from gramatica.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(gramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(gramaticaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#metodo_main}.
	 * @param ctx the parse tree
	 */
	void enterMetodo_main(gramaticaParser.Metodo_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#metodo_main}.
	 * @param ctx the parse tree
	 */
	void exitMetodo_main(gramaticaParser.Metodo_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_metodo}.
	 * @param ctx the parse tree
	 */
	void enterExp_metodo(gramaticaParser.Exp_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_metodo}.
	 * @param ctx the parse tree
	 */
	void exitExp_metodo(gramaticaParser.Exp_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#conjunto_declare}.
	 * @param ctx the parse tree
	 */
	void enterConjunto_declare(gramaticaParser.Conjunto_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#conjunto_declare}.
	 * @param ctx the parse tree
	 */
	void exitConjunto_declare(gramaticaParser.Conjunto_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declare_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var(gramaticaParser.Declare_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declare_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var(gramaticaParser.Declare_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo_retorno}.
	 * @param ctx the parse tree
	 */
	void enterTipo_retorno(gramaticaParser.Tipo_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo_retorno}.
	 * @param ctx the parse tree
	 */
	void exitTipo_retorno(gramaticaParser.Tipo_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_for}.
	 * @param ctx the parse tree
	 */
	void enterExp_for(gramaticaParser.Exp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_for}.
	 * @param ctx the parse tree
	 */
	void exitExp_for(gramaticaParser.Exp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declare_var_atri}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_atri(gramaticaParser.Declare_var_atriContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declare_var_atri}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_atri(gramaticaParser.Declare_var_atriContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_comparacao}.
	 * @param ctx the parse tree
	 */
	void enterExp_comparacao(gramaticaParser.Exp_comparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_comparacao}.
	 * @param ctx the parse tree
	 */
	void exitExp_comparacao(gramaticaParser.Exp_comparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_incremento}.
	 * @param ctx the parse tree
	 */
	void enterExp_incremento(gramaticaParser.Exp_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_incremento}.
	 * @param ctx the parse tree
	 */
	void exitExp_incremento(gramaticaParser.Exp_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_alteracao}.
	 * @param ctx the parse tree
	 */
	void enterExp_alteracao(gramaticaParser.Exp_alteracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_alteracao}.
	 * @param ctx the parse tree
	 */
	void exitExp_alteracao(gramaticaParser.Exp_alteracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_while}.
	 * @param ctx the parse tree
	 */
	void enterExp_while(gramaticaParser.Exp_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_while}.
	 * @param ctx the parse tree
	 */
	void exitExp_while(gramaticaParser.Exp_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_if}.
	 * @param ctx the parse tree
	 */
	void enterExp_if(gramaticaParser.Exp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_if}.
	 * @param ctx the parse tree
	 */
	void exitExp_if(gramaticaParser.Exp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(gramaticaParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numero_id}.
	 * @param ctx the parse tree
	 */
	void enterNumero_id(gramaticaParser.Numero_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numero_id}.
	 * @param ctx the parse tree
	 */
	void exitNumero_id(gramaticaParser.Numero_idContext ctx);
}