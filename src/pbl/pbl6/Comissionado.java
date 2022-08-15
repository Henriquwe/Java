package pbl.pbl6;

public class Comissionado extends Concursado{
    private final double comissao;
    private final String cargo;

    public Comissionado(String nome, String funcao, int ano_ingresso,
                        double salario_mensal, double comissao, String cargo) {
        super(nome, funcao, ano_ingresso, salario_mensal);
        this.comissao = comissao;
        this.cargo = cargo;
    }

    public String gerar_contra_cheque() {
        super.gerar_contra_cheque();
        System.out.println("A comissão do funcionário comissionado é: " + comissao);
        System.out.println("O cargo do funcionário comissionado é: " + cargo);
        return null;
    }
}
