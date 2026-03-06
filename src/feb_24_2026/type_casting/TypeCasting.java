package feb_24_2026.type_casting;

public class TypeCasting {

    public static void widening() {
        System.out.println("Widening:");
        int i = 'A';
        System.out.println("i is : " + i);

        double d = i;
        System.out.println("d is : " + d);
        System.out.println();
    }

    public static void narrowing() {
        System.out.println("Narrowing:");

        double d = 122.34;
        System.out.println("d is : " + d);

        int i = (int) d;
        System.out.println("i is : " + i);

        char c = (char) d;
        System.out.println("c is : " + c);
        System.out.println();
    }

    public static void boxing() {
        System.out.println("Boxing:");

        int i = 10;
        System.out.println("i is : " + i);

        Integer I = i; // Auto-boxing
        System.out.println("I is : " + I);
        System.out.println();
    }

    public static void unboxing() {
        System.out.println("Unboxing:");

        Integer I = Integer.valueOf(10);
        System.out.println("I is : " + I);

        int i = I; // Auto-unboxing
        System.out.println("i is : " + i);
        System.out.println();
    }
}