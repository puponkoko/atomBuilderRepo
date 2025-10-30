import processing.core.PApplet;

public interface Particle {
    int charge = 0;
    int size = 20;

    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    void setSize(int size);
    int getCharge();
    void draw(PApplet window);
}
