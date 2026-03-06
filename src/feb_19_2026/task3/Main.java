package feb_19_2026.task3;

public class Main {

    public static void checkDisarium(int number) {

        int resultSum = 0;
        int digitCount = 0;
        int tempNumber = number;

        // Count digits
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }

        tempNumber = number;

        // Calculate power sum
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            resultSum += (int) Math.pow(digit, digitCount);
            tempNumber /= 10;
            digitCount--;
        }

        if (resultSum == number) {
            System.out.println(number + " is a Disarium Number.");
        } else {
            System.out.println(number + " is not a Disarium Number.");
        }
    }

    public static void main(String[] args) {

        checkDisarium(135);

    }
}