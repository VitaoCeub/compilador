
import analizador.AnalisadorLexico;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitor_000
 */
public class AppMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Digite a cadeia de caracteres na Linguagem Java a serem lidos:");
        System.out.println("Digite FIM ou fim para parar a leitura!");
        String programa = "";
        Scanner leia = new Scanner (System.in);
        boolean loop = true;
        while (loop){
            String lido = leia.nextLine();
            if (lido.equals("FIM")|| lido.equals("fim")) {
                loop = false;
            } else{
                programa+=lido+" ";
            }
        } 
        AnalisadorLexico alexico = new AnalisadorLexico(programa);
        alexico.analisar();
    }
}
