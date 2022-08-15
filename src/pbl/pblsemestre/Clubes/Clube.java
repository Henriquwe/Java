package pbl.pblsemestre.Clubes;

import pbl.pblsemestre.Empregados.Jogador;

import java.util.ArrayList;

public class Clube {
    private String nome;
    private String sigla;
    private double faturamento;
    private Jogador jogador;
    private String tecnico;
    private ArrayList<Jogador> titulares;
    private ArrayList<Jogador> reservas;

    public Clube(String nome, String sigla, double faturamento, String tecnico) {
        this.nome = nome;
        this.sigla = sigla;
        this.faturamento = faturamento;
        this.tecnico = tecnico;
        titulares = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarTitular(String nome, String nacionalidade, double salario, int idade) {
        jogador = new Jogador(nome, nacionalidade, salario, idade);
        titulares.add(jogador);
    }

    public void adicionarReservas(String nome, String nacionalidade, double salario, int idade) {
        jogador = new Jogador(nome, nacionalidade, salario, idade);
        reservas.add(jogador);
    }

    public void receberFundos(double valorRecebido) {
        System.out.println("O valor " + valorRecebido + " foi recebido!");
        faturamento += valorRecebido;
    }

    public void retirarFundos(double valorRetirado) {
        System.out.println("O valor " + valorRetirado + " foi retirado!");
        faturamento -= valorRetirado;
    }

    public void contratarTecnico(String nome, double salario) {
        System.out.println("O técnico " + nome + " agora é treinador do clube!");
        System.out.println("Salário:" + salario);
    }
}
