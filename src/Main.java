import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valueOne;
        double valueTwo;
        String operator;
        boolean continues;

        do {
            System.out.println("Enter first number: ");
            valueOne = scanner.nextDouble();

            System.out.println("Enter an operator ( +, -, /, *, ^): ");
            operator = scanner.next();

            System.out.println("Enter second number: ");
            valueTwo = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Result: " + realizeCalc(valueOne, valueTwo, operator));

            continues = verifyNewOperation(scanner);
        }while (continues);
    }

    public static boolean verifyNewOperation(Scanner sc) {

        System.out.println("Do you want to perform another operation? (y/n): ");
        return !sc.nextLine().toLowerCase(Locale.ROOT).equals("n");
    }

    public static double realizeCalc(Double valueOne, Double valueTwo, String operator) {
        double result = 0.0;

        switch (operator){
            case "+":
                result = valueOne + valueTwo;
                break;
            case "-":
                result = valueOne - valueTwo;
                break;
            case "/":
                if (valueTwo == 0) {
                    System.out.println("Cannot divide by zero");
                    return 0;
                }
                result = valueOne / valueTwo;
                break;
            case "*":
                result = valueOne * valueTwo;
                break;
            case "^":
                result = Math.pow(valueOne, valueTwo);
                break;

            default:
                System.out.println("Invalid operator");
        }

        return result;
    }
}