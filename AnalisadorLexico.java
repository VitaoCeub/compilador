package analizador;



import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vitor_000
 */
public class AnalisadorLexico {

    private String programa;
    ArrayList<TipoToken> listaTokens;

    public AnalisadorLexico(String programa) {
        this.programa = programa;
    }

    public void analisar() throws IOException {
        listaTokens = new ArrayList();
        int contadorID = 0;
        Lexer lexer = new Lexer(new StringReader(programa));
        Token token = lexer.yylex();
        while (token != null) {
            TipoToken ttoken = new TipoToken();
            switch (token) {
                case ID:
                    contadorID++;
                    ttoken.setLexema(lexer.lexeme);
                    ttoken.setNomeToken("<ID>");
                    ttoken.setValorToken(contadorID);
                    listaTokens.add(ttoken);
                    break;                   
                case ERRO:                    
                    System.out.println("Token" + lexer.yytext() + " não reconhecido!");
                    break;
                default:
                    ttoken.setLexema(lexer.yytext());
                    ttoken.setNomeToken("<" + token.name() + ">");
                    listaTokens.add(ttoken);
                    break;
            }
            token = lexer.yylex();
        }
        mostrarTabela();
    }

    public void mostrarTabela() {
        System.out.println("---->TABELA DE TOKENS<----");
        System.out.println("LEXEMA | TOKEN | VALOR ATRIBUTO");
        for (TipoToken token : listaTokens) {
            System.out.println(token.getLexema() + " | " + token.getNomeToken() + " | " + token.getValorToken());
        }
    }
}
