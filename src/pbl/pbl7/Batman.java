package pbl.pbl7;

public class Batman extends Heroi implements Camuflagem {
    public Batman(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void atirar() {
        super.atirar();
    }

    public void camuflar(int c) {

    }
}
