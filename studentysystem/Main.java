

import java.util.ArrayList;
import java.util.Scanner;

import studentquery.Student;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // 初始化10个学生
        students.add(new Student("Alice", "alice@gmail.com", "1234", "S001", 90, 20, "Female", "Sophomore"));
        students.add(new Student("Bob", "bob@gmail.com", "5678", "S002", 85, 22, "Male", "Junior"));
        students.add(new Student("Charlie", "charlie@gmail.com", "abcd", "S003", 78, 19, "Male", "Freshman"));
        students.add(new Student("Daisy", "daisy@gmail.com", "efgh", "S004", 88, 21, "Female", "Senior"));
        students.add(new Student("Edward", "edward@gmail.com", "ijkl", "S005", 92, 23, "Male", "Junior"));
        students.add(new Student("Fiona", "fiona@gmail.com", "mnop", "S006", 95, 20, "Female", "Sophomore"));
        students.add(new Student("George", "george@gmail.com", "qrst", "S007", 70, 24, "Male", "Senior"));
        students.add(new Student("Hannah", "hannah@gmail.com", "uvwx", "S008", 80, 21, "Female", "Junior"));
        students.add(new Student("Ian", "ian@gmail.com", "yz12", "S009", 60, 18, "Male", "Freshman"));
        students.add(new Student("Jane", "jane@gmail.com", "3456", "S010", 89, 22, "Female", "Senior"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Query System!");
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Student loggedInStudent = null;

        for (Student student : students) {
            if (student.getEmail().equals(email) && student.getPassword().equals(password)) {
                loggedInStudent = student;
                break;
            }
        }

        if (loggedInStudent == null) {
            System.out.println("Invalid email or password!");
            return;
        }

        System.out.println("Login successful! Welcome, " + loggedInStudent.getName());
        while (true) {
            System.out.println("\nChoose an option to query:");
            System.out.println("1. Grade");
            System.out.println("2. Age");
            System.out.println("3. Gender");
            System.out.println("4. Level");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Grade: " + loggedInStudent.getGrade());
                case 2 -> System.out.println("Age: " + loggedInStudent.getAge());
                case 3 -> System.out.println("Gender: " + loggedInStudent.getGender());
                case 4 -> System.out.println("Level: " + loggedInStudent.getLevel());
                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
