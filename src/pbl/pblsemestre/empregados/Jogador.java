package pbl.pblsemestre.empregados;

import pbl.pblsemestre.clubes.Clube;

import java.util.ArrayList;

public class Jogador extends Funcionario {
    private String nome;
    private String nacionalidade;
    private double salario;
    private int idade;
    private ArrayList<String> patrocinios;

    public Jogador(String nome, String nacionalidade, double salario, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
        this.idade = idade;

        patrocinios = new ArrayList<>();
    }

    @Override
    public void associarClube(Clube clube, String nome, double salario) {
        clube.adicionarTitular(nome, nacionalidade, salario, idade);
    }

    @Override
    public void assinarPatrocinio(String nomePatrocinio, double pagamento) {
        System.out.println("Patrocínio assinado com:" + nomePatrocinio + " no valor de:" + pagamento);
        patrocinios.add(nomePatrocinio);
    }
}
