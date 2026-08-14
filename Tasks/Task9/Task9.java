import java.util.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        Calculator c = new Calculator();

        try {
            boolean passed = false;

            switch (op) {
                case "+":
                    passed = (c.add(a, b) == a + b);
                    break;
                case "/":
                    passed = (c.divide(a, b) == a / b);
                    break;
                default:
                    System.out.println("Invalid Operation");
                    return;
            }

            System.out.println(passed ? "Test Passed" : "Test Failed");
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
    }
}
