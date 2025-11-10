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
    void setListStatus(boolean b);
    boolean getListStatus();
    void draw(PApplet window);
}
