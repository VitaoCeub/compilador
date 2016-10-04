
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vitor_000
 */
public class Lexico {

    private String[] palavrasReservadas = {"public", "private", "int", "char", "float", "String"};
    private String programa;
    private char[] separadores = {',', '.', ';', '{', '}', '[', ']'};

    private void analisador(String palavras) {
        ArrayList <Token> tokens = new ArrayList <Token>();
        int ct = 0;
        String tipoAnterior = "id";
        String tipoAtual;
        int inicio = 0;
        for (int i = 0; i < palavras.length(); i++) {
            char lido = palavras.charAt(i);
            if (Character.isLetter(lido)) {
                tipoAtual = "id";
            } else if (Character.isDigit(lido)) {
                tipoAtual = "digito";
            } else {
                tipoAtual = "outro";
            }
            if (!tipoAnterior.equals(tipoAtual)){
                ct++;
                Token token = new Token(tipoAnterior, ct);  
                tokens.add(token);
                boolean achou = false;
                for (int j = 0; j < separadores.length; j++) {
                    if (lido == separadores[j]) {
                        achou = true;
                        break;
                    }                
                }
                if (achou) {
                    Token token = new Token(String.valueOf(lido), 0);
                }
                else {
                    System.out.println("Caractere "+lido+" não pertence ao alfabeto!");
                }
            }
        }
    }

    public void lerPrograma() {
        String local = JOptionPane.showInputDialog(null);
        try {
            File file = new File(local);
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            programa = buffer.readLine();
            while (programa != null) {
                programa += buffer.readLine();
            }
        } catch (Exception e) {
            System.out.println("Problema ao ler arquivo! Tente novamente!");
            System.exit(0);
        }
    }
}
