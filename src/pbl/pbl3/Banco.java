package pbl.pbl3;

public class Banco {
    public static void main(String[] args) {
        Cliente Jandira = new Cliente("Jandira", 2500);
        Cliente Sandra_Rodrigues = new Cliente("Sandra Rodrigues", 1800);
        Cliente Luciana_Teixeira = new Cliente("Luciana Teixeira", 5000);

        Luciana_Teixeira.imprimir();
        Sandra_Rodrigues.imprimir();

        Jandira.imprimir();
        Jandira.retirar(1000);

        Sandra_Rodrigues.retirar(1000);
        Sandra_Rodrigues.depositar(500);
        Sandra_Rodrigues.imprimir();
        Sandra_Rodrigues.retirar(2000);
        Sandra_Rodrigues.imprimir();

        Luciana_Teixeira.depositar(1000);
        Luciana_Teixeira.imprimir();
    }
}
