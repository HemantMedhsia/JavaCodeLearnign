package LibraryManagementSystem.Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import LibraryManagementSystem.Models.Book;
import LibraryManagementSystem.Models.User;

public class Helper {

    public static Book findBookById(String bookId, List<Book> bookList) {
        // System.out.println("Searching for Book ID: " + bookId);
        // System.out.println("Available Books:");
    
        for (Book book : bookList) {
            // System.out.println("Checking Book: " + book.getBookId());
            if (book.getBookId().equals(bookId)) {
                // System.out.println("Book found: " + book.getBooKName());
                return book;
            }
        }
        System.out.println("Book not found!");
        return null;
    }
    

    public static User findUserById(String userId, List<User> userList) {
        // System.out.println("Searching for User ID: " + userId);
        // System.out.println("Available Users:");
        
        for (User user : userList) {
            // System.out.println("Checking User: " + user.getUserId());
            if (user.getUserId().equals(userId)) {
                // System.out.println("User found: " + user.getUserName());
                return user;
            }
        }
        System.out.println("User not found!");
        return null;
    }
    

    // public static void loadBooksFromFile(String fileName, Question[] question) {
    //     try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    //         String line;
    //         int index = 0;
    //         while ((line = br.readLine()) != null && index < 10) {
    //             String[] data = line.split("\\|"); // Split using '|'
    //             if (data.length == 7) {
    //                 question[index] = new Question(
    //                         data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
    //                 index++;
    //             }
    //         }
    //     } catch (IOException e) {
    //         System.out.println("Error reading file: " + e.getMessage());
    //     }
    // }
}
