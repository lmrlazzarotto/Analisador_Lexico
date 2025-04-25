package Compilador;
import java.io.*;

public class GeraLexer {
    public static void main(String[] args) throws Exception {
        String arq = "C:/Compiladores/Unidade2/src/Compilador/especificacao.flex";
        gerarLexer(arq);
    }

    public static void gerarLexer(String arq) throws Exception {
        String[] argumentos = { arq };
        jflex.Main.generate(argumentos);
    }
}