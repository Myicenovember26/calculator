import java.util.Scanner;
public class CalculatorUtils extends CalculatorRunner {
    public static double getNumber() {
        System.out.println("Введите число:");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Некорректное число");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
        public static char getOperation() {
            System.out.println("Введите операцию:");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Некорректный символ");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }
    public static double calculate(double number1, double number2, char operation) {
        double result;
        switch (operation) {
            case '+' -> result = Operation.Adding(number1, number2);
            case '-' -> result = Operation.Subtraction(number1, number2);
            case '*' -> result = Operation.Multiplication(number1, number2);
            case '/' -> result = Operation.Division(number1, number2);
            default -> {
                System.out.println("Некорректная операция");
                result = calculate(number1, number2, CalculatorUtils.getOperation());
            }
        }
        return result;
    }
    public static void Exit() {
        String Y;
        System.out.println("Для выхода введите 'Y'");
        Scanner in = new Scanner(System.in);
        if (scanner.hasNext(Y="Y")) {System.exit(0);
        }
    }
}