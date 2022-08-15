package pbl.pbl7;

public class Heroi extends Personagem{
    public Heroi(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void correr(float posicao_x, float posicao_y) {
        super.correr(posicao_x, posicao_y);
    }

    @Override
    public void saltar(float posicao_z) {
        super.saltar(posicao_z);
    }
}
