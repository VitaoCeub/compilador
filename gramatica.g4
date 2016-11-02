// Gramática baseada em java chamada gramatica;
grammar gramatica;

inicio : VISIBILIDADE 'class' ID '{'exp'}' | exp ;
exp: (exp_alteracao | exp_metodo | declare_var | exp_incremento | exp_while | exp_if | exp_for | declare_var_atri | operacao FIM_SENTENCA)+;
metodo_main : 'public static void main' ('(String args [])'|'(String [] args)') '{'exp'}';

exp_metodo : VISIBILIDADE tipo_retorno ID '(' conjunto_declare? ')''{'exp'}' | metodo_main;

conjunto_declare : declare_var ',' conjunto_declare | declare_var; 
declare_var : TIPO_DIG ID FIM_SENTENCA?;
tipo_retorno : 'void' | TIPO_DIG;
exp_for : 'for''('declare_var_atri exp_comparacao FIM_SENTENCA exp_incremento '){'exp'}';
declare_var_atri : TIPO_DIG ID ATRIBUICAO (numero_id|operacao) FIM_SENTENCA;
exp_comparacao : numero_id COMPARACAO numero_id;
exp_incremento : ID INCREMENTO | ID INCREMENTO FIM_SENTENCA;
exp_alteracao : ID ATRIBUICAO (numero_id|operacao) FIM_SENTENCA;
exp_while : 'while ('exp_comparacao (OPERADORES_LOGICOS exp_comparacao)? '){'exp'}';

exp_if : 'if ('exp_comparacao (OPERADORES_LOGICOS exp_comparacao)? '){'exp'}'('else' exp_if)?('else {'exp'}')? ;

operacao : operacao OPERADOR_AD termo | termo;
termo : termo OPERADOR_MUL numero_id | numero_id | '('operacao')';

numero_id : NUMERO | ID; 
OPERADORES_LOGICOS : '&&' | '||' ;
INCREMENTO : '++' | '--';
FIM_SENTENCA : ';' ;
COMPARACAO : '==' | '>=' | '<=' | '!=' | '>' | '<' ;
ATRIBUICAO : '=';
OPERADOR_AD : '+' | '-' ;
OPERADOR_MUL : '*' | '/' ;
TIPO_DIG : 'int' | 'double' | 'float' ;
VISIBILIDADE : 'public' | 'private' | 'protected' ;
ID : [a-z]+ ;   
NUMERO : [0-9]+ | [0-9]'.'[0-9]+;
WS : [ \t\r\n]+ -> skip ; // pula espacos , tabulacoes e novas linhas