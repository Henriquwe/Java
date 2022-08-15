package pbl.pbl6;

public class Horista extends Temporario{
    private final int horas_trabalhadas;
    private final double valor_da_hora;

    public Horista(String nome, String funcao, int tempo_meses, int horas_trabalhadas, double valor_da_hora) {
        super(nome, funcao, tempo_meses);
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_da_hora = valor_da_hora;
    }

    public String gerar_contra_cheque() {
        super.gerar_contra_cheque();
        System.out.println("As horas trabalhadas pelo horista foram: " + horas_trabalhadas);
        System.out.println("O valor da hora desse horista é de: " + valor_da_hora);
        return null;
    }
}
