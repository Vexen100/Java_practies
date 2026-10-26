import java.util.Scanner;

public class Task2 {
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

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        System.out.println("Количество различных элементов: " + count);
    }
}
