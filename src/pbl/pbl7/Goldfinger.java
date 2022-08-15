package pbl.pbl7;

public class Goldfinger extends Terrorista implements Personificacao {
    private Heroi heroi;

    public Goldfinger(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void saltar(float posicao_z) {
        super.saltar(posicao_z);
    }

    @Override
    public void camuflar(int c) {
        cor = c;
    }

    @Override
    public void personificar(Heroi h) {

    }

}
