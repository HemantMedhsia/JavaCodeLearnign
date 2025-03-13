package LibraryManagementSystem.Utility;

import java.util.List;

import LibraryManagementSystem.Models.Book;
import LibraryManagementSystem.Models.User;

public class Helper {

    public static User findUserById(String userId, List<User> userList) {
        for(User user: userList) {
            if(user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public static Book findBookById(String bookId, List<Book> bookList) {
        for(Book book: bookList) {
            if(book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
}
