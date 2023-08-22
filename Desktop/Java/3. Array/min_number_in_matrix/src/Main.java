import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.println("Number of row: ");
        int rows = scanner.nextInt();
        System.out.println("Number of column: ");
        int cols = scanner.nextInt();

        // Khởi tạo ma trận
        double[][] matrix = new double[rows][cols];

        // Nhập giá trị cho ma trận
        System.out.println("Input values to matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất và tọa độ của nó
        double minElement = matrix[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        // In ra kết quả
        System.out.println("Max number in matrix: " + minElement);
        System.out.println("Index of max number: (" + minRow + ", " + minCol + ")");

        scanner.close();
    }
}