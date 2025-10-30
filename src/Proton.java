import processing.core.PApplet;


public class Proton implements Particle {
    private int x, y;
    private int size;
    private int charge = 1;

    public Proton(int x, int y) {
        this.x = x;
        this.y = y;
        size = 20;
    }

    @Override
    public void draw(PApplet window) {
        window.ellipse(x, y, size, size);
        window.fill(100, 100, 100);
    }

    @Override
    public int getX() {
        return x;
    }
    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getCharge() {
        return charge;
    }


}
