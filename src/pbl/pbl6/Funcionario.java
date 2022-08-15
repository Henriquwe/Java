package pbl.pbl6;

public class Funcionario {
    protected String nome;
    protected String funcao;

    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String gerar_contra_cheque() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Função do funcionário: " + funcao);
        return null;
    }

}
