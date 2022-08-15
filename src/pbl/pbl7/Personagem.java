package pbl.pbl7;

public class Personagem {
    private boolean vivo;
    protected float posicao_x;
    protected float posicao_y;
    protected  float posicao_z;
    protected int cor;

    public Personagem(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
            this.vivo = vivo;
            this.posicao_x = posicao_x;
            this.posicao_y = posicao_y;
            this.posicao_z = posicao_z;
            this.cor = cor;
    }

    public void correr(float x, float y) {
        posicao_x = x;
        posicao_y = y;
        System.out.println(getClass() + " Correndo...");
    }

    public void saltar(float z) {
        posicao_z = z;
        System.out.println(getClass() + " Saltando...");
    }

    public void atirar() {
        System.out.println(getClass() + " Atirando...");
    }

    public void morrer() {
        vivo = false;
    }
}
