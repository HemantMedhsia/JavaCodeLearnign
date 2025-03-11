package StudentManagemantSystem;

import java.util.Scanner;
import StudentManagemantSystem.StudentServices.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService ss = new StudentService();

        // Adding some students initially
        ss.addStudents("Hemant Medhsia", 90, "Male", 90);
        ss.addStudents("Aryan Medhsia", 91, "Male", 85);
        ss.addStudents("Dipe Medhsia", 92, "Male", 88);
        ss.addStudents("Alex Medhsia", 89, "Male", 95);
        ss.addStudents("Lisa Medhsia", 93, "Female", 92);
        ss.addStudents("Miya Medhsia", 90, "Female", 90);

        System.out.println("\n ***** Welcome to Student Management System *****");
        while (true) {
            System.out.println("\n ** Choose an option:");
            System.out.println("1 --> View Student Details");
            System.out.println("2 --> Delete a Student");
            System.out.println("3 --> View Total Students Count");
            System.out.println("4 --> View Total Students Details");
            System.out.println("5 --> Exit");

            System.out.print("\n -------->>> Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("<--( X )--> Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("\n ---------->>> Enter Student ID to view details: ");
                    try {
                        int viewId = Integer.parseInt(sc.nextLine());
                        ss.viewStudent(viewId);
                    } catch (NumberFormatException e) {
                        System.out.println("<--( X )--> Invalid input! Please enter a valid Student ID.");
                    }
                    break;

                case 2:
                    System.out.print("\n ---------->>> Enter Student ID to delete: ");
                    try {
                        int deleteId = Integer.parseInt(sc.nextLine());
                        ss.deleteStudent(deleteId);
                        System.out.println("-------------> Student deleted successfully! <------------");
                    } catch (NumberFormatException e) {
                        System.out.println("<--( X )--> Invalid input! Please enter a valid Student ID.");
                    }
                    break;

                case 3:
                    System.out.println(
                            "\n -------(+ + +)------- Total Students -------(+ + +)------- \n" + ss.getStudentCount());
                    break;

                case 4:
                    System.out.println("\n -------(+ + +)------- Total Students -------(+ + +)------- ");
                    ss.viewStudent();
                    break;

                case 5:
                    System.out.println(
                            "\n :-)) --------->>>> Exiting... Thank you for using Student Management System! <<<----------");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("<--( X )--> Invalid choice! Please enter a number between 1-4.");
            }
        }
    }
}
