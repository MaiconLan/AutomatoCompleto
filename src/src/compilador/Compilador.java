/*
 * Trabalho de Compiladores
 */
package src.compilador;

import src.Lexico.Lexico;

import java.io.IOException;
/**
 *
 * @author augusto, fabricio e guilherme
 */
public class Compilador {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Lexico lex = new Lexico("file2.txt");
        lex.scanAll();
     }
    
}