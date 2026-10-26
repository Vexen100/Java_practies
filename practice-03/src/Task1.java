import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размер массива: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Размер массива не может быть отрицательным.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Элементы массива:");
        for (int i = 0; i < array.length; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода.");
                return;
            }
            array[i] = scanner.nextInt();
        }

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(array[left] + " ");
                left++;
            }
            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(array[right] + " ");
                right--;
            }
        }
        System.out.println();
    }
}
