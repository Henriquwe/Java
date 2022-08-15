package pbl.pbl2;
import java.util.Scanner;

// RE-ENTREGANDO FORA DA DATA POIS O SENHOR PEDIU PARA QUE FOSSE ENTREGUE
// EM GRUPOS E A GENTE AINDA NÃO ESTAVA EM GRUPO, MAS A PRIMEIRA ENTREGA FOI NA DATA
//Nome dos integrantes:
//Henrique Alves
//Matheus Bellozupko
//Guilherme Ratzke
//Thomas Frenzel

public class PBL2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor para a variável A: ");
        double valor_a = teclado.nextDouble();
        System.out.print("Digite um valor para a variável B: ");
        double valor_b = teclado.nextDouble();

        if (valor_a <= valor_b) {
            System.out.print("Digite um valor para a variável N: ");
            int valor_n = teclado.nextInt();

            if (valor_n > 0) {
                double area_total = 0;
                double valor_x = valor_a;
                double valor_h = (valor_b - valor_a) / valor_n;
                double valor_y1 = Math.PI / 6;

                int i = 0;

                while (i < valor_n) {
                    valor_x = valor_x + valor_h;
                    double valor_y2 = Math.PI / 6;

                    double area_trapezio = ((valor_y1 + valor_y2) / 2) * valor_h;
                    area_total = area_total + area_trapezio;

                    valor_y1 = valor_y2;

                    i = i + 1;
                }

                System.out.print("O valor da área total é: " + area_total);

            } else {
                System.out.print("Erro: O valor da variável N deve ser maior que 0");
            }
        } else {
            System.out.print("Erro: O valor da variável A deve ser menor ou igual ao da variável B");
        }
    }
}
