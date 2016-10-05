package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
";" {return FIM_SENTENCA;}
"for" | "while" | "do" {return LACO_REP;}
"if" {return SENT_IF;}
"else" {return CLAUSULA_ELSE;}
"void" {return TIPO_RETORNO;}
"public" | "private" | "protected" {return VISIBILIDADE;}
"int" | "double" | "float" {return TIPO_DIG;}
"String" | "char" {return TIPO_LETRA;}
"==" | ">=" | "<=" | "!=" {return COMPARACAO;}
"=" {return ATRIBUICAO;}
"+" | "*" | "-" | "/" | "++" | "--" {return OPERADOR;}
"(" {return PAR_ESQ;}
")" {return PAR_DIR;}
"{" {return CHAVE_ESQ;}
"}" {return CHAVE_DIR;}
"[" {return COL_ESQ;}
"]" {return COL_DIR;}
"." {return CHAM_METODO;}
"[]" {return DECLARE_VETOR;}
"class" {return DECLARE_CLASSE;}

{L}({L}|{D})* {lexeme=yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERRO;}