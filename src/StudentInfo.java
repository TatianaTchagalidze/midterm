import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    private List<Student> studentList;

    public StudentInfo() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudent(String studentId) {
        Student student = findStudent(studentId);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }

    public void updateStudent(String studentId, String firstName, String lastName, int age, String course) {
        Student student = findStudent(studentId);
        if (student != null) {
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setCourse(course);
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found with ID: " + studentId);
        }
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of students:");
            for (Student student : studentList) {
                System.out.println(student);
                System.out.println("-----------------------------");
            }
        }
    }

    public Student findStudent(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}


