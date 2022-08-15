package pbl.pbl4;

public class Cerveja extends Bebida {

    public Cerveja(String nome_fabricante, double preco_unidade, int qtd_estoque){
        super(nome_fabricante, preco_unidade, qtd_estoque);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\n");
    }
}
