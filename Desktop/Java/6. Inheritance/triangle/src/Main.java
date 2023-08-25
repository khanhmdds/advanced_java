import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color: ");
        String color = scanner.nextLine();
        Shape shape = new Shape(color);
        System.out.println(shape.toString());
    }
}