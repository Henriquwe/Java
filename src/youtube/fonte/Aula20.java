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

        // Matrizes de 3 DIMENSÕES
        // Nomear de acordo com cada elemento dos vetores únicos, no plural. Ex: matrizNotasFaltasPresencas
        int linhas = 3;
        int colunas = 3;
        int espacos = 3;
        int[][][] matrizLinhasColunasEspacos = new int[linhas][colunas][espacos];

        for (int i = 0; i < matrizLinhasColunasEspacos.length; i++) {
            for (int j = 0; j < matrizLinhasColunasEspacos[i].length; j++) {
                for (int k = 0; k < matrizLinhasColunasEspacos[j].length; k++) {
                    System.out.println("Posição [" + i + "]" + "["+ j + "]" + "[" + k + "]"
                            + "Valor: " + matrizLinhasColunasEspacos[i][j][k]);
                }
            }
            System.out.println();
        }

        // Matriz Irregular
        int[][] arrayIrregular = new int[3][];

    }
}
