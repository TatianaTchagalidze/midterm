public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

    public Student(String studentId, String firstName, String lastName, int age, String course) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age +
                "\nCourse: " + course;
    }
}
