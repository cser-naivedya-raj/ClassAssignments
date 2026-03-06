package march_06_2026;

public class DB {

    public static void verifier(Student s) throws StudentNotFoundException {

        if (s != null) {
            System.out.println(s);
        } else {
            throw new StudentNotFoundException();
        }
    }
}