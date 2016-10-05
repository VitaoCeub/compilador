package analizador;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vitor_000
 */
public class TipoToken {
    private String lexema;
    private String nomeToken;
    private int valorToken;

    public String getNomeToken() {
        return nomeToken;
    }

    public void setNomeToken(String nomeToken) {
        this.nomeToken = nomeToken;
    }

    public int getValorToken() {
        return valorToken;
    }

    public void setValorToken(int numero) {
        this.valorToken = numero;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    
    
}
