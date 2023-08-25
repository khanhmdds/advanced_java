import java.util.Scanner;

public class Test2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();
        System.out.println("Input y: ");
        float y = scanner.nextFloat();

        Point2D point2D = new Point2D(x, y);
        System.out.println(point2D.toString());
    }
}
