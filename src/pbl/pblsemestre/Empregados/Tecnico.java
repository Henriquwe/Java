package pbl.pblsemestre.Empregados;

import pbl.pblsemestre.Clubes.Clube;

import java.util.ArrayList;

public class Tecnico extends Funcionario {
    private String nome;
    private double salario;
    private ArrayList<String> patrocinios;

    public Tecnico(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        patrocinios = new ArrayList<>();
    }

    @Override
    public void associarClube(Clube clube, String nome, double salario) {
        clube.contratarTecnico(nome, salario);
    }

    @Override
    public void assinarPatrocinio(String nomePatrocinio, double pagamento) {
        System.out.println("Patrocínio assinado com:" + nomePatrocinio + " no valor de:" + pagamento);
        patrocinios.add(nomePatrocinio);
    }

    public void darEntrevista() {

    }
}
