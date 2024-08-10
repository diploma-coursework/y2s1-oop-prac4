package Q5;

public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private int courseCount;

    Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        this.noOfStudents = 0;
        this.studentNames = new String[100];
        this.courseCount = 0;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }
    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }
    public double getFeesPerStudent() {
        return this.feesPerStudent;
    }
    public int getNoOfStudents() {
        return this.noOfStudents;
    }
    public  String[] getStudentNames() {
        return this.studentNames;
    }
    public int getCourseCount() {
        return this.courseCount;
    }

    public double calcFeesCollected() {
        return this.feesPerStudent * (double) this.noOfStudents;
    }

    public void addStudent(String studentName) {
        this.studentNames[this.courseCount++] = studentName;
        ++noOfStudents;
    }

    @Override
    public String toString() {
        return String.format("""
                Course Title: %s
                Fees per Student: %.2f
                Number of Students: %d
                Course Count: %d
                """,
                this.courseTitle,
                this.feesPerStudent,
                this.noOfStudents,
                this.courseCount
                );
    }
}
