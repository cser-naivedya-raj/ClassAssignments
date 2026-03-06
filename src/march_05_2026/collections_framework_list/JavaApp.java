package march_05_2026.collections_framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaApp {

    public static void execution() {

        System.out.println("=========== ARRAYLIST WITH INTEGERS ===========\n");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        numbers.add(-6);

        numbers.add(2, 34);     // insert at index
        numbers.addFirst(111);  // add at beginning
        numbers.addLast(999);   // add at end

        numbers.set(1, 0);      // update value
        numbers.remove(3);      // remove element

        System.out.println("Current List : " + numbers);

        // -------- Traversal using enhanced for loop --------
        System.out.println("\n--- Traversing using for-each loop ---");

        for (int value : numbers) {
            System.out.println("Element : " + value);
        }

        // -------- Traversal using Iterator --------
        System.out.println("\n--- Traversing using Iterator ---");

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println("Element : " + itr.next());
        }

        // -------- Reverse traversal using ListIterator --------
        System.out.println("\n--- Reverse Traversal ---");

        ListIterator<Integer> revItr = numbers.listIterator(numbers.size());

        while (revItr.hasPrevious()) {
            System.out.println("Element : " + revItr.previous());
        }


        System.out.println("\n=========== HETEROGENEOUS ARRAYLIST ===========\n");

        ArrayList mixedList = new ArrayList();

        mixedList.add(null);
        mixedList.add(null);
        mixedList.add(null);

        mixedList.add(10);
        mixedList.add(10);
        mixedList.add(10);

        mixedList.add(true);
        mixedList.add('j');
        mixedList.add(12.34);
        mixedList.add("java");

        mixedList.add(new Product(1, "Apsara", "Pencil", 29.99));

        int position = 0;

        for (Object element : mixedList) {
            System.out.println("Position " + position + " : " + element);
            position++;
        }
    }
}