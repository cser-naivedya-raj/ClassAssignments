package feb_18_2026.oops_class_and_object;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JavaApp {

    public static void execution() throws IOException {

        System.out.println("\nJava Application Started");

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.println("Enter Student ID:");
        int studentId = Integer.parseInt(reader.readLine());

        System.out.println("Enter Student Name:");
        String studentName = reader.readLine();

        System.out.println("Enter Student Email:");
        String email = reader.readLine();

        System.out.println("Enter Contact Number:");
        long phoneNumber = Long.parseLong(reader.readLine());

        Student student = new Student(studentId, studentName, email, phoneNumber);

        student.displayStudentDetails();
    }
}