package pbl.pblsemestre.Empregados;

import pbl.pblsemestre.Clubes.Clube;

abstract class Funcionario {
    private String nome;
    private Clube clube;
    private double salario;

    abstract void associarClube(Clube clube, String nome, double salario);

    abstract void assinarPatrocinio(String nomePatrocinio, double pagamento);
}
