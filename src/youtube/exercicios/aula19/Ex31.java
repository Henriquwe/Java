package youtube.exercicios.aula19;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        int[] vetorDeInteiros = new int[11];
        int[] vetorReserva = new int[vetorDeInteiros.length];
        Scanner scan = new Scanner(System.in);

        for (int cont = 1; cont < vetorDeInteiros.length; cont++) {
            System.out.println("Adicione um número:");
            vetorDeInteiros[cont] = scan.nextInt();
            System.out.println("Item:" + vetorDeInteiros[cont] + " adicionado na posição:" + cont + "\n");
        }

        for (int cont = 0; cont < vetorDeInteiros.length; cont++) {
            if (vetorDeInteiros[cont] % 2 == 1) {
                vetorReserva[cont] = vetorDeInteiros[cont];
                System.out.println("Valor ímpar:" + vetorReserva[cont] + " adicionado na posição:" + cont);
            }
        }
    }
}
