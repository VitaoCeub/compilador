header {package decaf;}

options
{
  mangleLiteralPrefix = "TK_";
  language="Java";
}

class DecafParser extends Parser;
options
{
  importVocab=DecafScanner;
  k=3;
  buildAST=true;
}


program : visibilidade TK_class ID ABRE_COLUNA exp FECHA_COLUNA | exp ;
exp: (exp_alteracao | exp_metodo | declare_var | exp_incremento | exp_while | exp_if | exp_for | declare_var_atri | exp_retorno| operacao FIM_SENTENCA)+;

//metodo_main : "public static void main" ("(String args [])"|"(String [] args)") "{"exp"}";

exp_retorno : TK_return (numero_id|operacao) FIM_SENTENCA;

exp_metodo : visibilidade tipo_retorno ID ABRE_PAR (conjunto_declare)? FECHA_PAR ABRE_COLUNA exp FECHA_COLUNA;

conjunto_declare : declare_var SEPARADOR_PAR conjunto_declare | declare_var; 

declare_var : tipo_dig ID (FIM_SENTENCA)?;

tipo_retorno : TK_void | tipo_dig;

exp_for : TK_for ABRE_PAR declare_var_atri exp_comparacao FIM_SENTENCA exp_incremento FECHA_PAR ABRE_COLUNA exp FECHA_COLUNA;

declare_var_atri : tipo_dig ID ATRIBUICAO (numero_id|operacao) FIM_SENTENCA;

exp_comparacao : numero_id COMPARACAO numero_id;

exp_incremento : ID INCREMENTO | ID INCREMENTO FIM_SENTENCA;

exp_alteracao : ID ATRIBUICAO (numero_id|operacao) FIM_SENTENCA;

exp_while : TK_while ABRE_PAR exp_comparacao (OPERADORES_LOGICOS exp_comparacao)? FECHA_PAR ABRE_COLUNA exp FECHA_COLUNA;

exp_if : TK_if ABRE_PAR exp_comparacao (OPERADORES_LOGICOS exp_comparacao)? FECHA_PAR ABRE_COLUNA exp FECHA_COLUNA (TK_else exp_if)?(TK_else ABRE_COLUNA exp FECHA_COLUNA)? ;

operacao : termo (OPERADOR_AD operacao)?;

termo : com_parenteses (OPERADOR_MUL termo)?;

com_parenteses : numero_id | ABRE_PAR operacao FECHA_PAR;

numero_id : NUMERO | ID; 

visibilidade: TK_public | TK_private | TK_protected;

tipo_dig : TK_int | TK_float | TK_double;

