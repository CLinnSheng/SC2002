import java.util.*;

public class CalculatorEx {
    
    private double result;
    private Scanner sc;
    public CalculatorEx() {
        sc = new Scanner(System.in);
        result = 0;
        System.out.println("Calculator is on");
        System.out.println("result = " + result);
    }

    public double resultValue() {
        return result;
    }

    public void doCalculation() {

        char op;
        double input;

        do {

            System.out.print("Enter + - / * or Q / q to quit: ");
            op = sc.next().charAt(0);

            if (op == 'q' || op == 'Q') break;

            System.out.print("Enter a number: ");
            input = sc.nextDouble();

            try {
                result = evaluate(op, result, input);
                System.out.printf("result %c %.2f = %.2f\n", op, input, result);
                System.out.printf("updated result = %.2f\n", result);}
            
            catch (UnkownOperatorException e) {
                System.out.println(e.getMessage());
                result = handleUnkownOpException();
                System.out.printf("updated result = %.2f\n", result);
            }

            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a non-zero number for diviosn");
                System.out.printf("updated result = %.2f\n", result);      
            }

        } while (op != 'q' && op != 'Q');

        System.out.println("Final result = " + resultValue());
    }

    public double evaluate(char op, double n1, double n2) throws UnkownOperatorException, ArithmeticException {

        switch (op) {

            case '+':   return n1 + n2;
            case '/':   
                if (n2 == 0)
                    throw new ArithmeticException("Division by zero");    
                return n1 / n2;   
            case '*':   return n1 * n2;
            case '-':   return n1 - n2;
            default:    throw new UnkownOperatorException(op);

        }

    }

    public double handleUnkownOpException() {
        System.out.println("Please reenter:");
        return result;
    }
}
