package march_05_2026.collections_framework_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JavaApp {

    public static void execution() {

        System.out.println("========================================");
        System.out.println("          HASHMAP CHARACTER EXAMPLE     ");
        System.out.println("========================================\n");

        // -------- CREATE --------
        HashMap<Integer, Character> map1 = new HashMap<>();

        map1.put(1, 'A');
        map1.put(2, 'B');
        map1.put(3, 'C');
        map1.put(4, 'D');
        map1.put(5, 'E');
        map1.put(6, 'F');

        map1.put(3, 'C'); // duplicate key replaces value

        System.out.println("CREATE Operation");
        System.out.println("----------------");
        System.out.println("Map map1 : " + map1);


        // -------- CLONE --------
        HashMap<Integer, Character> map2 = (HashMap<Integer, Character>) map1.clone();

        System.out.println("\nClone Operation");
        System.out.println("----------------");
        System.out.println("Cloned Map map2 : " + map2);


        // -------- READ --------
        System.out.println("\nREAD Operation (Traversal)");
        System.out.println("--------------------------");

        System.out.println("\nUsing For-Each Loop with keySet():");

        for (Integer key : map1.keySet()) {
            System.out.println("Key -> " + key + " | Value -> " + map1.get(key));
        }

        System.out.println("\nUsing Iterator with keySet():");

        Set<Integer> keys = map1.keySet();
        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key -> " + key + " | Value -> " + map1.get(key));
        }


        // -------- UPDATE --------
        System.out.println("\nUPDATE Operation");
        System.out.println("----------------");

        System.out.println("Before Update : " + map1);

        map1.put(2, 'Z'); // update value for key 2

        System.out.println("After Update  : " + map1);


        // -------- DELETE --------
        System.out.println("\nDELETE Operation");
        System.out.println("----------------");

        map1.remove(1);

        System.out.println("After deleting key 1 : " + map1);


        // -------- HASHCODE --------
        System.out.println("\nHashCodes");
        System.out.println("----------------");

        System.out.println("map1 hashCode : " + map1.hashCode());
        System.out.println("map2 hashCode : " + map2.hashCode());


        // =========================================
        // HETEROGENEOUS MAP
        // =========================================

        System.out.println("\n========================================");
        System.out.println("       HETEROGENEOUS HASHMAP EXAMPLE    ");
        System.out.println("========================================\n");

        HashMap<Object, Object> map = new HashMap<>();

        // CREATE
        map.put(1, 10);
        map.put("A", true);
        map.put(2, "ABCDE");
        map.put(null, "NULL KEY");
        map.put('a', 55.5);

        System.out.println("Map Contents : " + map);


        // READ using Iterator with keySet()
        System.out.println("\nTraversal using Iterator");
        System.out.println("------------------------");

        Set<Object> keys2 = map.keySet();
        Iterator<Object> iterator1 = keys2.iterator();

        while (iterator1.hasNext()) {

            Object key = iterator1.next();

            System.out.println(
                    "Key -> " + key +
                    " | Value -> " + map.get(key)
            );
        }


        // DELETE Example
        System.out.println("\nDeleting key 'A'...");
        map.remove("A");

        System.out.println("After Delete : " + map);

    }
}