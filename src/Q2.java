public class Q2 {
    public static void main(String[] args) {
        Student.setContributionOfQuizToCWMarkPercent(20);
        Student student = new Student();

        student.setStudentId("STD00001");
        student.setName("Adam");

        student.addQuiz(6);
        student.addQuiz(7);
        student.addQuiz(4);

        System.out.printf("""
                Student Id: %s
                Name: %s
                Number of Quiz Taken: %d
                Total Score: %d
                Average Score: %.2f
                Contribution to Coursework: %.2f%%
                """,
                student.getStudentId(),
                student.getName(),
                student.getNumOfQuizTaken(),
                student.getTotalQuizScore(),
                student.getAverageScore(),
                student.getCourseworkContribution());
    }
}

class Student {
    private String studentId;
    private String name;
    private int numOfQuizTaken;
    private int totalQuizScore;
    private static double contributionOfQuizToCWMarkPercent;

    public Student() {
        this("", "");
    }

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.numOfQuizTaken = 0;
        this.totalQuizScore = 0;
    }

    // accessors
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumOfQuizTaken(int numOfQuizTaken) {
        this.numOfQuizTaken = numOfQuizTaken;
    }
    public void setTotalQuizScore(int totalQuizScore) {
        this.totalQuizScore = totalQuizScore;
    }
    public static void setContributionOfQuizToCWMarkPercent(double percentage) {
        contributionOfQuizToCWMarkPercent = percentage;
    }

    // mutators
    public String getStudentId() {
        return this.studentId;
    }
    public String getName() {
        return this.name;
    }
    public int getNumOfQuizTaken() {
        return this.numOfQuizTaken;
    }
    public int getTotalQuizScore() {
        return this.totalQuizScore;
    }
    public static double getContributionOfQuizToCWMarkPercent() {
        return contributionOfQuizToCWMarkPercent;
    }

    public void addQuiz(int score) {
        ++this.numOfQuizTaken;
        this.totalQuizScore += score;
    }

    public int getTotalScore() {
        return this.getTotalQuizScore();
    }

    public double getAverageScore() {
        return (double) this.totalQuizScore / (double) this.numOfQuizTaken;
    }

    public double getCourseworkContribution() {
        return (double) this.totalQuizScore / (10.0 * this.numOfQuizTaken) * contributionOfQuizToCWMarkPercent;
    }
}
