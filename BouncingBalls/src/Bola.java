public class Bola {
    //Propriedades da classe
    private int x = 0;
    private int y = 0 ;
    private int dx = 0;
    private int dy = 0;

    //Método construtor da classe
    public Bola() {
        x = ((int)(580 * Math.random()));
        y = ((int)(510 * Math.random()));

        dx = ((int)(10 * Math.random()));
        dy = ((int)(10 * Math.random()));

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
}
