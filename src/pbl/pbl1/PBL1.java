package pbl.pbl1;
import java.util.Scanner;

// RE-ENTREGANDO FORA DA DATA POIS O SENHOR PEDIU PARA QUE FOSSE ENTREGUE
// EM GRUPOS E A GENTE AINDA NÃO ESTAVA EM GRUPO, MAS A PRIMEIRA ENTREGA FOI NA DATA
//Nome dos integrantes:
//Henrique Alves
//Matheus Bellozupko
//Guilherme Ratzke
//Thomas Frenzel

public class PBL1 {
    public static void main(String[] args) {
        //Declarando o Digitalizador utilizado para ler dados de entrada
        Scanner teclado = new Scanner(System.in);
        //Pegando o valor do primeiro termo atribuindo à variável A1
        System.out.println("Digite o valor do primeiro termo da P.A");
        float a1 = teclado.nextFloat();
        //Pegando o valor da razão e atribuindo à variável R
        System.out.println("Digite o valor da razão da P.A");
        float r = teclado.nextFloat();
        //Pegando o número de termos e atribuindo à variável N
        System.out.println("Digite o número de termos da P.A");
        float n = teclado.nextFloat();
        //Realizando a conta de progressão aritmética
        float an = a1 + (n - 1) * r;
        //Mostrando o resultado no terminal
        System.out.println("Último termo da P.A: " + an);
        //Realizando a fórmula da soma dos nn primeiros termos de uma PA
        double sn = (a1 + an) * n * 2;
        //Mostrando o resultado da fórmula no terminal
        System.out.println("A soma de todos termos da P.A é: " + sn);
    }
}
