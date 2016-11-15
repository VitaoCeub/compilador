// Generated from gramatica.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OPERADORES_LOGICOS=17, 
		INCREMENTO=18, FIM_SENTENCA=19, COMPARACAO=20, ATRIBUICAO=21, OPERADOR_AD=22, 
		OPERADOR_MUL=23, TIPO_DIG=24, VISIBILIDADE=25, ID=26, NUMERO=27, WS=28;
	public static final int
		RULE_inicio = 0, RULE_exp = 1, RULE_metodo_main = 2, RULE_exp_metodo = 3, 
		RULE_conjunto_declare = 4, RULE_declare_var = 5, RULE_tipo_retorno = 6, 
		RULE_exp_for = 7, RULE_declare_var_atri = 8, RULE_exp_comparacao = 9, 
		RULE_exp_incremento = 10, RULE_exp_alteracao = 11, RULE_exp_while = 12, 
		RULE_exp_if = 13, RULE_operacao = 14, RULE_termo = 15, RULE_numero_id = 16;
	public static final String[] ruleNames = {
		"inicio", "exp", "metodo_main", "exp_metodo", "conjunto_declare", "declare_var", 
		"tipo_retorno", "exp_for", "declare_var_atri", "exp_comparacao", "exp_incremento", 
		"exp_alteracao", "exp_while", "exp_if", "operacao", "termo", "numero_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'public static void main'", "'(String args [])'", 
		"'(String [] args)'", "'('", "')'", "','", "'void'", "'for'", "'){'", 
		"'while ('", "'if ('", "'else'", "'else {'", null, null, "';'", null, 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "OPERADORES_LOGICOS", "INCREMENTO", "FIM_SENTENCA", 
		"COMPARACAO", "ATRIBUICAO", "OPERADOR_AD", "OPERADOR_MUL", "TIPO_DIG", 
		"VISIBILIDADE", "ID", "NUMERO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode VISIBILIDADE() { return getToken(gramaticaParser.VISIBILIDADE, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(VISIBILIDADE);
				setState(35);
				match(T__0);
				setState(36);
				match(ID);
				setState(37);
				match(T__1);
				setState(38);
				exp();
				setState(39);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public List<Exp_alteracaoContext> exp_alteracao() {
			return getRuleContexts(Exp_alteracaoContext.class);
		}
		public Exp_alteracaoContext exp_alteracao(int i) {
			return getRuleContext(Exp_alteracaoContext.class,i);
		}
		public List<Exp_metodoContext> exp_metodo() {
			return getRuleContexts(Exp_metodoContext.class);
		}
		public Exp_metodoContext exp_metodo(int i) {
			return getRuleContext(Exp_metodoContext.class,i);
		}
		public List<Declare_varContext> declare_var() {
			return getRuleContexts(Declare_varContext.class);
		}
		public Declare_varContext declare_var(int i) {
			return getRuleContext(Declare_varContext.class,i);
		}
		public List<Exp_incrementoContext> exp_incremento() {
			return getRuleContexts(Exp_incrementoContext.class);
		}
		public Exp_incrementoContext exp_incremento(int i) {
			return getRuleContext(Exp_incrementoContext.class,i);
		}
		public List<Exp_whileContext> exp_while() {
			return getRuleContexts(Exp_whileContext.class);
		}
		public Exp_whileContext exp_while(int i) {
			return getRuleContext(Exp_whileContext.class,i);
		}
		public List<Exp_ifContext> exp_if() {
			return getRuleContexts(Exp_ifContext.class);
		}
		public Exp_ifContext exp_if(int i) {
			return getRuleContext(Exp_ifContext.class,i);
		}
		public List<Exp_forContext> exp_for() {
			return getRuleContexts(Exp_forContext.class);
		}
		public Exp_forContext exp_for(int i) {
			return getRuleContext(Exp_forContext.class,i);
		}
		public List<Declare_var_atriContext> declare_var_atri() {
			return getRuleContexts(Declare_var_atriContext.class);
		}
		public Declare_var_atriContext declare_var_atri(int i) {
			return getRuleContext(Declare_var_atriContext.class,i);
		}
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public List<TerminalNode> FIM_SENTENCA() { return getTokens(gramaticaParser.FIM_SENTENCA); }
		public TerminalNode FIM_SENTENCA(int i) {
			return getToken(gramaticaParser.FIM_SENTENCA, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(44);
					exp_alteracao();
					}
					break;
				case 2:
					{
					setState(45);
					exp_metodo();
					}
					break;
				case 3:
					{
					setState(46);
					declare_var();
					}
					break;
				case 4:
					{
					setState(47);
					exp_incremento();
					}
					break;
				case 5:
					{
					setState(48);
					exp_while();
					}
					break;
				case 6:
					{
					setState(49);
					exp_if();
					}
					break;
				case 7:
					{
					setState(50);
					exp_for();
					}
					break;
				case 8:
					{
					setState(51);
					declare_var_atri();
					}
					break;
				case 9:
					{
					setState(52);
					operacao(0);
					setState(53);
					match(FIM_SENTENCA);
					}
					break;
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << TIPO_DIG) | (1L << VISIBILIDADE) | (1L << ID) | (1L << NUMERO))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metodo_mainContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Metodo_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMetodo_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMetodo_main(this);
		}
	}

	public final Metodo_mainContext metodo_main() throws RecognitionException {
		Metodo_mainContext _localctx = new Metodo_mainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metodo_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__3);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(61);
			match(T__1);
			setState(62);
			exp();
			setState(63);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_metodoContext extends ParserRuleContext {
		public TerminalNode VISIBILIDADE() { return getToken(gramaticaParser.VISIBILIDADE, 0); }
		public Tipo_retornoContext tipo_retorno() {
			return getRuleContext(Tipo_retornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Conjunto_declareContext conjunto_declare() {
			return getRuleContext(Conjunto_declareContext.class,0);
		}
		public Metodo_mainContext metodo_main() {
			return getRuleContext(Metodo_mainContext.class,0);
		}
		public Exp_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_metodo(this);
		}
	}

	public final Exp_metodoContext exp_metodo() throws RecognitionException {
		Exp_metodoContext _localctx = new Exp_metodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp_metodo);
		int _la;
		try {
			setState(78);
			switch (_input.LA(1)) {
			case VISIBILIDADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(VISIBILIDADE);
				setState(66);
				tipo_retorno();
				setState(67);
				match(ID);
				setState(68);
				match(T__6);
				setState(70);
				_la = _input.LA(1);
				if (_la==TIPO_DIG) {
					{
					setState(69);
					conjunto_declare();
					}
				}

				setState(72);
				match(T__7);
				setState(73);
				match(T__1);
				setState(74);
				exp();
				setState(75);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				metodo_main();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conjunto_declareContext extends ParserRuleContext {
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
		}
		public Conjunto_declareContext conjunto_declare() {
			return getRuleContext(Conjunto_declareContext.class,0);
		}
		public Conjunto_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterConjunto_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitConjunto_declare(this);
		}
	}

	public final Conjunto_declareContext conjunto_declare() throws RecognitionException {
		Conjunto_declareContext _localctx = new Conjunto_declareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conjunto_declare);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				declare_var();
				setState(81);
				match(T__8);
				setState(82);
				conjunto_declare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				declare_var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_varContext extends ParserRuleContext {
		public TerminalNode TIPO_DIG() { return getToken(gramaticaParser.TIPO_DIG, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode FIM_SENTENCA() { return getToken(gramaticaParser.FIM_SENTENCA, 0); }
		public Declare_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclare_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclare_var(this);
		}
	}

	public final Declare_varContext declare_var() throws RecognitionException {
		Declare_varContext _localctx = new Declare_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TIPO_DIG);
			setState(88);
			match(ID);
			setState(90);
			_la = _input.LA(1);
			if (_la==FIM_SENTENCA) {
				{
				setState(89);
				match(FIM_SENTENCA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_retornoContext extends ParserRuleContext {
		public TerminalNode TIPO_DIG() { return getToken(gramaticaParser.TIPO_DIG, 0); }
		public Tipo_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo_retorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo_retorno(this);
		}
	}

	public final Tipo_retornoContext tipo_retorno() throws RecognitionException {
		Tipo_retornoContext _localctx = new Tipo_retornoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==TIPO_DIG) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_forContext extends ParserRuleContext {
		public Declare_var_atriContext declare_var_atri() {
			return getRuleContext(Declare_var_atriContext.class,0);
		}
		public Exp_comparacaoContext exp_comparacao() {
			return getRuleContext(Exp_comparacaoContext.class,0);
		}
		public TerminalNode FIM_SENTENCA() { return getToken(gramaticaParser.FIM_SENTENCA, 0); }
		public Exp_incrementoContext exp_incremento() {
			return getRuleContext(Exp_incrementoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_for(this);
		}
	}

	public final Exp_forContext exp_for() throws RecognitionException {
		Exp_forContext _localctx = new Exp_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__10);
			setState(95);
			match(T__6);
			setState(96);
			declare_var_atri();
			setState(97);
			exp_comparacao();
			setState(98);
			match(FIM_SENTENCA);
			setState(99);
			exp_incremento();
			setState(100);
			match(T__11);
			setState(101);
			exp();
			setState(102);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_atriContext extends ParserRuleContext {
		public TerminalNode TIPO_DIG() { return getToken(gramaticaParser.TIPO_DIG, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(gramaticaParser.ATRIBUICAO, 0); }
		public TerminalNode FIM_SENTENCA() { return getToken(gramaticaParser.FIM_SENTENCA, 0); }
		public Numero_idContext numero_id() {
			return getRuleContext(Numero_idContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public Declare_var_atriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_atri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclare_var_atri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclare_var_atri(this);
		}
	}

	public final Declare_var_atriContext declare_var_atri() throws RecognitionException {
		Declare_var_atriContext _localctx = new Declare_var_atriContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declare_var_atri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TIPO_DIG);
			setState(105);
			match(ID);
			setState(106);
			match(ATRIBUICAO);
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107);
				numero_id();
				}
				break;
			case 2:
				{
				setState(108);
				operacao(0);
				}
				break;
			}
			setState(111);
			match(FIM_SENTENCA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_comparacaoContext extends ParserRuleContext {
		public List<Numero_idContext> numero_id() {
			return getRuleContexts(Numero_idContext.class);
		}
		public Numero_idContext numero_id(int i) {
			return getRuleContext(Numero_idContext.class,i);
		}
		public TerminalNode COMPARACAO() { return getToken(gramaticaParser.COMPARACAO, 0); }
		public Exp_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_comparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_comparacao(this);
		}
	}

	public final Exp_comparacaoContext exp_comparacao() throws RecognitionException {
		Exp_comparacaoContext _localctx = new Exp_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			numero_id();
			setState(114);
			match(COMPARACAO);
			setState(115);
			numero_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_incrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(gramaticaParser.INCREMENTO, 0); }
		public TerminalNode FIM_SENTENCA() { return getToken(gramaticaParser.FIM_SENTENCA, 0); }
		public Exp_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_incremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_incremento(this);
		}
	}

	public final Exp_incrementoContext exp_incremento() throws RecognitionException {
		Exp_incrementoContext _localctx = new Exp_incrementoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_incremento);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				setState(118);
				match(INCREMENTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				setState(120);
				match(INCREMENTO);
				setState(121);
				match(FIM_SENTENCA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_alteracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(gramaticaParser.ATRIBUICAO, 0); }
		public TerminalNode FIM_SENTENCA() { return getToken(gramaticaParser.FIM_SENTENCA, 0); }
		public Numero_idContext numero_id() {
			return getRuleContext(Numero_idContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public Exp_alteracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_alteracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_alteracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_alteracao(this);
		}
	}

	public final Exp_alteracaoContext exp_alteracao() throws RecognitionException {
		Exp_alteracaoContext _localctx = new Exp_alteracaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_alteracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(ATRIBUICAO);
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(126);
				numero_id();
				}
				break;
			case 2:
				{
				setState(127);
				operacao(0);
				}
				break;
			}
			setState(130);
			match(FIM_SENTENCA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_whileContext extends ParserRuleContext {
		public List<Exp_comparacaoContext> exp_comparacao() {
			return getRuleContexts(Exp_comparacaoContext.class);
		}
		public Exp_comparacaoContext exp_comparacao(int i) {
			return getRuleContext(Exp_comparacaoContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OPERADORES_LOGICOS() { return getToken(gramaticaParser.OPERADORES_LOGICOS, 0); }
		public Exp_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_while(this);
		}
	}

	public final Exp_whileContext exp_while() throws RecognitionException {
		Exp_whileContext _localctx = new Exp_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__12);
			setState(133);
			exp_comparacao();
			setState(136);
			_la = _input.LA(1);
			if (_la==OPERADORES_LOGICOS) {
				{
				setState(134);
				match(OPERADORES_LOGICOS);
				setState(135);
				exp_comparacao();
				}
			}

			setState(138);
			match(T__11);
			setState(139);
			exp();
			setState(140);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_ifContext extends ParserRuleContext {
		public List<Exp_comparacaoContext> exp_comparacao() {
			return getRuleContexts(Exp_comparacaoContext.class);
		}
		public Exp_comparacaoContext exp_comparacao(int i) {
			return getRuleContext(Exp_comparacaoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OPERADORES_LOGICOS() { return getToken(gramaticaParser.OPERADORES_LOGICOS, 0); }
		public Exp_ifContext exp_if() {
			return getRuleContext(Exp_ifContext.class,0);
		}
		public Exp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp_if(this);
		}
	}

	public final Exp_ifContext exp_if() throws RecognitionException {
		Exp_ifContext _localctx = new Exp_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__13);
			setState(143);
			exp_comparacao();
			setState(146);
			_la = _input.LA(1);
			if (_la==OPERADORES_LOGICOS) {
				{
				setState(144);
				match(OPERADORES_LOGICOS);
				setState(145);
				exp_comparacao();
				}
			}

			setState(148);
			match(T__11);
			setState(149);
			exp();
			setState(150);
			match(T__2);
			setState(153);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(151);
				match(T__14);
				setState(152);
				exp_if();
				}
			}

			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(155);
				match(T__15);
				setState(156);
				exp();
				setState(157);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode OPERADOR_AD() { return getToken(gramaticaParser.OPERADOR_AD, 0); }
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		return operacao(0);
	}

	private OperacaoContext operacao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacaoContext _localctx = new OperacaoContext(_ctx, _parentState);
		OperacaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_operacao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(162);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacao);
					setState(164);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(165);
					match(OPERADOR_AD);
					setState(166);
					termo(0);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public Numero_idContext numero_id() {
			return getRuleContext(Numero_idContext.class,0);
		}
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode OPERADOR_MUL() { return getToken(gramaticaParser.OPERADOR_MUL, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch (_input.LA(1)) {
			case ID:
			case NUMERO:
				{
				setState(173);
				numero_id();
				}
				break;
			case T__6:
				{
				setState(174);
				match(T__6);
				setState(175);
				operacao(0);
				setState(176);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termo);
					setState(180);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(181);
					match(OPERADOR_MUL);
					setState(182);
					numero_id();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Numero_idContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(gramaticaParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public Numero_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumero_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumero_id(this);
		}
	}

	public final Numero_idContext numero_id() throws RecognitionException {
		Numero_idContext _localctx = new Numero_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numero_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return operacao_sempred((OperacaoContext)_localctx, predIndex);
		case 15:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacao_sempred(OperacaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\5\6X\n\6\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\5\16\u008b\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u0095\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00a2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00aa\n\20"+
		"\f\20\16\20\u00ad\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b5\n\21"+
		"\3\21\3\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd\13\21\3\22\3\22\3\22"+
		"\2\4\36 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\7\b\4\2"+
		"\f\f\32\32\3\2\34\35\u00c7\2,\3\2\2\2\49\3\2\2\2\6=\3\2\2\2\bP\3\2\2\2"+
		"\nW\3\2\2\2\fY\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22j\3\2\2\2\24s\3\2\2\2"+
		"\26|\3\2\2\2\30~\3\2\2\2\32\u0086\3\2\2\2\34\u0090\3\2\2\2\36\u00a3\3"+
		"\2\2\2 \u00b4\3\2\2\2\"\u00be\3\2\2\2$%\7\33\2\2%&\7\3\2\2&\'\7\34\2\2"+
		"\'(\7\4\2\2()\5\4\3\2)*\7\5\2\2*-\3\2\2\2+-\5\4\3\2,$\3\2\2\2,+\3\2\2"+
		"\2-\3\3\2\2\2.:\5\30\r\2/:\5\b\5\2\60:\5\f\7\2\61:\5\26\f\2\62:\5\32\16"+
		"\2\63:\5\34\17\2\64:\5\20\t\2\65:\5\22\n\2\66\67\5\36\20\2\678\7\25\2"+
		"\28:\3\2\2\29.\3\2\2\29/\3\2\2\29\60\3\2\2\29\61\3\2\2\29\62\3\2\2\29"+
		"\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<"+
		"\3\2\2\2<\5\3\2\2\2=>\7\6\2\2>?\t\2\2\2?@\7\4\2\2@A\5\4\3\2AB\7\5\2\2"+
		"B\7\3\2\2\2CD\7\33\2\2DE\5\16\b\2EF\7\34\2\2FH\7\t\2\2GI\5\n\6\2HG\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\n\2\2KL\7\4\2\2LM\5\4\3\2MN\7\5\2\2NQ\3\2"+
		"\2\2OQ\5\6\4\2PC\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RS\5\f\7\2ST\7\13\2\2TU\5"+
		"\n\6\2UX\3\2\2\2VX\5\f\7\2WR\3\2\2\2WV\3\2\2\2X\13\3\2\2\2YZ\7\32\2\2"+
		"Z\\\7\34\2\2[]\7\25\2\2\\[\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^_\t\3\2\2_\17"+
		"\3\2\2\2`a\7\r\2\2ab\7\t\2\2bc\5\22\n\2cd\5\24\13\2de\7\25\2\2ef\5\26"+
		"\f\2fg\7\16\2\2gh\5\4\3\2hi\7\5\2\2i\21\3\2\2\2jk\7\32\2\2kl\7\34\2\2"+
		"lo\7\27\2\2mp\5\"\22\2np\5\36\20\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\7\25"+
		"\2\2r\23\3\2\2\2st\5\"\22\2tu\7\26\2\2uv\5\"\22\2v\25\3\2\2\2wx\7\34\2"+
		"\2x}\7\24\2\2yz\7\34\2\2z{\7\24\2\2{}\7\25\2\2|w\3\2\2\2|y\3\2\2\2}\27"+
		"\3\2\2\2~\177\7\34\2\2\177\u0082\7\27\2\2\u0080\u0083\5\"\22\2\u0081\u0083"+
		"\5\36\20\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7\25\2\2\u0085\31\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u008a"+
		"\5\24\13\2\u0088\u0089\7\23\2\2\u0089\u008b\5\24\13\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\16\2\2\u008d"+
		"\u008e\5\4\3\2\u008e\u008f\7\5\2\2\u008f\33\3\2\2\2\u0090\u0091\7\20\2"+
		"\2\u0091\u0094\5\24\13\2\u0092\u0093\7\23\2\2\u0093\u0095\5\24\13\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\16"+
		"\2\2\u0097\u0098\5\4\3\2\u0098\u009b\7\5\2\2\u0099\u009a\7\21\2\2\u009a"+
		"\u009c\5\34\17\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a1\3"+
		"\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\5\4\3\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\35\3\2\2"+
		"\2\u00a3\u00a4\b\20\1\2\u00a4\u00a5\5 \21\2\u00a5\u00ab\3\2\2\2\u00a6"+
		"\u00a7\f\4\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00aa\5 \21\2\u00a9\u00a6\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\21\1\2\u00af\u00b5\5\"\22"+
		"\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\n\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00bb\3\2"+
		"\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00ba\5\"\22\2\u00b9"+
		"\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc!\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf#\3\2"+
		"\2\2\23,9;HPW\\o|\u0082\u008a\u0094\u009b\u00a1\u00ab\u00b4\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}