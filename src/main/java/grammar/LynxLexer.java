// Generated from C:/Studia/Kompilatory/LynxTranslator/src/main/java/grammar\Lynx.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LynxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NEGATINATURALNUMBER=4, NATURALNUMBER=5, FLOATNUMBER=6, 
		FLOATNUMBER2=7, NOT=8, AND=9, OR=10, BACK=11, DISTANCE=12, FORWARD=13, 
		GLIDE=14, HEADING=15, HOME=16, LEFT=17, POS=18, RIGHT=19, SETHEADING=20, 
		SETPOS=21, SETX=22, SETY=23, TOWARDS=24, XCOR=25, YCOR=26, REPEAT=27, 
		IF=28, WORD=29, WHITESPACE=30, NEWLINE=31, IFSTATMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "X", "Y", 
			"Z", "Q", "V", "Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", 
			"Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Rr", "Ss", "Tt", "Uu", "Ww", 
			"Xx", "Yy", "Zz", "Qq", "Vv", "LOWERCASE", "UPPERCASE", "OPEN", "DIGIT", 
			"NEGATINATURALNUMBER", "NATURALNUMBER", "FLOATNUMBER", "FLOATNUMBER2", 
			"NOT", "AND", "OR", "BACK", "DISTANCE", "FORWARD", "GLIDE", "HEADING", 
			"HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", "SETY", 
			"TOWARDS", "XCOR", "YCOR", "REPEAT", "IF", "WORD", "WHITESPACE", "NEWLINE", 
			"IFSTATMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NEGATINATURALNUMBER", "NATURALNUMBER", "FLOATNUMBER", 
			"FLOATNUMBER2", "NOT", "AND", "OR", "BACK", "DISTANCE", "FORWARD", "GLIDE", 
			"HEADING", "HOME", "LEFT", "POS", "RIGHT", "SETHEADING", "SETPOS", "SETX", 
			"SETY", "TOWARDS", "XCOR", "YCOR", "REPEAT", "IF", "WORD", "WHITESPACE", 
			"NEWLINE", "IFSTATMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LynxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lynx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0219\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\6=\u012d\n=\r=\16=\u012e\3>\6"+
		">\u0132\n>\r>\16>\u0133\3?\5?\u0137\n?\3?\6?\u013a\n?\r?\16?\u013b\3?"+
		"\3?\6?\u0140\n?\r?\16?\u0141\5?\u0144\n?\3@\5@\u0147\n@\3@\3@\5@\u014b"+
		"\n@\3@\3@\6@\u014f\n@\r@\16@\u0150\3A\3A\3B\3B\3B\3B\3B\3B\5B\u015b\n"+
		"B\3C\3C\3C\3C\3C\5C\u0162\nC\3D\3D\3D\3D\3D\3D\3D\3D\5D\u016c\nD\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\5F\u018b\nF\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\5J\u01a8\nJ\3K\3K\3K\3K\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u01be\nL\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u01d0\nM\3N\3N\3N\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3V\3V\3V\3V\6V\u0203\nV\rV\16"+
		"V\u0204\3W\6W\u0208\nW\rW\16W\u0209\3X\5X\u020d\nX\3X\3X\6X\u0211\nX\r"+
		"X\16X\u0212\3Y\3Y\3Y\5Y\u0218\nY\2\2Z\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2"+
		"_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\6{\7}\b\177\t\u0081\n\u0083\13"+
		"\u0085\f\u0087\r\u0089\16\u008b\17\u008d\20\u008f\21\u0091\22\u0093\23"+
		"\u0095\24\u0097\25\u0099\26\u009b\27\u009d\30\u009f\31\u00a1\32\u00a3"+
		"\33\u00a5\34\u00a7\35\u00a9\36\u00ab\37\u00ad \u00af!\u00b1\"\3\2\t\3"+
		"\2c|\3\2C\\\3\2\62;\4\2..\60\60\4\2--//\4\2\13\13\"\"\4\2>>@@\2\u01fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2"+
		"\2\5\u00b5\3\2\2\2\7\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13\u00bb\3\2\2\2\r"+
		"\u00bd\3\2\2\2\17\u00bf\3\2\2\2\21\u00c1\3\2\2\2\23\u00c3\3\2\2\2\25\u00c5"+
		"\3\2\2\2\27\u00c7\3\2\2\2\31\u00c9\3\2\2\2\33\u00cb\3\2\2\2\35\u00cd\3"+
		"\2\2\2\37\u00cf\3\2\2\2!\u00d1\3\2\2\2#\u00d3\3\2\2\2%\u00d5\3\2\2\2\'"+
		"\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2"+
		"\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\u00e5\3\2\2\2\67\u00e7\3\2\2"+
		"\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ed\3\2\2\2?\u00ef\3\2\2\2A\u00f1"+
		"\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G\u00f7\3\2\2\2I\u00f9\3\2\2\2K"+
		"\u00fb\3\2\2\2M\u00fd\3\2\2\2O\u00ff\3\2\2\2Q\u0101\3\2\2\2S\u0103\3\2"+
		"\2\2U\u0105\3\2\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010b\3\2\2\2]\u010d"+
		"\3\2\2\2_\u010f\3\2\2\2a\u0111\3\2\2\2c\u0113\3\2\2\2e\u0115\3\2\2\2g"+
		"\u0117\3\2\2\2i\u0119\3\2\2\2k\u011b\3\2\2\2m\u011d\3\2\2\2o\u011f\3\2"+
		"\2\2q\u0121\3\2\2\2s\u0123\3\2\2\2u\u0125\3\2\2\2w\u0127\3\2\2\2y\u0129"+
		"\3\2\2\2{\u0131\3\2\2\2}\u0136\3\2\2\2\177\u0146\3\2\2\2\u0081\u0152\3"+
		"\2\2\2\u0083\u015a\3\2\2\2\u0085\u0161\3\2\2\2\u0087\u016b\3\2\2\2\u0089"+
		"\u016d\3\2\2\2\u008b\u018a\3\2\2\2\u008d\u018c\3\2\2\2\u008f\u0192\3\2"+
		"\2\2\u0091\u019a\3\2\2\2\u0093\u01a7\3\2\2\2\u0095\u01a9\3\2\2\2\u0097"+
		"\u01bd\3\2\2\2\u0099\u01cf\3\2\2\2\u009b\u01d1\3\2\2\2\u009d\u01d8\3\2"+
		"\2\2\u009f\u01dd\3\2\2\2\u00a1\u01e2\3\2\2\2\u00a3\u01ea\3\2\2\2\u00a5"+
		"\u01ef\3\2\2\2\u00a7\u01f4\3\2\2\2\u00a9\u01fb\3\2\2\2\u00ab\u0202\3\2"+
		"\2\2\u00ad\u0207\3\2\2\2\u00af\u0210\3\2\2\2\u00b1\u0217\3\2\2\2\u00b3"+
		"\u00b4\7]\2\2\u00b4\4\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6\6\3\2\2\2\u00b7"+
		"\u00b8\7_\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7C\2\2\u00ba\n\3\2\2\2\u00bb"+
		"\u00bc\7D\2\2\u00bc\f\3\2\2\2\u00bd\u00be\7E\2\2\u00be\16\3\2\2\2\u00bf"+
		"\u00c0\7F\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\7G\2\2\u00c2\22\3\2\2\2\u00c3"+
		"\u00c4\7H\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7I\2\2\u00c6\26\3\2\2\2\u00c7"+
		"\u00c8\7J\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7K\2\2\u00ca\32\3\2\2\2\u00cb"+
		"\u00cc\7L\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7M\2\2\u00ce\36\3\2\2\2\u00cf"+
		"\u00d0\7N\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7O\2\2\u00d2\"\3\2\2\2\u00d3"+
		"\u00d4\7P\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7Q\2\2\u00d6&\3\2\2\2\u00d7\u00d8"+
		"\7R\2\2\u00d8(\3\2\2\2\u00d9\u00da\7T\2\2\u00da*\3\2\2\2\u00db\u00dc\7"+
		"U\2\2\u00dc,\3\2\2\2\u00dd\u00de\7V\2\2\u00de.\3\2\2\2\u00df\u00e0\7W"+
		"\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7Y\2\2\u00e2\62\3\2\2\2\u00e3\u00e4"+
		"\7Z\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7[\2\2\u00e6\66\3\2\2\2\u00e7\u00e8"+
		"\7\\\2\2\u00e88\3\2\2\2\u00e9\u00ea\7S\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7X\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7"+
		"d\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7f"+
		"\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7h\2"+
		"\2\u00f8H\3\2\2\2\u00f9\u00fa\7i\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7j\2\2"+
		"\u00fcL\3\2\2\2\u00fd\u00fe\7k\2\2\u00feN\3\2\2\2\u00ff\u0100\7l\2\2\u0100"+
		"P\3\2\2\2\u0101\u0102\7m\2\2\u0102R\3\2\2\2\u0103\u0104\7n\2\2\u0104T"+
		"\3\2\2\2\u0105\u0106\7o\2\2\u0106V\3\2\2\2\u0107\u0108\7p\2\2\u0108X\3"+
		"\2\2\2\u0109\u010a\7q\2\2\u010aZ\3\2\2\2\u010b\u010c\7r\2\2\u010c\\\3"+
		"\2\2\2\u010d\u010e\7t\2\2\u010e^\3\2\2\2\u010f\u0110\7u\2\2\u0110`\3\2"+
		"\2\2\u0111\u0112\7v\2\2\u0112b\3\2\2\2\u0113\u0114\7w\2\2\u0114d\3\2\2"+
		"\2\u0115\u0116\7y\2\2\u0116f\3\2\2\2\u0117\u0118\7z\2\2\u0118h\3\2\2\2"+
		"\u0119\u011a\7{\2\2\u011aj\3\2\2\2\u011b\u011c\7|\2\2\u011cl\3\2\2\2\u011d"+
		"\u011e\7s\2\2\u011en\3\2\2\2\u011f\u0120\7x\2\2\u0120p\3\2\2\2\u0121\u0122"+
		"\t\2\2\2\u0122r\3\2\2\2\u0123\u0124\t\3\2\2\u0124t\3\2\2\2\u0125\u0126"+
		"\7]\2\2\u0126v\3\2\2\2\u0127\u0128\t\4\2\2\u0128x\3\2\2\2\u0129\u012a"+
		"\7/\2\2\u012a\u012c\5\u00adW\2\u012b\u012d\5w<\2\u012c\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fz\3\2\2\2"+
		"\u0130\u0132\5w<\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134|\3\2\2\2\u0135\u0137\7/\2\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\5w<\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u0143\3\2\2\2\u013d\u013f\t\5\2\2\u013e\u0140\5w<\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u0144\3\2\2\2\u0144~\3\2\2\2"+
		"\u0145\u0147\t\6\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u014b\7\62\2\2\u0149\u014b\5{>\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\t\5\2\2\u014d\u014f\5w"+
		"<\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0080\3\2\2\2\u0152\u0153\7#\2\2\u0153\u0082\3\2"+
		"\2\2\u0154\u0155\7(\2\2\u0155\u015b\7(\2\2\u0156\u0157\5=\37\2\u0157\u0158"+
		"\5W,\2\u0158\u0159\5C\"\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2\2\2\u015a"+
		"\u0156\3\2\2\2\u015b\u0084\3\2\2\2\u015c\u015d\7~\2\2\u015d\u0162\7~\2"+
		"\2\u015e\u015f\5Y-\2\u015f\u0160\5]/\2\u0160\u0162\3\2\2\2\u0161\u015c"+
		"\3\2\2\2\u0161\u015e\3\2\2\2\u0162\u0086\3\2\2\2\u0163\u0164\5\13\6\2"+
		"\u0164\u0165\5\t\5\2\u0165\u0166\5\r\7\2\u0166\u0167\5\35\17\2\u0167\u016c"+
		"\3\2\2\2\u0168\u0169\5\13\6\2\u0169\u016a\5\35\17\2\u016a\u016c\3\2\2"+
		"\2\u016b\u0163\3\2\2\2\u016b\u0168\3\2\2\2\u016c\u0088\3\2\2\2\u016d\u016e"+
		"\5\17\b\2\u016e\u016f\5\31\r\2\u016f\u0170\5+\26\2\u0170\u0171\5-\27\2"+
		"\u0171\u0172\5\t\5\2\u0172\u0173\5#\22\2\u0173\u0174\5\r\7\2\u0174\u0175"+
		"\5\21\t\2\u0175\u008a\3\2\2\2\u0176\u0177\5\23\n\2\u0177\u0178\5%\23\2"+
		"\u0178\u0179\5)\25\2\u0179\u017a\5\61\31\2\u017a\u017b\5\t\5\2\u017b\u017c"+
		"\5)\25\2\u017c\u017d\5\17\b\2\u017d\u018b\3\2\2\2\u017e\u017f\5\23\n\2"+
		"\u017f\u0180\5\17\b\2\u0180\u018b\3\2\2\2\u0181\u0182\7h\2\2\u0182\u0183"+
		"\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7y\2\2\u0185\u0186\7c\2\2\u0186"+
		"\u0187\7t\2\2\u0187\u018b\7f\2\2\u0188\u0189\7h\2\2\u0189\u018b\7f\2\2"+
		"\u018a\u0176\3\2\2\2\u018a\u017e\3\2\2\2\u018a\u0181\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018b\u008c\3\2\2\2\u018c\u018d\5\25\13\2\u018d\u018e\5\31\r"+
		"\2\u018e\u018f\5\37\20\2\u018f\u0190\5\17\b\2\u0190\u0191\5\21\t\2\u0191"+
		"\u008e\3\2\2\2\u0192\u0193\5\27\f\2\u0193\u0194\5\21\t\2\u0194\u0195\5"+
		"\t\5\2\u0195\u0196\5\17\b\2\u0196\u0197\5\31\r\2\u0197\u0198\5#\22\2\u0198"+
		"\u0199\5\25\13\2\u0199\u0090\3\2\2\2\u019a\u019b\5\27\f\2\u019b\u019c"+
		"\5%\23\2\u019c\u019d\5!\21\2\u019d\u019e\5\21\t\2\u019e\u0092\3\2\2\2"+
		"\u019f\u01a0\5\37\20\2\u01a0\u01a1\5\21\t\2\u01a1\u01a2\5\23\n\2\u01a2"+
		"\u01a3\5-\27\2\u01a3\u01a8\3\2\2\2\u01a4\u01a5\5\37\20\2\u01a5\u01a6\5"+
		"-\27\2\u01a6\u01a8\3\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a8"+
		"\u0094\3\2\2\2\u01a9\u01aa\5\'\24\2\u01aa\u01ab\5%\23\2\u01ab\u01ac\5"+
		"+\26\2\u01ac\u0096\3\2\2\2\u01ad\u01ae\5)\25\2\u01ae\u01af\5\31\r\2\u01af"+
		"\u01b0\5\25\13\2\u01b0\u01b1\5\27\f\2\u01b1\u01b2\5-\27\2\u01b2\u01be"+
		"\3\2\2\2\u01b3\u01b4\5)\25\2\u01b4\u01b5\5-\27\2\u01b5\u01be\3\2\2\2\u01b6"+
		"\u01b7\7t\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7i\2\2\u01b9\u01ba\7j\2\2"+
		"\u01ba\u01be\7v\2\2\u01bb\u01bc\7t\2\2\u01bc\u01be\7v\2\2\u01bd\u01ad"+
		"\3\2\2\2\u01bd\u01b3\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u0098\3\2\2\2\u01bf\u01c0\5+\26\2\u01c0\u01c1\5\21\t\2\u01c1\u01c2\5"+
		"-\27\2\u01c2\u01c3\5\27\f\2\u01c3\u01c4\5\21\t\2\u01c4\u01c5\5\t\5\2\u01c5"+
		"\u01c6\5\17\b\2\u01c6\u01c7\5\31\r\2\u01c7\u01c8\5#\22\2\u01c8\u01c9\5"+
		"\25\13\2\u01c9\u01d0\3\2\2\2\u01ca\u01cb\5+\26\2\u01cb\u01cc\5\21\t\2"+
		"\u01cc\u01cd\5-\27\2\u01cd\u01ce\5\27\f\2\u01ce\u01d0\3\2\2\2\u01cf\u01bf"+
		"\3\2\2\2\u01cf\u01ca\3\2\2\2\u01d0\u009a\3\2\2\2\u01d1\u01d2\5+\26\2\u01d2"+
		"\u01d3\5\21\t\2\u01d3\u01d4\5-\27\2\u01d4\u01d5\5\'\24\2\u01d5\u01d6\5"+
		"%\23\2\u01d6\u01d7\5+\26\2\u01d7\u009c\3\2\2\2\u01d8\u01d9\5+\26\2\u01d9"+
		"\u01da\5\21\t\2\u01da\u01db\5-\27\2\u01db\u01dc\5\63\32\2\u01dc\u009e"+
		"\3\2\2\2\u01dd\u01de\5+\26\2\u01de\u01df\5\21\t\2\u01df\u01e0\5-\27\2"+
		"\u01e0\u01e1\5\65\33\2\u01e1\u00a0\3\2\2\2\u01e2\u01e3\5-\27\2\u01e3\u01e4"+
		"\5%\23\2\u01e4\u01e5\5\61\31\2\u01e5\u01e6\5\t\5\2\u01e6\u01e7\5)\25\2"+
		"\u01e7\u01e8\5\17\b\2\u01e8\u01e9\5+\26\2\u01e9\u00a2\3\2\2\2\u01ea\u01eb"+
		"\5\63\32\2\u01eb\u01ec\5\r\7\2\u01ec\u01ed\5%\23\2\u01ed\u01ee\5)\25\2"+
		"\u01ee\u00a4\3\2\2\2\u01ef\u01f0\5\65\33\2\u01f0\u01f1\5\r\7\2\u01f1\u01f2"+
		"\5%\23\2\u01f2\u01f3\5)\25\2\u01f3\u00a6\3\2\2\2\u01f4\u01f5\5]/\2\u01f5"+
		"\u01f6\5E#\2\u01f6\u01f7\5[.\2\u01f7\u01f8\5E#\2\u01f8\u01f9\5=\37\2\u01f9"+
		"\u01fa\5a\61\2\u01fa\u00a8\3\2\2\2\u01fb\u01fc\5M\'\2\u01fc\u01fd\5G$"+
		"\2\u01fd\u00aa\3\2\2\2\u01fe\u0203\5q9\2\u01ff\u0203\5s:\2\u0200\u0203"+
		"\5w<\2\u0201\u0203\7a\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u00ac\3\2\2\2\u0206\u0208\t\7\2\2\u0207"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u00ae\3\2\2\2\u020b\u020d\7\17\2\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0211\7\f\2\2\u020f\u0211\7\17"+
		"\2\2\u0210\u020c\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u00b0\3\2\2\2\u0214\u0218\t\b"+
		"\2\2\u0215\u0216\7?\2\2\u0216\u0218\7?\2\2\u0217\u0214\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0218\u00b2\3\2\2\2\32\2\u012e\u0133\u0136\u013b\u0141\u0143"+
		"\u0146\u014a\u0150\u015a\u0161\u016b\u018a\u01a7\u01bd\u01cf\u0202\u0204"+
		"\u0209\u020c\u0210\u0212\u0217\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}