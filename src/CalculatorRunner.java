import java.util.Scanner;

public class CalculatorRunner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            double number1 = CalculatorUtils.getNumber();
            double number2 = CalculatorUtils.getNumber();
            char operation = CalculatorUtils.getOperation();
            double result = CalculatorUtils.calculate(number1, number2, operation);
            System.out.println("Результат: " + result);
            CalculatorUtils.Exit();
            scanner.next();
        }
        }
    }

