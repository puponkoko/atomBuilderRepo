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
        noStroke();

    }


    public void draw() {
        background(245, 245, 220);
        fill(0);
        textSize(32);
        text("Mass Number: " + (getProtons() + getNeutrons()), 400, 430);
        text("Atomic Number: " + getProtons(), 400, 465);
        text("Protons: " + getProtons(), 400, 500);
        text("Neutrons: " + getNeutrons(), 400, 535);
        text("Electrons: " + getElectrons(), 400, 570);
        fill(255);
        ellipse(400, 200, 300, 300);
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
        //System.out.println("Size: " + particles.size());
        //System.out.println("Counter: " + counter);
    }

    public int getProtons() {
        int counter = 0;
        for (Particle particle: particles) {
            if (particle instanceof Proton) {
                counter++;
            }
        }
        return counter;
    }

    public int getNeutrons() {
        int counter = 0;
        for (Particle particle: particles) {
            if (particle instanceof Neutron) {
                counter++;
            }
        }
        return counter;
    }

    public int getElectrons() {
        int counter = 0;
        for (Particle particle: particles) {
            if (particle instanceof Electron) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        PApplet.main("Simulation");
    }
}
