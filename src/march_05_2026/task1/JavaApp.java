package march_05_2026.task1;

import java.util.ArrayList;
import java.util.Scanner;

class JavaApp {

    public static void execution() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Enter total number of students: ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < totalStudents; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Student Name: ");
            String studentName = scanner.nextLine();

            System.out.print("Email Address: ");
            String email = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phone = scanner.nextLine();

            Student student = new Student(studentId, studentName, email, phone);
            studentList.add(student);
        }

        boolean running = true;

        while (running) {

            if (studentList.isEmpty()) {
                System.out.println("No student records available. Exiting program.");
                break;
            }

            System.out.print("\nEnter Student ID to search: ");
            int idToSearch = scanner.nextInt();

            Student selectedStudent = null;

            for (Student st : studentList) {
                if (st.getId() == idToSearch) {
                    selectedStudent = st;
                    break;
                }
            }

            if (selectedStudent == null) {
                System.out.println("Student record not found.");
                continue;
            }

            boolean workingWithSameStudent = true;

            while (workingWithSameStudent) {

                System.out.println("\nSelect Operation:");
                System.out.println("1. Display Student Details");
                System.out.println("2. Modify Student Details");
                System.out.println("3. Remove Student");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {

                    case 1:
                        System.out.println("\nStudent Information:");
                        System.out.println("ID: " + selectedStudent.getId());
                        System.out.println("Name: " + selectedStudent.getName());
                        System.out.println("Email: " + selectedStudent.getMailId());
                        System.out.println("Contact: " + selectedStudent.getContactNumber());
                        break;

                    case 2:
                        System.out.print("Enter updated Email: ");
                        String updatedEmail = scanner.nextLine();

                        System.out.print("Enter updated Contact Number: ");
                        String updatedPhone = scanner.nextLine();

                        selectedStudent.setMailId(updatedEmail);
                        selectedStudent.setContactNumber(updatedPhone);

                        System.out.println("Student information updated.");
                        break;

                    case 3:
                        studentList.remove(selectedStudent);
                        System.out.println("Student removed successfully.");
                        workingWithSameStudent = false;
                        break;

                    default:
                        System.out.println("Invalid selection.");
                }

                if (workingWithSameStudent) {

                    System.out.println("\nNext Action:");
                    System.out.println("1. Continue with same student");
                    System.out.println("2. Search another student");
                    System.out.println("3. Exit program");

                    int nextChoice = scanner.nextInt();

                    if (nextChoice == 1) {
                        continue;
                    } 
                    else if (nextChoice == 2) {
                        workingWithSameStudent = false;
                    } 
                    else if (nextChoice == 3) {
                        workingWithSameStudent = false;
                        running = false;
                    }
                }
            }
        }

        System.out.println("Program finished.");
    }
}