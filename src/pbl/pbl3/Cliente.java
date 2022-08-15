package pbl.pbl3;

public class Cliente {
    private String nome = "";
    private double saldo = 0.0;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public void imprimir() {
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Saldo do cliente:" + saldo);
    }
}
