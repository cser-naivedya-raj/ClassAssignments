package feb_23_2026.task2;

import java.util.Scanner;

public class JavaApp {

    public static void startExecution() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to verify: ");
        int number = scanner.nextInt();

        NumberVerifierSystem.verifyNum(number);

        scanner.close();
    }
}