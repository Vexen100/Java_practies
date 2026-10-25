import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (N >= 1): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: необходимо ввести целое число.");
            return;
        }

        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: N должно быть не меньше 1.");
            return;
        }

        if (n == 1) {
            System.out.println("Сумма не определена: ln(1) = 0.");
            return;
        }

        double sum = 0;
        for (long i = 2; i <= n; i++) {
            sum += 1.0 / Math.log(i);
        }

        System.out.println("Сумма определенных слагаемых (от 2 до N): " + sum);
    }
}
