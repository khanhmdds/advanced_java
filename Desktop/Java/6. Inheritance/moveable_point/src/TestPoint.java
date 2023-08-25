import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();
        System.out.println("Input y: ");
        float y = scanner.nextFloat();

        Point point = new Point(x, y);
        System.out.println(point.toString());

    }
}
