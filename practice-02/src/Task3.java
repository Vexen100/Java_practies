import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (N > 0): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число.");
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше нуля.");
            return;
        }

        System.out.print("Цифры справа налево: ");
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n /= 10;
            if (n > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
