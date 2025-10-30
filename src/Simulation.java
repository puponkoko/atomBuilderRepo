import processing.core.PApplet;


public class Simulation extends PApplet {
    public void settings() {
        size(800, 800);   // set the window size
    }


    public void setup() {
    }


    public void draw() {
        background(0);
        Proton obj = new Proton(100, 100);

        obj.draw(this);
    }


    public static void main(String[] args) {
        PApplet.main("Simulation");
    }
}
