import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Input Side 3: ");
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle.toString());
    }
}
