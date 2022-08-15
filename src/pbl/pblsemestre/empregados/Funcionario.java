package pbl.pblsemestre.empregados;

import pbl.pblsemestre.clubes.Clube;

abstract class Funcionario {
    private String nome;
    private Clube clube;
    private double salario;

    abstract void associarClube(Clube clube, String nome, double salario);

    abstract void assinarPatrocinio(String nomePatrocinio, double pagamento);
}
