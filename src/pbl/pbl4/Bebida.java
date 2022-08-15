package pbl.pbl4;

public class Bebida {
    private final String nome_fabricante;
    private double preco_unidade;
    private int qtd_estoque;

    public Bebida(String nome_fabricante, double preco_unidade, int qtd_estoque) {
        this.nome_fabricante = nome_fabricante;
        this.preco_unidade = preco_unidade;
        this.qtd_estoque = qtd_estoque;
    }

    public void imprimir() {
        System.out.println("Nome do fabricante: " + nome_fabricante);
        System.out.println("Preço unitário: " + preco_unidade);
        System.out.println("Qntd. em estoque: " + qtd_estoque);
    }

    public void vender(int qtd) {
        if (qtd <= qtd_estoque)    qtd_estoque -= qtd;
    }

    public void comprar(int qtd) {
        qtd_estoque += qtd;
    }

    public void atualizar_preco(double preco) {
        preco_unidade = preco;
    }
}
