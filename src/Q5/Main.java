package Q5;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Computers", 250.0);

        course.addStudent("Ali Said");
        course.addStudent("Wong Ken");
        course.addStudent("Peter Lim");

        System.out.println(course);

        System.out.println("Students Enrolled:");
        String[] studentsEnrolled = course.getStudentNames();
        for (int i = 0; i < course.getNoOfStudents(); i++) {
            System.out.printf("%d. %s\n", i + 1, studentsEnrolled[i]);
        }
    }
}
