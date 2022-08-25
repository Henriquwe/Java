package faculdade.cdfs;

import java.io.File;
import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CDFS {
    public void deletaArquivo(File arquivo) {
        if(!arquivo.delete()) {
            System.out.println("Erro?");
        } else {
            System.out.println("Deletado?");
        }
    }

    public void repoeLetra(String string) {
        string = string.replace("<", "1");
        string = string.replace(">", "1");

        System.out.println(string);
    }

    public static void main(String[] args) {
        CDFS controller = new CDFS();
        String valor = "<script>";

        Pattern pattern = Pattern.compile("[<>]");
        Matcher matcher = pattern.matcher(valor);

        // NORMALIZAÇÃO
        valor = Normalizer.normalize(valor, Normalizer.Form.NFKC);

        // VALIDAÇÃO
        if (matcher.find()) {
            System.out.println(matcher + "\nNão passou!");
        } else {
            System.out.println(matcher + "\nPassou");
        }

        // Criando e Deletando arquivo
        File arquivo = new File("Arquivo.zip");
        controller.deletaArquivo(arquivo);

        controller.repoeLetra(valor);
    }
}
