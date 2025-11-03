import processing.core.PApplet;

public class Electron implements Particle {
        private int x, y;
        private int size;
        private int charge = -1;
        private boolean isClicked;

        public Electron(int x, int y) {
            this.x = x;
            this.y = y;
            size = 10;
        }

    @Override
    public void draw(PApplet window) {
        window.fill(255, 0, 0);
        if (window.mousePressed && Math.abs(window.mouseX - getX()) <= 10 && Math.abs(window.mouseY - getY()) <= 10 && !isClicked) {
            System.out.println("test");
            isClicked = true;
            window.ellipse(window.mouseX, window.mouseY, size, size);
        } else if (window.mousePressed && isClicked){
            window.ellipse(window.pmouseX, window.pmouseY, size, size);
        } else {
            window.ellipse(600, 400, size, size);
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

