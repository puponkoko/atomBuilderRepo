import processing.core.PApplet;

public class Electron implements Particle {
        private int x, y;
        private int size;
        private int charge = -1;
        private boolean isClicked;
        private int magnetFactor;
        private int randomAngle;
        private boolean isInList;

        public Electron(int x, int y) {
            this.x = x;
            this.y = y;
            size = 10;
            magnetFactor = 30;
            randomAngle = (int) (Math.random() * 361);
            isInList = false;
        }

    @Override
    public void draw(PApplet window) {
        window.fill(255, 0, 0);
        if (window.mousePressed && !isClicked && !getListStatus()) {
            System.out.println("test");
            randomAngle = (int) (Math.random() * 361);
            isClicked = true;
            window.ellipse(window.mouseX, window.mouseY, size, size);
            setX(window.mouseX);
            setY(window.mouseY);
        } else if (window.mousePressed && isClicked) {
            // window.ellipse(300, 200, size * 30, size * 30);
            window.ellipse(window.pmouseX, window.pmouseY, size, size);
            setX(window.pmouseX);
            setY(window.pmouseY);
        } else if (getX() < 550 && getX() > 250 && getY() < 350 && getY() > 50) {
            //window.ellipse(300, 200, size * magnetFactor, size * magnetFactor);

            int newX = (int) (((Math.cos(Math.toRadians(randomAngle)))) * (size * magnetFactor/2)) + 400;
            int newY = (int) (((Math.sin(Math.toRadians(randomAngle)))) * (size * magnetFactor/2)) + 200;

            //System.out.println(newX + " " + newY);
            window.ellipse(newX, newY, size , size);

//            setX(500);
//            setY(200);
            // System.out.println("Less than 400");
            isClicked = false;
        } else {
            setX(500);
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
}

