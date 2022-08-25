package faculdade.cdfs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String valor = "<script>";

        Pattern pattern = Pattern.compile("[<>]");
        Matcher matcher = pattern.matcher(valor);

        if (matcher.find()) {
            System.out.println(matcher + "\nNão passou!");
        } else {
            System.out.println(matcher + "\nPassou");
        }

        File arquivo = new File("arquivo.zip");

        public static void deletaArquivo() {
            boolean result = arquivo.delete();
            if(result) {
                System.out.println("Arquivo deletado com sucesso!");
            } else {
                System.out.println("O arquivo não foi deletado!");
            }
        }

        public void repoeLetra() {

        }
    }
}
