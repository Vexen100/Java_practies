import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X (-1 < X < 1): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести вещественное число.");
            return;
        }

        double x = scanner.nextDouble();
        if (!(x > -1 && x < 1)) {
            System.out.println("Ошибка: должно выполняться условие |X| < 1.");
            return;
        }

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

        double sum = 0;
        for (long i = 0; i <= n; i++) {
            long degree = 2 * i + 1;
            double term = Math.pow(x, degree) / degree;
            if (i % 2 != 0) {
                term = -term;
            }
            sum += term;
        }

        System.out.println("Сумма ряда (приближение arctan(X)): " + sum);
    }
}
