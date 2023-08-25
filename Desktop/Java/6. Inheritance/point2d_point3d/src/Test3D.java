import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();
        System.out.println("Input y: ");
        float y = scanner.nextFloat();
        System.out.println("Input z: ");
        float z = scanner.nextFloat();

        Point3D point3D = new Point3D(x, y, z);
        System.out.println(point3D.toString());
    }
}
