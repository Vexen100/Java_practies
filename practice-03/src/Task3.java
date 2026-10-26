import java.util.Scanner;

public class Task3 {
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

        int[] result = transform(array);
        System.out.print("Массив B: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    static int[] transform(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                result[i] = array[i] % 10;
            } else {
                result[i] = array[i] + 9;
            }
        }
        return result;
    }
}
