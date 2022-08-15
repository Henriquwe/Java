package pbl.pbl6;

public class Mensalista extends Temporario{
    private final double salario_mensal;

    public Mensalista(String nome, String funcao, int tempo_meses, double salario_mensal) {
        super(nome, funcao, tempo_meses);
        this.salario_mensal = salario_mensal;
    }

    public String gerar_contra_cheque() {
        super.gerar_contra_cheque();
        System.out.println("O salário mensal do mensalista é de: " + salario_mensal);
        return null;
    }
}
