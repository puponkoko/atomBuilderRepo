import processing.core.PApplet;

public class Neutron implements Particle {
    private int x, y;
    private int size;
    private int charge = 0;

    public Neutron(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(PApplet window) {
        window.ellipse(x, y, size, size);
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

