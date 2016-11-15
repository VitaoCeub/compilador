header {package decaf;}

options 
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafScanner extends Lexer;
options 
{
  k=2;
}

tokens 
{
  "public";
  "private";
  "protected";
  "class";
  "int";
  "double";
  "float";
  "void";
  "if";
  "for";
  "while";
  "else";
  "return";
}

ID options { paraphrase = "an identifier"; } : 
  ('a'..'z' | 'A'..'Z')+;
  
NUMERO options { paraphrase = "an number"; }  : 
	('0'..'9')+ ('.' ('0'..'9')+ )?;

ATRIBUICAO options { paraphrase = "="; } : "=" ;

WS_ : (' ' | '\n' | '\t' | '\r' {newline();}) {_ttype = Token.SKIP; };

SL_COMMENT : "//" (~'\n')* '\n' {_ttype = Token.SKIP; newline (); };

CHAR : '\'' (ESC|~'\'') '\'';
STRING : '"' (ESC|~'"')* '"';

protected
ESC :  '\\' ('n'|'"');


OPERADORES_LOGICOS : "&&" | "||" ;
INCREMENTO : "++"| "--";
FIM_SENTENCA : ';' ;
COMPARACAO : "==" | ">=" | "<=" | "!=" | '>' | '<' ;
OPERADOR_AD : '+' | '-' ;
OPERADOR_MUL : '*' | '/' ;
ABRE_COLUNA : '{';
FECHA_COLUNA : '}';
ABRE_PAR : '(';
FECHA_PAR : ')';
DECLARE_VETOR : "[]";
SEPARADOR_PAR : ',';

