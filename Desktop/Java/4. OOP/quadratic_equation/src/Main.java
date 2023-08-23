import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double discriminant = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (discriminant >= 0) {
            if (discriminant == 0) {
                System.out.println("The equation has 1 solution: x = "+root1);
            } else {
                System.out.println("The equation has 2 solutions: x1 = "+root1 + ", x2 = "+root2 );
            }
        }
        else {
            System.out.println("The equation has no roots");
        }
    }

    public static class QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b  = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            return ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        }

        public double getRoot2() {
            return ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        }
    }
}