import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            if (!scanner.hasNextLine()) {
                return;
            }
            String choice = scanner.nextLine().trim();
            if (choice.equals("1")) {
                if (!runCalculation(scanner)) {
                    System.out.println("До свидания!");
                    return;
                }
            } else if (choice.equals("2")) {
                printProgramInfo();
            } else if (choice.equals("3")) {
                printDeveloperInfo();
            } else if (choice.equals("4")) {
                System.out.println("До свидания!");
                return;
            } else {
                System.out.println("Ошибка: выберите пункт от 1 до 4.");
            }
            System.out.println();
        }
    }

    static void printMenu() {
        System.out.println("=== Главное меню ===");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Ваш выбор: ");
    }

    static boolean runCalculation(Scanner scanner) {
        double[] data = new double[2];
        while (true) {
            if (!readInput(scanner, data)) {
                return false;
            }
            calculate(data);
            if (!isValidResult(data[1])) {
                System.out.println("Ошибка: результат слишком велик. Введите меньшее x.");
                continue;
            }
            printResult(data);
            return true;
        }
    }

    static boolean readInput(Scanner scanner, double[] data) {
        while (true) {
            System.out.print("Введите x > 0 (0 — выход): ");
            if (!scanner.hasNextLine()) {
                return false;
            }
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                return false;
            }
            Scanner numberScanner = new Scanner(input);
            if (!numberScanner.hasNextDouble()) {
                System.out.println("Ошибка: введите одно число или 0 для выхода.");
                continue;
            }
            double x = numberScanner.nextDouble();
            if (numberScanner.hasNext()) {
                System.out.println("Ошибка: введите только одно число.");
                continue;
            }
            if (!isValidInput(x)) {
                System.out.println("Ошибка: x должно быть положительным конечным числом.");
                continue;
            }
            data[0] = x;
            return true;
        }
    }

    static boolean isValidInput(double x) {
        return x > 0 && Double.isFinite(x);
    }

    static boolean isValidResult(double y) {
        return Double.isFinite(y);
    }

    static void calculate(double[] data) {
        double x = data[0];
        data[1] = Math.pow(x, 5) + Math.pow(Math.log(x), 3)
                + Math.sqrt(Math.pow(x, 3));
    }

    static void printResult(double[] data) {
        System.out.println("Результат: y = " + data[1]);
    }

    static void printProgramInfo() {
        System.out.println("Программа вычисляет y = x^5 + ln(x)^3 + sqrt(x^3).");
        System.out.println("Область допустимых значений: x > 0.");
    }

    static void printDeveloperInfo() {
        System.out.println("Разработчик:");
        System.out.println("Олейников Иван");
    }
}
