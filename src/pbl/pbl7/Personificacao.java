package pbl.pbl7;

public interface Personificacao extends Camuflagem {
    public default void personificar(Heroi h) {
        System.out.println(getClass() + " Personificando");
    }
}
