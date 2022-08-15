package pbl.pbl4;

public class Vinho extends Bebida {
    private final int ano;
    private final String pais;
    private final String cor;
    private final String uva;

    public Vinho (String nome_fabricante, double preco_unidade, int qtd_estoque, int ano, String pais, String cor, String uva) {
        super(nome_fabricante, preco_unidade, qtd_estoque);
        this.ano = ano;
        this.pais = pais;
        this.cor = cor;
        this.uva = uva;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Vinho");
        System.out.println("Ano: " + ano);
        System.out.println("País: " + pais);
        System.out.println("Cor: " + cor);
        System.out.println("Uva: " + uva);
        System.out.println("\n");
    }

}
