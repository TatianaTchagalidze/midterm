import java.util.Scanner;

public class StudentInfoApp {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a Student");
            System.out.println("2. Delete a Student");
            System.out.println("3. Update a Student's Information");
            System.out.println("4. Display all Students");
            System.out.println("5. Find a Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(studentId, firstName, lastName, age, course);
                    studentInfo.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    // Delete a student
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentInfo.deleteStudent(deleteId);
                    break;
                case 3:
                    // Update a student's information
                    System.out.print("Enter Student ID to update: ");
                    String updateId = scanner.nextLine();

                    Student foundStudent = studentInfo.findStudent(updateId);
                    if (foundStudent != null) {
                        System.out.print("Enter new First Name: ");
                        String newFirstName = scanner.nextLine();
                        System.out.print("Enter new Last Name: ");
                        String newLastName = scanner.nextLine();
                        System.out.print("Enter new Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.print("Enter new Course: ");
                        String newCourse = scanner.nextLine();

                        studentInfo.updateStudent(updateId, newFirstName, newLastName, newAge, newCourse);
                    } else {
                        System.out.println("Student not found with ID: " + updateId);
                    }
                    break;
                case 4:
                    // Display all students
                    studentInfo.displayAllStudents();
                    break;
                case 5:
                    // Find a student
                    System.out.print("Enter Student ID to find: ");
                    String findId = scanner.nextLine();

                    Student foundStudentById = studentInfo.findStudent(findId);
                    if (foundStudentById != null) {
                        System.out.println(foundStudentById);
                    } else {
                        System.out.println("Student not found with ID: " + findId);
                    }
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            System.out.println();
        }
    }
}


