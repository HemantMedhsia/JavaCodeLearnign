package LibraryManagementSystem.Services;

import LibraryManagementSystem.Models.Book;
import LibraryManagementSystem.Models.User;
import LibraryManagementSystem.Utility.Helper;

public class CoreLibraryServices {

    // LibraryServices libraryServices = new LibraryServices();

    public void borrowBook(String userId, String bookId) {
        User user = Helper.findUserById(userId, LibraryServices.getUserList());
        Book book = Helper.findBookById(bookId, LibraryServices.getBookList());

        System.out.println(user);
        System.out.println(book);
        
        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (user.getBorrowedBooks().size() >= user.getMaxBookBorrowCount()) {
            System.out.println(user.getUserName() + " has already borrowed max books.");
            return;
        }

        user.borrowBook(book);

    }

    public void returnBook(String userId, String bookId) {
        User user = Helper.findUserById(userId, LibraryServices.getUserList());
        Book book = Helper.findBookById(bookId, LibraryServices.getBookList());

        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        user.returnBook(book);

    }
}
