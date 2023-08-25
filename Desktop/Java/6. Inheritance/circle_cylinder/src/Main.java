import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        System.out.println("Input height: ");
        double height = scanner.nextDouble();

        Circle circle = new Circle(radius, color);
        Cylinder cylinder = new Cylinder(radius, color, height);

        System.out.println("Circle area = "+circle.getArea());
        System.out.println(circle.toString());


        System.out.println("Cylinder volume = "+cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}