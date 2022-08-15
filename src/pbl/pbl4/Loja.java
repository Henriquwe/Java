package pbl.pbl4;

import java.util.ArrayList;

public class Loja {
    private final String nome;
    private final ArrayList<Bebida> drinks;

    public Loja(String nome){
        this.nome = nome;

        drinks = new ArrayList<>();
    }

    public void add_bebida_cerveja(String nome, double valor, int estoque) {
        drinks.add(new Cerveja(nome, valor, estoque));
    }

    public void add_bebida_vinho(String nome, double valor, int estoque, int ano, String pais, String cor, String uva) {
        new Vinho(nome, valor, estoque, ano, pais, cor, uva);
    }

    public void imprimir(){
        System.out.println("nome da loja: " + nome);
        System.out.println("\n");
        imprimir_bebidas();
    }

    private void imprimir_bebidas(){
        System.out.println("Bebidas em estoque: ");
        for (Bebida b : drinks) {
            b.imprimir();
        }
    }
}
