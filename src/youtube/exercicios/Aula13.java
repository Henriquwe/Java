package youtube.exercicios;

// Imports:
import java.util.Scanner;

import static java.lang.System.*;

public class Aula13 {
    public static void main(String[] args) {
        // Exercício 13 da lista referente à essas aulas
        // https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
        Scanner teclado = new Scanner(in);
        float salarioPorHora;
        int horasTrabalhadas;

        out.println("Digite seu salário por hora: ");
        salarioPorHora = teclado.nextFloat();
        out.println("Digite quantas horas você trabalhou no mês: ");
        horasTrabalhadas = teclado.nextInt();

        float salarioBruto = salarioPorHora * horasTrabalhadas;
        float impostoDeRenda = (salarioBruto / 100) * 11;
        float valorInss = (salarioBruto / 100) * 8;
        float valorSindicato = (salarioBruto / 100) * 5;
        float salarioLiquido = salarioBruto - (impostoDeRenda + valorInss + valorSindicato);

        out.println("Carta bancária do mês:\n");
        out.println("Salário bruto: " + salarioBruto);
        out.println("Imposto de renda: " + impostoDeRenda);
        out.println("Valor do INSS: " + valorInss);
        out.println("Valor pago ao Sindicato: " + valorSindicato);
        out.println("Salário líquido rececebido com os descontos aplicados: " + salarioLiquido);
    }
}
