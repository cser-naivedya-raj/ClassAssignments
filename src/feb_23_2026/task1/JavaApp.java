package feb_23_2026.task1;

import java.util.Scanner;

public class JavaApp {

    public static void startProgram() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter any character: ");
        char userInput = scanner.next().charAt(0);

        // Calling character verification method
        CharacterVerifierSystem.verifyChar(userInput);

        scanner.close();
    }
}