package pbl.pbl7;

public interface Camuflagem {
    public default void camuflar(int c) {
        System.out.println(getClass() + " Camuflando...");
    }
}
