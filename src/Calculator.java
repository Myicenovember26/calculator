import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double number1 = getInt();
        double number2 = getInt();
        char operation = getOperation();
        double result = calc(number1,number2,operation);
        System.out.println("Результат: " +result);
    }

    public static double getInt(){
        System.out.println("Введите число:");
        double number;
        if(scanner.hasNextDouble()){
            number = scanner.nextDouble();
        } else {
            System.out.println("Некорректное число");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Некорректный символ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double number1, double number2, char operation){
        double result;
        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            default -> {
                System.out.println("Некорректная операция");
                result = calc(number1, number2, getOperation());
            }
        }
        return result;
    }
}
