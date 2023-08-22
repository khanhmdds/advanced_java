import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Input values in array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Input number need to delete: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
            System.out.println("Number " + X + " is deleted from array");
        } else {
            System.out.println("Cannot find " + X + " in array");
        }

        System.out.println("Final Array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

    }
}