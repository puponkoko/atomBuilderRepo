import processing.core.PApplet;


public class Simulation extends PApplet {
    Proton obj;

    public void settings() {
        size(800, 800);   // set the window size
    }


    public void setup() {
        obj = new Proton(200, 200);

    }


    public void draw() {
        background(0);
        obj.draw(this);

    }


    public static void main(String[] args) {
        PApplet.main("Simulation");
    }
}
