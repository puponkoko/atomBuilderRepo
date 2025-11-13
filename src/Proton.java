import processing.core.PApplet;

import java.awt.*;


public class Proton implements Particle {
    private int x, y;
    private int size;
    private int charge = 1;
    private boolean isClicked;
    private int magnetFactor;
    private int randomAngle;
    private int randomNumberX;
    private int randomNumberY;
    private boolean isInList;

    public Proton(int x, int y) {
        this.x = x;
        this.y = y;
        size = 20;
        magnetFactor = 2;
        randomAngle = (int) (Math.random() * 361);
        randomNumberX = (int)((Math.random() * 2 - 1) * 40 + 400);
        randomNumberY = (int)((Math.random() * 2 - 1) * 40 + 200);
        isInList = false;
    }

    @Override
    public void draw(PApplet window) {
        window.fill(0, 0, 255);
        //System.out.println(getX() + ", " + getY());
        if (window.mousePressed && !isClicked && !getListStatus()) {
            System.out.println("test");
            isClicked = true;
            window.ellipse(window.mouseX, window.mouseY, size, size);
            setX(window.mouseX);
            setY(window.mouseY);
        } else if (window.mousePressed && isClicked) {
            window.ellipse(window.pmouseX, window.pmouseY, size, size);
            setX(window.pmouseX);
            setY(window.pmouseY);
        } else if (getX() < 550 && getX() > 250 && getY() < 350 && getY() > 50) {
            int newX = randomNumberX + (int)(Math.random() * 2.2 - 1.1);
            int newY = randomNumberY + (int)(Math.random() * 2.2 - 1.1);
        //    System.out.println(newX + " " + newY);
            window.ellipse(newX, newY, size , size);
            isClicked = false;
        } else {
            setX(300);
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

    @Override
    public void setListStatus(boolean b) {
        isInList = b;
    }

    @Override
    public boolean getListStatus() {
        return isInList;
    }

    public void update() {

    }


}
