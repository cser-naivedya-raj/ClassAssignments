package feb_23_2026.task2;

public class NumberVerifierSystem {

    public static void verifyNum(int number) {

        if (number == 0) {
            System.out.println("The entered value is Zero.");
            return;
        }

        boolean isEven = number % 2 == 0;

        if (number > 0) {

            if (isEven) {
                System.out.println("The number is Positive and Even.");
            } 
            else {
                System.out.println("The number is Positive and Odd.");
            }

        } 
        else {

            if (isEven) {
                System.out.println("The number is Negative and Even.");
            } 
            else {
                System.out.println("The number is Negative and Odd.");
            }

        }
    }
}