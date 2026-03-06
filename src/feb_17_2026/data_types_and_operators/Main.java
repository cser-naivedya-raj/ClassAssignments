package feb_17_2026.data_types_and_operators;

public class Main {

    public static void main(String[] args) {

        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 30;
        long longVal = 40000L;

        float floatVal = 5.5f;
        double doubleVal = 10.25;

        char letter = 'A';
        boolean status = true;

        int addition = intVal + byteVal;
        int subtraction = intVal - byteVal;
        int multiplication = intVal * byteVal;
        int division = intVal / byteVal;
        int remainder = intVal % byteVal;

        boolean isGreater = intVal > byteVal;
        boolean isSmaller = intVal < byteVal;
        boolean isEqual = intVal == byteVal;

        boolean logicalAnd = status && true;
        boolean logicalOr = status || false;
        boolean logicalNot = !status;

        int value = 10;
        value += 5;
        value -= 3;
        value *= 2;
        value /= 4;
        value %= 3;

        System.out.println("Byte value: " + byteVal);
        System.out.println("Short value: " + shortVal);
        System.out.println("Integer value: " + intVal);
        System.out.println("Long value: " + longVal);
        System.out.println("Float value: " + floatVal);
        System.out.println("Double value: " + doubleVal);
        System.out.println("Character: " + letter);
        System.out.println("Boolean status: " + status);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

        System.out.println("Greater check: " + isGreater);
        System.out.println("Less check: " + isSmaller);
        System.out.println("Equal check: " + isEqual);

        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        System.out.println("Final value: " + value);
    }
}