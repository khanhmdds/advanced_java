import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of array: ");
        int N = scanner.nextInt();
        int[] array = new int[N + 1];

        System.out.println("Input values of array: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Input number add to array ");
        int X = scanner.nextInt();

        System.out.print("Input index need to add: ");
        int index = scanner.nextInt();

        if (index < 0 || index > N) {
            System.out.println("Cannot add number to array");
        } else {
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            N++;

            System.out.println("Number " + X + " added to array with index " + index);
        }

        System.out.println("Final array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}