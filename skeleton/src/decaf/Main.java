package decaf;

import java.io.*;
import antlr.Token;
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);
        	
        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=DecafParserTokenTypes.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();
		
		        			switch (token.getType())
		        			{
		        			case DecafScannerTokenTypes.ID:
		        				type = " IDENTIFICADOR";
		        				break;
                            case DecafScannerTokenTypes.NUMERO:
                                type = " IDENTIFICADOR";
                                break;
							case DecafScannerTokenTypes.COMPARACAO:
								type = " COMPARACAO";
		        				break;
                            case DecafScannerTokenTypes.OPERADORES_LOGICOS:
                                type = " OPERADOR_LOGICO";
                                break;
                            case DecafScannerTokenTypes.INCREMENTO:
                                type = " OPERADOR_INCREMENTO";
                                break;
                            case DecafScannerTokenTypes.FIM_SENTENCA:
                                type = " FIM_SENTENCA";
                                break;
                            case DecafScannerTokenTypes.ATRIBUICAO:
                                type = " ATRIBUICAO";
                                break;
                            case DecafScannerTokenTypes.OPERADOR_AD:
                                type = " OPERADOR_AD";
                                break;
                            case DecafScannerTokenTypes.OPERADOR_MUL:
                                type = " OPERADOR_MUL";
                                break;
                            case DecafScannerTokenTypes.TK_int:
                                type = " TIPO_DADO_NUMEROS";
                                break;
                            case DecafScannerTokenTypes.TK_float:
                                type = " TIPO_DADO_NUMEROS";
                                break; 
                            case DecafScannerTokenTypes.TK_double:
                                type = " TIPO_DADO_NUMEROS";
                                break;             
                            case DecafScannerTokenTypes.TK_class:
                                type = " DEF_CLASSE";
                                break; 
                            case DecafScannerTokenTypes.ABRE_COLUNA:
                                type = " ABRE_COLUNA";
                                break;
                            case DecafScannerTokenTypes.FECHA_COLUNA:
                                type = " FECHA_COLUNA";
                                break;
                            case DecafScannerTokenTypes.ABRE_PAR:
                                type = " ABRE_PAR";
                                break;
                            case DecafScannerTokenTypes.FECHA_PAR:
                                type = " FECHA_PAR";
                                break;    
                            case DecafScannerTokenTypes.DECLARE_VETOR:
                                type = " DECLARE_VETOR";
                                break; 
                            case DecafScannerTokenTypes.SEPARADOR_PAR:
                                type = " SEPARADOR_PARAMETROS";
                                break; 
                            case DecafScannerTokenTypes.TK_return:
                                 type = " RETORNO";
                                break;
                            case DecafScannerTokenTypes.TK_void:
                                 type = " RETORNO_VAZIO_VOID";
                                break; 
                            case DecafScannerTokenTypes.TK_if:
                                 type = " EXP_CONDICIONAL";
                                break; 
                            case DecafScannerTokenTypes.TK_for:
                                 type = " EXP_FOR";
                                break; 
                            case DecafScannerTokenTypes.TK_while:
                                 type = " EXP_WHILE";
                                break;   
                            case DecafScannerTokenTypes.TK_else:
                                 type = " CLAUSULA_ELSE";
                                break;  
                            case DecafScannerTokenTypes.TK_public:
                                 type = " TIPO_VISIBILIDADE";
                                break; 
                            case DecafScannerTokenTypes.TK_private:
                                 type = " TIPO_VISIBILIDADE";
                                break;   
                            case DecafScannerTokenTypes.TK_protected:
                                 type = " TIPO_VISIBILIDADE";
                                break;          
		        			}
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
        	            lexer.consume ();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		DecafParser parser = new DecafParser (lexer);
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}

