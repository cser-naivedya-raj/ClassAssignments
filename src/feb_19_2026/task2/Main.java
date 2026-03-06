package feb_19_2026.task2;

public class Main {

    public static void identifyNumberType(int number) {

        int outerDigitsSum = 0;
        int innerDigitsSum = 0;

        int tempValue = number;

        int last = tempValue % 10;
        tempValue = tempValue / 10;

        while (tempValue > 9) {
            int current = tempValue % 10;
            innerDigitsSum += current;
            tempValue = tempValue / 10;
        }

        outerDigitsSum = tempValue + last;

        if (outerDigitsSum == innerDigitsSum) {
            System.out.println(number + " is a Xylem Number.");
        } else {
            System.out.println(number + " is a Phloem Number.");
        }
    }

    public static void main(String[] args) {

        identifyNumberType(12321);
        identifyNumberType(1111);
        identifyNumberType(1210);

    }
}