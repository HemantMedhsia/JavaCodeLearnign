package StudentManagemantSystem.StudentModel;

public class StudentModal {
    private static int counter = 1001;
    private int studentId = 1001;
    private String studentName;
    private int studentAge;
    private String studentGender;
    private int percentage;
    private int rank;

    // public StudentModal() {
    //     studentId++;
    //     studentName = "";
    //     studentAge = 0;
    //     studentGender = "";
    //     percentage = "";
    //     rank = 0;
    // }

    public int getStudentId() {
        return studentId;
    }

    public void generateStudentId() {
        this.studentId = counter++;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    
}