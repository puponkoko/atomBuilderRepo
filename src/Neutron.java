import processing.core.PApplet;

public class Neutron implements Particle {
    private int x, y;
    private int size;
    private int charge = 0;
    private boolean isClicked;

    public Neutron(int x, int y) {
        this.x = x;
        this.y = y;
        size = 20;
    }

    @Override
    public void draw(PApplet window) {
        window.fill(211);
        if (window.mousePressed && Math.abs(window.mouseX - getX()) <= 20 && Math.abs(window.mouseY - getY()) <= 20 && !isClicked) {
            System.out.println("test");
            isClicked = true;
            window.ellipse(window.mouseX, window.mouseY, size, size);
            setX(window.mouseX);
            setY(window.mouseY);
        } else if (window.mousePressed && isClicked) {
            window.ellipse(window.pmouseX, window.pmouseY, size, size);
            setX(window.pmouseX);
            setY(window.pmouseY);
        } else if (getY() < 400) {
            window.ellipse(400, 200, size, size);
            setX(400);
            setY(200);
            // System.out.println("Less than 400");
            isClicked = false;
        } else {
            window.ellipse(400, 500, size, size);
            setX(400);
            setY(500);
            isClicked = false;
        }
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

