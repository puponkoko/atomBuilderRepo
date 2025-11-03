import processing.core.PApplet;


public class Simulation extends PApplet {
    Particle obj1;
    Particle obj2;
    Particle obj3;

    public void settings() {
        size(800, 800);   // set the window size
    }


    public void setup() {
        obj1 = new Neutron(500, 400);
        obj2 = new Proton(400, 400);
        obj3 = new Electron(600, 400);

    }


    public void draw() {
        background(255);
        obj1.draw(this);
        obj2.draw(this);
        obj3.draw(this);
       // System.out.println(obj1.getX() + ", " + obj1.getY());
       // System.out.println(obj2.getX() + ", " + obj2.getY());
       // System.out.println(obj3.getX() + ", " + obj3.getY());


    }

    public static void main(String[] args) {
        PApplet.main("Simulation");
    }
}
