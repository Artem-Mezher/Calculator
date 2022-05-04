import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1;
        int operand2;
        char operation;
        char calculatorOperation;
        int result;

        do {
            if (calculatorOperation)
            System.out.println("Vvedite pervyi operand");
            operand1 = scanner.nextInt();
            System.out.println("Vvedite operator");
            operation = scanner.next().charAt(0);
            System.out.println("Vvedite vtoroi operand");
            operand2 = scanner.nextInt();
            result = calculate(operand1, operand2, operation);
            System.out.println(operand1 + "" + operation + "" + operand2 + "=" + result);
            calculatorOperation=scanner.next().charAt(0);
        } while(calculatorOperation != 's');
    }

    public static int calculate(int operand1, int operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1+operand2;
            case '-' -> operand1-operand2;
            case '*' -> operand1*operand2;
            case '/' -> operand1/operand2;
            default -> {
                System.out.println("Nepravilnoe zhachenie");
                yield  0;
            }
        };
    }
}

