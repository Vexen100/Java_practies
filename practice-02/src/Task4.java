import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести вещественное число.");
            return;
        }
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести вещественное число.");
            return;
        }
        double b = scanner.nextDouble();

        printInterval(a, b);
    }

    static void printInterval(double a, double b) {
        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            System.out.println("Ошибка: числа должны быть конечными.");
            return;
        }
        if (a == b) {
            System.out.println("Ошибка: числа a и b должны быть различными.");
            return;
        }

        double min = Math.min(a, b);
        double max = Math.max(a, b);
        double c = Math.ceil(max);
        double d = Math.floor(min);

        if (c == 0) {
            c = 0;
        }
        if (d == 0) {
            d = 0;
        }

        System.out.println("Числа по возрастанию: " + min + ", " + max);
        System.out.printf("c = %.0f, d = %.0f%n", c, d);
        System.out.printf("Итоговый интервал: %.0f >= %s > %s >= %.0f%n",
                c, max, min, d);
    }
}
