import java.util.Scanner;

public class TestMovable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();
        System.out.println("Input y: ");
        float y = scanner.nextFloat();
        System.out.println("Input xSpeed: ");
        float xSpeed = scanner.nextFloat();
        System.out.println("Input ySpeed: ");
        float ySpeed = scanner.nextFloat();

        MovablePoint movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println("To String: "+movablePoint.toString());
        System.out.println("Move: "+movablePoint.move());
    }
}
