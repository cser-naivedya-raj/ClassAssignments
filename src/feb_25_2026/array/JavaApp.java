package feb_25_2026.array;

import java.util.Arrays;

/*
 * Program to demonstrate different operations on Arrays
 * Topics covered:
 * - Array initialization
 * - Reference comparison
 * - Arrays utility methods
 * - Traversing arrays
 * - Default values
 * - Copying and sorting
 */

public class JavaApp {

    public static void execution() {

        // ================= ARRAY INITIALIZATION =================

        int[] firstArray = {1, 2, 3, 4};
        int[] secondArray = {1, 2, 3, 4};

        System.out.println("First Array : " + Arrays.toString(firstArray));
        System.out.println("Second Array: " + Arrays.toString(secondArray));

        // Reference comparison
        System.out.println("firstArray == secondArray : " + (firstArray == secondArray));

        // equals() also compares references for arrays
        System.out.println("firstArray.equals(secondArray) : " + firstArray.equals(secondArray));

        System.out.println("--------------------------------------");


        // ================= CONTENT COMPARISON =================

        System.out.println("Arrays.equals(firstArray, secondArray) : "
                + Arrays.equals(firstArray, secondArray));

        System.out.println("--------------------------------------");


        // ================= HASH CODE DEMO =================

        System.out.println("firstArray.hashCode() : " + firstArray.hashCode());
        System.out.println("secondArray.hashCode() : " + secondArray.hashCode());

        System.out.println("Arrays.hashCode(firstArray) : " + Arrays.hashCode(firstArray));
        System.out.println("Arrays.hashCode(secondArray) : " + Arrays.hashCode(secondArray));

        System.out.println("--------------------------------------");


        // ================= ARRAY TRAVERSAL =================

        int[] numbers = {10, 20, 30, 40};

        System.out.println("Traversal using normal for loop:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Traversal using enhanced for loop:");

        for (int element : numbers) {
            System.out.println(element);
        }

        System.out.println("--------------------------------------");


        // ================= DEFAULT VALUES =================

        int[] defaultArray = new int[4];

        System.out.println("Default values of integer array:");

        for (int val : defaultArray) {
            System.out.println(val);
        }

        System.out.println("--------------------------------------");


        // ================= ARRAY COPYING =================

        int[] duplicate = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Copied array : " + Arrays.toString(duplicate));

        System.out.println("numbers == duplicate : " + (numbers == duplicate));
        System.out.println("Arrays.equals(numbers, duplicate) : "
                + Arrays.equals(numbers, duplicate));

        System.out.println("--------------------------------------");


        // ================= ARRAY SORTING =================

        int[] values = {5, 1, 4, 2, 3};

        System.out.println("Before sorting : " + Arrays.toString(values));

        Arrays.sort(values);

        System.out.println("After sorting  : " + Arrays.toString(values));

        System.out.println("--------------------------------------");


        // ================= STRING ARRAY EXAMPLE =================

        String[] languages = {"Java", "Python", "C++"};

        System.out.println("Programming Languages:");

        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}