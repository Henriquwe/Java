package pbl.pbl4;

import java.util.Scanner;

public class AppBeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;

        Loja Cooldown = new Loja("Cooldown");
        Cerveja Brahma = new Cerveja("Brahma", 2.99, 15);
        Cerveja Kaiser = new Cerveja("Kaiser", 0.99, 15);
        Cerveja Itaipava = new Cerveja("Brahma", 3.99, 15);
        Vinho Campo_Largo = new Vinho("Campo Largo", 10.99, 8, 2012, "Brasil", "Tinto", "Cabernet Sauvignon");
        Vinho Quinta_Do_Mouro = new Vinho("Campo Largo", 100000.99, 8, 2012, "Brasil", "Tinto", "Cabernet Sauvignon");

        Cooldown.add_bebida_cerveja("Trama", 4.0, 50);

        while (on) {
            System.out.println("Bem vindo ao Sistema da Loja Cooldown");
            System.out.println("""
                    Opções:\s
                    [0] - Sair\s
                    [1] - Visualizar Catalogo\s
                    [2] - Procurar pela marca\s
                    [3] - Adicione uma cerveja\s
                    [4] - Adicione um vinho\s
                    [5] - Selecionar uma bebida do catalogo e comprar uma quantidade\s
                    [6] - Selecionar uma bebida do catalogo e vender uma quantidade\s
                    [7] - Selecionar uma bebida do catalogo e atualizar seu preco\s
                    """);

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Saindo do programa :)");
                    on = false;
                    break;

                case 2:
                    Cooldown.imprimir();
                    break;

                case 3:

                case 4:
                    Cooldown.add_bebida_cerveja("Vodka", 4.0, 50);
                    System.out.println("Cerveja adicionada!");
                    break;
                case 5:
                    Cooldown.add_bebida_vinho("Chardoneufh", 50000, 1, 1991,
                            "Russia", "Roxo", "Moscow");
                    System.out.println("Vinho adicionado!");
                    break;
                case 6:
                    Cooldown.imprimir();
                    Brahma.comprar(15);
                    Campo_Largo.comprar(15);
                case 7:
                    Cooldown.imprimir();
                    Brahma.vender(40);
                    Campo_Largo.vender(3);
                case 8:
                    Brahma.atualizar_preco(4.5);
            }

        }



    }
}
