package pbl.pbl7;

public class Teste {
    public static void main(String[] args) {
        Coringa Coringa = new Coringa(true, 5, 10, 0, 1);
        DrNo DrNo = new DrNo(true, 5, 10, 0, 1);
        Goldfinger Goldfinger = new Goldfinger(true, 5, 10, 0, 1);
        Pinguim Pinguim = new Pinguim(true, 5, 10, 0, 1);

        Batman Batman = new Batman(true, 5, 10, 0, 1);
        JamesBond JamesBound = new JamesBond(true, 5, 10, 0, 1);

        Coringa.correr(6, 11);
        Coringa.atirar();
        Coringa.saltar(12);
        Coringa.morrer();

        DrNo.correr(7, 18);
        DrNo.morrer();

        Goldfinger.camuflar(9);
        Goldfinger.personificar(Batman);
        Goldfinger.correr(5, 60);

        Pinguim.saltar(70);

        Batman.camuflar(50);
        Batman.correr(40, 50);
        Batman.saltar(100);
        Batman.atirar();

        JamesBound.atirar();
        JamesBound.atirar();
        JamesBound.morrer();
    }
}
