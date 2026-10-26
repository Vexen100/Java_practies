import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размер матрицы: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода.");
            return;
        }
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Размер матрицы должен быть положительным.");
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Элементы матрицы по строкам:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Ошибка ввода.");
                    return;
                }
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                System.out.print(matrix[i][k] + " ");
            }
            for (int j = k + 1; j < n; j++) {
                System.out.print(matrix[n - k - 1][j] + " ");
            }
        }
        System.out.println();
    }
}
