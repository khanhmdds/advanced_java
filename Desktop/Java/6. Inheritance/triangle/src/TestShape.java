import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        Shape shape = new Shape(color);
        System.out.println(shape.toString());
    }
}
