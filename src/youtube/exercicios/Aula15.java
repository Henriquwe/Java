package youtube.exercicios;

import java.util.Scanner;

import static java.lang.System.*;

public class Aula15 {
    public static void main(String[] args) {
        // Exercícios 12 da lista de exercícios referente a essa e as anteriores aulas Alt+125 }
        // https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

        Scanner teclado = new Scanner(System.in);
        float salarioPorHora;
        int horasTrabalhadas;

        out.println("Digite quando você ganha por hora trabalhada: ");
        salarioPorHora = teclado.nextFloat();
        out.println("Digite quantas horas você trabalhou nesse mês: ");
        horasTrabalhadas = teclado.nextInt();


        float salarioBruto = salarioPorHora * horasTrabalhadas;
        float impostoDeRenda;
        float valorInss;
        float valorFgts;
        float descontosTotal;
        float salarioLiquido;

        if(salarioBruto <= 900) {
            out.println("Nessa faixa salarial, você está isento do imposto de renda!");
            impostoDeRenda = salarioBruto;
            valorInss = (salarioBruto / 100) * 10;
            valorFgts = (salarioBruto / 100) * 11;
            descontosTotal = impostoDeRenda + valorInss + valorFgts;
            salarioLiquido = salarioBruto - (impostoDeRenda + valorInss + valorFgts);
        } else if (salarioBruto > 900 && salarioBruto < 1500) {
            out.println("Nessa faixa salarial, o desconto de IR é de 5%!");
            impostoDeRenda = (salarioBruto / 100) * 5;
            valorInss = (salarioBruto / 100) * 10;
            valorFgts = (salarioBruto / 100) * 11;
            descontosTotal = impostoDeRenda + valorInss + valorFgts;
            salarioLiquido = salarioBruto - (impostoDeRenda + valorInss + valorFgts);
        } else if (salarioBruto > 1500 && salarioBruto < 2500) {
            out.println("Nessa faixa salarial, o desconto de IR é de 10%!");
            impostoDeRenda = (salarioBruto / 100) * 10;
            valorInss = (salarioBruto / 100) * 10;
            valorFgts = (salarioBruto / 100) * 11;
            descontosTotal = impostoDeRenda + valorInss + valorFgts;
            salarioLiquido = salarioBruto - (impostoDeRenda + valorInss + valorFgts);
        } else {
            out.println("Nessa faixa salarial, o desconto de IR é de 20%!");
            impostoDeRenda = (salarioBruto / 100) * 20;
            valorInss = (salarioBruto / 100) * 10;
            valorFgts = (salarioBruto / 100) * 11;
            descontosTotal = impostoDeRenda + valorInss + valorFgts;
            salarioLiquido = salarioBruto - (impostoDeRenda + valorInss + valorFgts);
        }

        out.println("===FOLHA DE PAGAMENTO GERADA===\n");
        out.println("Salário Bruto: " + salarioBruto + " ("+salarioPorHora + "*" + horasTrabalhadas + ")");
        out.println("(-) Imposto de Renda: " + impostoDeRenda);
        out.println("(-) INSS (10%): " + valorInss);
        out.println("(-) FGTS (11%): " + valorFgts);
        out.println("Total dos descontos: " + descontosTotal);
        out.println("Salário Líquido: " + salarioLiquido);
    }
}
