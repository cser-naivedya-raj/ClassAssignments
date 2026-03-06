package feb_19_2026.task1;

public class Main {

    static boolean checkSpyNumber(int number) {
        int digitSum = 0;
        int digitProduct = 1;

        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            digitProduct *= digit;
            number /= 10;
        }

        return digitSum == digitProduct;
    }

    static boolean checkAutobiographicalNumber(int number) {

        String value = String.valueOf(number);
        int length = value.length();

        int[] digitCount = new int[length];

        // Count how many times each digit appears
        for (int i = 0; i < length; i++) {
            int d = value.charAt(i) - '0';
            if (d < length) {
                digitCount[d]++;
            }
        }

        // Verify autobiographical condition
        for (int i = 0; i < length; i++) {
            if ((value.charAt(i) - '0') != digitCount[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean spyResult = Main.checkSpyNumber(123);
        System.out.println("Spy Number Result: " + spyResult);

        boolean autoResult = Main.checkAutobiographicalNumber(1210);
        System.out.println("Autobiographical Number Result: " + autoResult);
    }
}