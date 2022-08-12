package youtube.fonte;

public class Aula17 {
    public static void main(String[] args) {
        // count, i, contador.
        // int i = 0;
        // Inicialização esperada:
        for (int i = 1; i <= 10; i++) {
            System.out.println("Incrementando I:" + i);
        }

        // Inicializando com mais de uma variável:
        for (int count1 = 1, count2 = 10; count1 <= count2; count1++, count2--) {
            System.out.println("Incrementando o 1° contador:" + count1);
            System.out.println("Decrementando o 2° contador:" + count2);
        }

        // Inicializando com partes ausentes:
        int i = 0;
        for ( ; i <= 5; ) {
            System.out.println("I têm o valor de:" + i);
            i++;
        }
    }
}
