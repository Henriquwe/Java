package pbl.pbl6;

import java.util.ArrayList;

public class Empresa {
    private final String nome;
    private final ArrayList<Funcionario> funcionarios;
    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void gerar_folha() {
        System.out.println("Correspondente folha pagamento gerada: \n");
        for (Funcionario f : funcionarios) {
            f.gerar_contra_cheque();
            System.out.println("\n");
        }
    }

    public void incluir(Funcionario novo_funcionario) {
        funcionarios.add(novo_funcionario);
    }

    public String getNome() {
        return nome;
    }
}
