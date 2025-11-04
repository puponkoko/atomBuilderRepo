import processing.core.PApplet;

import java.util.ArrayList;


public class Simulation extends PApplet {
    Particle obj;
    ArrayList<Particle> particles = new ArrayList<>();
    int counter = 0;

    public void settings() {
        size(800, 800);
        // set the window size
    }


    public void setup() {


    }


    public void draw() {
        background(255);
        if (mousePressed && counter < 1 && mouseX < 267) {
            obj = new Proton(mouseX, mouseY);
            counter++;
        } else if (mousePressed && counter < 1 && mouseX < 533) {
            obj = new Neutron(mouseX, mouseY);
            counter++;
        } else if (mousePressed && counter < 1 && mouseX < 800) {
            obj = new Electron(mouseX, mouseY);
            counter++;
        }
        if (obj instanceof Proton || obj instanceof Neutron || obj instanceof Electron) {
            obj.draw(this);
            if (obj.getY() < 400 && !mousePressed && counter > 0) {
                counter = 0;
                particles.add(obj);
            }
        }
        for (Particle particle: particles)
            particle.draw(this);
        System.out.println("Size: " + particles.size());
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        PApplet.main("Simulation");
    }
}
