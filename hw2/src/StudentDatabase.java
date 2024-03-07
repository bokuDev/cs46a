// Problem 4
/**
 * Represents a Student Database
 * @author Canhui Huang
 */
class Student {
    private int studentID;
    private String name;
    private String major;
    private float GPA;

    /**
     * Construct a new Student
     * @param studentID the id of the student
     * @param name the name of the student
     * @param major the major of the student
     * @param gpa the gpa of the student
     */
    public Student(int studentID, String name, String major, float gpa) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        GPA = gpa;
    }

    public void displayStudentInfo() {
        System.out.println("Student details:");
        System.out.println(
            " Student ID: " + this.studentID +
            "\n Name: " + this.name +
            "\n Major: " + this.major +
            "\n GPA: " + this.GPA
        );
    }


    public int getStudentID() { return this.studentID; }
    public void setStudentID(int studentID) { this.studentID = studentID;}

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return this.major; }
    public void setMajor(String major) { this.major = major; }

    public float getGPA() { return this.GPA; }
    public void setGPA(float gpa) { this.GPA = gpa; }

    public static void main(String[] args) {
        Student student = new Student(1234, "John Doe", "Data Science", 4.0f);

        student.displayStudentInfo();
    }
}