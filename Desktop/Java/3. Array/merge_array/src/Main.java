import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of array 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Input values of array 1: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Input length of array 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Input values of array 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Gán giá trị từ mảng 2 vào mảng 3, tính từ vị trí size1
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In ra mảng 3 sau khi hợp nhất
        System.out.println("Final Array:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}