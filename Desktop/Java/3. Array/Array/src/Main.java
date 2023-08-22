import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input numbers in array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Input values in array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input number need delete: ");
        int X = sc.nextInt();

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X)
        }

    }
}