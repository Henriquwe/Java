package pbl.pbl6;

public class Temporario extends Funcionario{
    protected int tempo_meses;

    public Temporario(String nome, String funcao, int tempo_meses) {
        super(nome, funcao);
        this.tempo_meses = tempo_meses;
    }
}
