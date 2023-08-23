// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

    public static class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "Blue";

        public int getSpeed() {
            return this.speed;
        }
        public boolean getOn() {
            return this.on;
        }
        public double getRadius() {
            return this.radius;
        }
        public String getColor() {
            return this.color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public void setOn(boolean on) {
            this.on = on;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public Fan() {

        }
        public String toString() {
            if (on == true) {
                return "Fan is on with: speed = "+speed+", color = "+color+", radius = "+radius;
            }
            else {
                return "Fan is off with: color = "+color+", radius = "+radius;
            }
        }
    }
}