package StudentManagemantSystem.StudentServices;

import StudentManagemantSystem.StudentModel.StudentModal;

public class StudentService {
    StudentModal[] studentList = new StudentModal[10];
    private int studentCount = 0;

    public void addStudents(String studentName, int studentAge, String gender, int percentage) {
        if (studentCount < studentList.length) {
            StudentModal student = new StudentModal();
            student.generateStudentId();
            student.setStudentName(studentName);
            student.setStudentAge(studentAge);
            student.setStudentGender(gender);
            student.setPercentage(percentage);
            studentList[studentCount] = student;
            studentCount++;
            System.out.println("Student added sucessfully: student Id is: " + student.getStudentId());
        } else {
            System.out.println("Student List is full !!");
        }
    }

    public void viewStudent(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getStudentId() == studentId) {
                System.out.println("\n🔹 Student Details:");
                System.out.println("Name       : " + studentList[i].getStudentName());
                System.out.println("Age        : " + studentList[i].getStudentAge());
                System.out.println("Gender     : " + studentList[i].getStudentGender());
                System.out.println("Percentage : " + studentList[i].getPercentage());
                return;

            }
        }
    }

    public void viewStudent() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n🔹 Student Details:");
            System.out.println("Name       : " + studentList[i].getStudentName());
            System.out.println("Age        : " + studentList[i].getStudentAge());
            System.out.println("Gender     : " + studentList[i].getStudentGender());
            System.out.println("Percentage : " + studentList[i].getPercentage());
        }
    }

    int deletionIndex = -1;

    public void deleteStudent(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (studentList[i].getStudentId() == studentId) {
                deletionIndex = i;
                System.out.println("Deletion Index: " + deletionIndex + " for the student id: " + studentId);
                break;
            }
        }

        if(deletionIndex == -1) {
            System.out.println("Student not found for the given id: " + studentId);
            return;
        }

        for (int i = deletionIndex; i < studentCount; i++) {
            studentList[i] = studentList[i + 1];
        }

        studentList[studentCount-1] = null;
        studentCount--;
    }

    public int getStudentCount() {
        return studentCount;
    }
}
