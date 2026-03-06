package march_05_2026.exception_handling;

public class JavaApp {

    public static void execution() {

        System.out.println("=====================================");
        System.out.println("      ARITHMETIC EXCEPTION EXAMPLE   ");
        System.out.println("=====================================\n");

        int a = 10;
        int b = 0;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        try {

            System.out.println("\nPerforming Division...");
            int result = a / b;

            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {

            System.out.println("\nException Caught!");
            System.out.println("Cannot divide a number by zero.");
            System.out.println("Exception Message : " + e.getMessage());
        }

        System.out.println("\nProgram continues normally...");
    }
}