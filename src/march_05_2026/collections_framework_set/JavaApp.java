package march_05_2026.collections_framework_set;

import java.util.HashSet;
import java.util.Iterator;

public class JavaApp {

    public static void execution() {

        System.out.println("========================================");
        System.out.println("        HASHSET CHARACTER EXAMPLE       ");
        System.out.println("========================================\n");

        // -------- CREATE --------
        HashSet<Character> hs1 = new HashSet<>();

        hs1.add('A');
        hs1.add('B');
        hs1.add('C');
        hs1.add('D');
        hs1.add('E');
        hs1.add('F');

        hs1.add('C'); // duplicate ignored

        System.out.println("CREATE Operation");
        System.out.println("----------------");
        System.out.println("Set hs1 : " + hs1);


        // -------- CLONE --------
        HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();

        System.out.println("\nClone Operation");
        System.out.println("----------------");
        System.out.println("Cloned Set hs2 : " + hs2);


        // -------- READ --------
        System.out.println("\nREAD Operation (Traversal)");
        System.out.println("--------------------------");

        System.out.println("\nUsing For-Each Loop:");
        for (char c : hs1) {
            System.out.println("Character -> " + c);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Character> iterator = hs1.iterator();

        while (iterator.hasNext()) {
            System.out.println("Character -> " + iterator.next());
        }


        // -------- UPDATE --------
        System.out.println("\nUPDATE Operation");
        System.out.println("----------------");

        System.out.println("Before Update : " + hs1);

        if (hs1.remove('B')) {
            hs1.add('Z'); // replacing B with Z
        }

        System.out.println("After Update  : " + hs1);


        // -------- DELETE --------
        System.out.println("\nDELETE Operation");
        System.out.println("----------------");

        hs1.remove('A');

        System.out.println("After deleting 'A' : " + hs1);


        // -------- HASHCODE --------
        System.out.println("\nHashCodes");
        System.out.println("----------------");
        System.out.println("hs1 hashCode : " + hs1.hashCode());
        System.out.println("hs2 hashCode : " + hs2.hashCode());


        // =========================================
        // HETEROGENEOUS HASHSET
        // =========================================

        System.out.println("\n========================================");
        System.out.println("      HETEROGENEOUS HASHSET EXAMPLE     ");
        System.out.println("========================================\n");

        HashSet<Object> hs = new HashSet<>();

        // CREATE
        hs.add(10);
        hs.add(true);
        hs.add("ABCDE");
        hs.add(null);
        hs.add('a');

        System.out.println("Set Contents : " + hs);


        // READ using Iterator
        System.out.println("\nTraversal using Iterator");
        System.out.println("------------------------");

        Iterator<Object> iterator1 = hs.iterator();

        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            System.out.println("Value -> " + obj);
        }


        // DELETE Example
        System.out.println("\nDeleting element 10...");
        hs.remove(10);

        System.out.println("After Delete : " + hs);

    }
}