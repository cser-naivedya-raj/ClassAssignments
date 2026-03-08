package march_06_2026;

import java.util.ArrayList;

public class JavaApp {

    public static void execution() {

        Student student = new Student(1, "Raj", "raj@gmail.com", 9875863210L);

        try {

            DB.verifier(student);
            DB.verifier(null);

            ArrayList<Integer> al = new ArrayList<Integer>();

            for (int i = 1; i <= 5; i++) {
                al.add(i);
            }

            for (int i = 0; i <= al.size(); i++) {
                System.out.println(al.get(i));
            }

            int[] array = new int[5];
            int count = 0;

            for (int i = 0; i <= array.length; i++) {
                array[i] = count++;
            }

            String str = "Java";

            for (int i = 0; i <= str.length(); i++) {
                System.out.println(str.charAt(i));
            }

        } catch (Throwable t) {
            System.out.println(t.toString());
            System.out.println(t.getMessage());
            t.printStackTrace();
            System.out.println("Exception occurred: " + t);
        }
    }
}