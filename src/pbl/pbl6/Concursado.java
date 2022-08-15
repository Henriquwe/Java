package pbl.pbl6;

public class Concursado extends Funcionario{
    protected int ano_ingresso;
    protected double salario_mensal;

    public Concursado(String nome, String funcao, int ano_ingresso, double salario_mensal) {
        super(nome, funcao);
        this.ano_ingresso = ano_ingresso;
        this.salario_mensal = salario_mensal;
    }

    public String gerar_contra_cheque() {
        super.gerar_contra_cheque();
        System.out.println("Ano de ingresso do concursado: " + ano_ingresso);
        System.out.println("Salário mensal do concursado: " + salario_mensal);
        return null;
    }
}
