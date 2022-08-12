package youtube.fonte;

public class Aula16 {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        // Diferença crucial: WHILE primeiro Avalia a expressão(condição)
        // e depois realiza o bloco de código, se vier ao caso. Bom para quando se faz necessária um certo número de
        // repetições indefinidas;
        // Enquanto DO WHILE realizará o bloco de código e depois verificará a condição, bom para quando é obrigatório
        // a execução do bloco de código ao menos uma vez, mas não se sabe se é necessário continuar;
        while (i <= max) {
            System.out.println("Incrementando I:" + i);
            i++;
        }

        do {
            System.out.println("Incrementando enquanto I < 20:" + i);
            i++;
        } while (i <= 20);
    }
}
