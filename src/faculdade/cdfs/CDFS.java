package faculdade.cdfs;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.Base64;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CDFS {
    KeyGenerator key = null;
    SecretKey secretKeyDes = null;
    Cipher cipher = null;
    public CDFS() {
    }

    public String criptografarDES (String mensagem) {
        try {
            key = KeyGenerator.getInstance("DES");
            secretKeyDes = key.generateKey();
            cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeyDes);
            byte[] encrypted = cipher.doFinal(mensagem.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | InvalidKeyException |
                 BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public String descriptografarMensagemDES(String mensagem) {
        try {
            cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKeyDes);
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(mensagem));
            return String.valueOf(Base64.getDecoder().decode(original));
        } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException |
                 NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean comparaIgualdadeCorreta(String nome1, String nome2) {
        return Objects.equals(nome1, nome2);
    }
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

    public String criptografarAES(String mensagem) {
        try {
            IvParameterSpec iv = new IvParameterSpec("encryptionIntVec".getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec("aesEncryptionKey".getBytes(StandardCharsets.UTF_8), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, iv);

            byte[] encrypted = cipher.doFinal(mensagem.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException |
                 InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException |
                 BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public String

    public static void main(String[] args) {
        CDFS controller = new CDFS();
        String valor = "<script>";
        String valorteste = "abcde";

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

        // Repondo Letra
        controller.repoeLetra(valor);

        // Criptografia
        controller.criptografarDES(valorteste);
        System.out.println(controller.criptografarDES(valorteste));
        System.out.println(valorteste);

        //System.out.println(controller.descriptografarMensagem(valorteste));
    }
}
