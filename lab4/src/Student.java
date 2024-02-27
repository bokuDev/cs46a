/**
 * Represents a student with name, student id, and major
 */

// Student: Canhui Huang
// Date: 02/23/2024
public class Student {
    public String name;
    public int studentID;
    private String major;

    /**
     * Constructs a new Student
     */
    Student() {
        this.name = "Julio";
        this.studentID = -1;
        this.major = "History";
    }

    /**
     * Constructs a new Student
     *
     * @param name Name of the student
     * @param studentID Id of the student
     * @param major Major of the student
     */
    Student(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    /**
     * Display the student's attribute in a formatted way
     */
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Major: " + this.major);
    }

    /**
     * Display the student's attribute in one line
     */
    public void displayInline() {
        System.out.println("Name: " + this.name + ". Student ID: " + this.studentID + ". Major: " + this.major);
    }

    /**
     *
     * @param name Set the name of the student
     * @param studentID Set the Id of the student
     */
    public void setDetails(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    /**
     *
     * @param name Set the name of the student
     * @param studentID Set the id of the student
     * @param major Set the major of the student
     */
    public void setDetails(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    public static void main(String[] args) {
        // 1. Class and Object Creation
        Student student = new Student();
        student.name = "John";
        student.studentID = 12;
        student.major = "Software Engineering";

        System.out.println("\n1. Class and Object Creation");
        System.out.println("Name: " + student.name);
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Major: " + student.major);

        // 2. Using Methods
        Student student2 = new Student();
        student2.name = "Sofia";
        student2.studentID = 13;
        student2.major = "Data Science";

        System.out.println("\n2. Using Methods");
        student2.displayDetails();

        // 3. Introduction to Constructors
        Student studentA = new Student();
        studentA.name = "Carla";
        studentA.studentID = 14;
        studentA.major = "Art History";
        Student studentB = new Student("Ramon", 15, "Microbiology");

        System.out.println("\n3. Introduction to Constructors");
        studentA.displayDetails();
        studentB.displayDetails();

        // 4. Overloading Methods
        Student studentC = new Student();
        studentC.setDetails("Robert", 16);
        studentC.major = "Anthropology";

        Student studentD = new Student();
        studentD.setDetails("Sonia", 17, "Computer Science");

        System.out.println("\n4. Overloading Constructors");
        studentC.displayDetails();
        studentD.displayDetails();

        // Challenge Exercise (Bonus)
        System.out.println("\nChallenge Exercise (Bonus)");
        Course spanishCourse = new Course("Spanish 101", "123098");
        System.out.println("\nEnrolling Carla, Ramon, Robert, & Sonia to " + spanishCourse.courseName);
        spanishCourse.enroll(studentA);
        spanishCourse.enroll(studentB);
        spanishCourse.enroll(studentC);
        spanishCourse.enroll(studentD);
        spanishCourse.displayStudents();

        System.out.println("\nDropping Robert from the course");
        spanishCourse.drop(studentC);
        spanishCourse.displayStudents();
    }
}

class Course {
    public String courseName;
    public String courseCode;

    private final int CAPACITY = 30;
    private Student[] students = new Student[CAPACITY];

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public int studentsEnrolled() {
        int count = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) count++;
        }
        return count;
    }

    public void enroll(Student student) {
        this.students[this.studentsEnrolled()] = student;
        System.out.println("Student " + student.name + " has enrolled to " + this.courseName);
    }
    public void drop(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null && this.students[i].studentID == student.studentID) this.students[i] = null;
        }
        System.out.println("Student " + student.name + " has been dropped from " + this.courseName);
    }
    public void displayStudents() {
        System.out.println("Students enrolled: ");
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                this.students[i].displayInline();
            }
        }
    }
}