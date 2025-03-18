package LibraryManagementSystem;

import java.util.Scanner;
import LibraryManagementSystem.Services.LibraryServices;
import LibraryManagementSystem.Services.CoreLibraryServices;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryServices libraryServices = new LibraryServices();
        CoreLibraryServices coreLibraryServices = new CoreLibraryServices();

        while (true) {
            System.out.println("\n========= Library Management System =========");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. List All Books");
            System.out.println("4. Register User");
            System.out.println("5. Delete User");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. List All Users");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();
                    System.out.print("Enter Total Copies: ");
                    int copies = sc.nextInt();
                    libraryServices.addBooks(bookName, author, price, copies);
                    break;

                case 2:
                    System.out.print("Enter Book ID to delete: ");
                    String bookId = sc.nextLine();
                    libraryServices.deleteBook(bookId);
                    break;

                case 3:
                    libraryServices.listAllBooks();
                    break;

                case 4:
                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Contact Number: ");
                    Number contact = sc.nextLong();
                    System.out.print("Enter Credit Left: ");
                    int creditLeft = sc.nextInt();
                    System.out.print("Enter Max Books Borrow Count: ");
                    int maxBorrow = sc.nextInt();
                    libraryServices.registerUser(userName, address, contact, creditLeft, maxBorrow);
                    break;

                case 5:
                    System.out.print("Enter User ID to delete: ");
                    String userId = sc.nextLine();
                    libraryServices.deleteUser(userId);
                    break;

                case 6:
                    System.out.print("Enter User ID: ");
                    String borrowUserId = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String borrowBookId = sc.nextLine();
                    coreLibraryServices.borrowBook(borrowUserId, borrowBookId);
                    break;

                case 7:
                    System.out.print("Enter User ID: ");
                    String returnUserId = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String returnBookId = sc.nextLine();
                    coreLibraryServices.returnBook(returnUserId, returnBookId);
                    break;

                case 8:
                    System.out.println("Exiting... Thank you for using Library Management System!");
                    sc.close();
                    return;
                case 9:
                    libraryServices.listAllUsers();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
