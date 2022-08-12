package youtube.exercicios.aula19;

import java.util.Scanner;

public class Ex1 {
    // Exercícios da lista 19 referentes a aula 19 sobre vetores (arrays)
    // https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
    public static void main(String[] args) {
        // Exercício 1
        int[] vetorDeInteiros = new int[5];
        int[] vetorReserva = new int[vetorDeInteiros.length];
        Scanner scan = new Scanner(System.in);

        for (int cont = 0; cont < vetorDeInteiros.length; cont++) {
            System.out.println("Adicione um número:");
            vetorDeInteiros[cont] = scan.nextInt();
            System.out.println("Item:" + vetorDeInteiros[cont] + " adicionado na posição:" + cont);
        }

        for (int cont = 0; cont < vetorReserva.length; cont++) {
            vetorReserva[cont] = vetorDeInteiros[cont];
            System.out.println("Valor:" + vetorReserva[cont] + " adicionado na posição:" + cont);
        }

/*
        System.out.println("Próximo");
        for (int item: vetorDeInteiros) {
            vetorReserva[item] = vetorDeInteiros[item];
            System.out.println("Valor:" + vetorReserva[item] + " adicionado na posição:" + item);
        }
*/
    }
}