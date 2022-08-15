package pbl.pbl7;

public class Ladrao extends Vilao{
    public Ladrao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void saltar(float posicao_z) {
        super.saltar(posicao_z);
    }
}
