package youtube.fonte;

public class Aula20 {
    public static void main(String[] args) {
        // Declarando uma matriz multidimensional
        double[][] notasAlunos = new double[10][3];

        // Exemplo de declaração sobre demanda
        int qtdDeAlunos = 6;
        int qtdDeNotas = 3;
        double[][] notasDosAlunos = new double[qtdDeAlunos][qtdDeNotas];
        notasDosAlunos[5][1] = 10;
        notasDosAlunos[4][1] = 10;
        notasDosAlunos[3][1] = 10;
        notasDosAlunos[2][1] = 10;
        notasDosAlunos[1][1] = 10;
        notasDosAlunos[0][1] = 10;

        // For aninhado para percorrer uma matriz
        for (int i = 0; i < notasDosAlunos.length; i++) {
            for (int j = 0; j < notasDosAlunos[i].length; j++) {
                System.out.println("Posição [" + i + "]" + "["+ j + "], Valor: " + notasDosAlunos[i][j]);
            }
            System.out.println();
        }
    }
}
