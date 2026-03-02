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
            System.out.println("Type value one: ");
            valueOne = scanner.nextDouble();

            System.out.println("Type operator( +, -, /, *): ");
            operator = scanner.next();

            System.out.println("Type value two: ");
            valueTwo = scanner.nextDouble();

            System.out.println("Result: " + realizeCalc(valueOne, valueTwo, operator));

            continues = verifyNewOperation();
        }while (continues);
    }

    public static boolean verifyNewOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Want to realize a new operation? (y/n): ");
        return !sc.nextLine().toLowerCase(Locale.ROOT).equals("n");
    }

    public static Double realizeCalc(Double valueOne, Double valueTwo, String operator) {
        double AnswerCalc = 0.0;

        switch (operator){
            case "+":
                AnswerCalc = valueOne + valueTwo;
                break;
            case "-":
                AnswerCalc = valueOne - valueTwo;
                break;
            case "/":
                AnswerCalc = valueOne / valueTwo;
                break;
            case "*":
                AnswerCalc = valueOne * valueTwo;
                break;

            default:
                System.out.println("Invalid operation: ");
        }

        return AnswerCalc;
    }
}