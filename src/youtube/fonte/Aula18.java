package youtube.fonte;

import java.util.Scanner;

public class Aula18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int max;

        System.out.println("Digite um número: ");
        num = teclado.nextInt();
        System.out.println("Digite o número máximo de repetição de busca do laço FOR: ");
        max = teclado.nextInt();

        for (int cont = num; cont <= max; cont++) {
            if (cont % 4 == 0) {
                System.out.println("Valor do contador: " + cont);
            }
        }

        for (int cont = num; cont <= max; cont++) {
            if (cont % 4 == 0) {
                System.out.println("\nValor do contador: " + cont);
                System.out.println("Valor do número é divisível por 4. \nDando Break na operação!");
                break ;
            }
        }

        for (int cont = num; cont <= max; cont++) {
            if (cont % 4 == 0) {
                System.out.println("Continue!");
                continue;
            }
        }

        // ! Não é uma boa prática, não deve ser utilizado. Equivalente ao GO-TO. !
        for (int cont = num; cont <= max; cont ++) {
            caso1: {
                if (cont == 1) {
                    System.out.println("Rótulo 1");
                    break ;
                }
            }
            caso2: {
                if (cont == 2) {
                    System.out.println("Rótulo 2");
                    break ;
                }
            }
            caso3: {
                if (cont == 3) {
                    System.out.println("Rótulo 3");
                    break ;
                }
            }
            caso4: {
                if (cont == 4) {
                    System.out.println("Rótulo 4");
                    break ;
                }
            }
            System.out.println("Dentro do laço FOR.");
        }

    }
}
