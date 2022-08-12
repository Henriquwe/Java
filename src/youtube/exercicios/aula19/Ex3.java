package youtube.exercicios.aula19;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] vetorDeInteiros = new int[15];
        int[] vetorReserva = new int[vetorDeInteiros.length];
        Scanner scan = new Scanner(System.in);

        for (int cont = 0; cont < vetorDeInteiros.length; cont++) {
            System.out.println("Adicione um número:");
            vetorDeInteiros[cont] = scan.nextInt();
            System.out.println("Item:" + vetorDeInteiros[cont] + " adicionado na posição:" + cont + "\n");
        }

        for (int cont = 0; cont < vetorReserva.length; cont++) {
            vetorReserva[cont] = vetorDeInteiros[cont] * vetorDeInteiros[cont];
            System.out.println("Valor:" + vetorReserva[cont] + " adicionado na posição:" + cont);
        }
    }
}
