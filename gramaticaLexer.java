// Generated from gramatica.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, OPERADORES_LOGICOS=17, 
		INCREMENTO=18, FIM_SENTENCA=19, COMPARACAO=20, ATRIBUICAO=21, OPERADOR_AD=22, 
		OPERADOR_MUL=23, TIPO_DIG=24, VISIBILIDADE=25, ID=26, NUMERO=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "OPERADORES_LOGICOS", 
		"INCREMENTO", "FIM_SENTENCA", "COMPARACAO", "ATRIBUICAO", "OPERADOR_AD", 
		"OPERADOR_MUL", "TIPO_DIG", "VISIBILIDADE", "ID", "NUMERO", "WS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u010b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00af\n\22\3\23"+
		"\3\23\3\23\3\23\5\23\u00b5\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00c2\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d8"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\33\6\33"+
		"\u00f3\n\33\r\33\16\33\u00f4\3\34\6\34\u00f8\n\34\r\34\16\34\u00f9\3\34"+
		"\3\34\3\34\6\34\u00ff\n\34\r\34\16\34\u0100\5\34\u0103\n\34\3\35\6\35"+
		"\u0106\n\35\r\35\16\35\u0107\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\4\2>>@@\4\2--//\4\2,,\61"+
		"\61\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2"+
		"\tE\3\2\2\2\13]\3\2\2\2\rn\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23"+
		"\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u008a\3\2\2\2\31\u008e\3\2\2\2\33\u0091"+
		"\3\2\2\2\35\u0099\3\2\2\2\37\u009e\3\2\2\2!\u00a3\3\2\2\2#\u00ae\3\2\2"+
		"\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2-\u00c5"+
		"\3\2\2\2/\u00c7\3\2\2\2\61\u00d7\3\2\2\2\63\u00ef\3\2\2\2\65\u00f2\3\2"+
		"\2\2\67\u0102\3\2\2\29\u0105\3\2\2\2;<\7e\2\2<=\7n\2\2=>\7c\2\2>?\7u\2"+
		"\2?@\7u\2\2@\4\3\2\2\2AB\7}\2\2B\6\3\2\2\2CD\7\177\2\2D\b\3\2\2\2EF\7"+
		"r\2\2FG\7w\2\2GH\7d\2\2HI\7n\2\2IJ\7k\2\2JK\7e\2\2KL\7\"\2\2LM\7u\2\2"+
		"MN\7v\2\2NO\7c\2\2OP\7v\2\2PQ\7k\2\2QR\7e\2\2RS\7\"\2\2ST\7x\2\2TU\7q"+
		"\2\2UV\7k\2\2VW\7f\2\2WX\7\"\2\2XY\7o\2\2YZ\7c\2\2Z[\7k\2\2[\\\7p\2\2"+
		"\\\n\3\2\2\2]^\7*\2\2^_\7U\2\2_`\7v\2\2`a\7t\2\2ab\7k\2\2bc\7p\2\2cd\7"+
		"i\2\2de\7\"\2\2ef\7c\2\2fg\7t\2\2gh\7i\2\2hi\7u\2\2ij\7\"\2\2jk\7]\2\2"+
		"kl\7_\2\2lm\7+\2\2m\f\3\2\2\2no\7*\2\2op\7U\2\2pq\7v\2\2qr\7t\2\2rs\7"+
		"k\2\2st\7p\2\2tu\7i\2\2uv\7\"\2\2vw\7]\2\2wx\7_\2\2xy\7\"\2\2yz\7c\2\2"+
		"z{\7t\2\2{|\7i\2\2|}\7u\2\2}~\7+\2\2~\16\3\2\2\2\177\u0080\7*\2\2\u0080"+
		"\20\3\2\2\2\u0081\u0082\7+\2\2\u0082\22\3\2\2\2\u0083\u0084\7.\2\2\u0084"+
		"\24\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7f\2\2\u0089\26\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7t\2\2\u008d\30\3\2\2\2\u008e\u008f\7+\2\2\u008f\u0090\7}\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7*\2"+
		"\2\u0098\34\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b\u009c"+
		"\7\"\2\2\u009c\u009d\7*\2\2\u009d\36\3\2\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7}\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7"+
		"(\2\2\u00ab\u00af\7(\2\2\u00ac\u00ad\7~\2\2\u00ad\u00af\7~\2\2\u00ae\u00aa"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af$\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b5"+
		"\7-\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b5\7/\2\2\u00b4\u00b0\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7(\3\2\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\u00c2\7?\2\2\u00ba\u00bb\7@\2\2\u00bb\u00c2\7?\2\2"+
		"\u00bc\u00bd\7>\2\2\u00bd\u00c2\7?\2\2\u00be\u00bf\7#\2\2\u00bf\u00c2"+
		"\7?\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2*\3\2\2\2"+
		"\u00c3\u00c4\7?\2\2\u00c4,\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6.\3\2\2\2"+
		"\u00c7\u00c8\t\4\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7"+
		"p\2\2\u00cb\u00d8\7v\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7w\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d8\7g\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7c\2\2"+
		"\u00d6\u00d8\7v\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d2"+
		"\3\2\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7d\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7k\2\2\u00de\u00f0\7e\2\2"+
		"\u00df\u00e0\7r\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7x\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00f0\7g\2\2\u00e6"+
		"\u00e7\7r\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7v\2\2"+
		"\u00ea\u00eb\7g\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00f0\7f\2\2\u00ef\u00d9\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef"+
		"\u00e6\3\2\2\2\u00f0\64\3\2\2\2\u00f1\u00f3\t\5\2\2\u00f2\u00f1\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\66"+
		"\3\2\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\t\6"+
		"\2\2\u00fc\u00fe\7\60\2\2\u00fd\u00ff\t\6\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u00f7\3\2\2\2\u0102\u00fb\3\2\2\2\u01038\3\2\2\2\u0104\u0106"+
		"\t\7\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\35\2\2\u010a:\3\2\2\2"+
		"\r\2\u00ae\u00b4\u00c1\u00d7\u00ef\u00f4\u00f9\u0100\u0102\u0107\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}