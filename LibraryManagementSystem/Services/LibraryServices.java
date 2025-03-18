package LibraryManagementSystem.Services;

import LibraryManagementSystem.Models.Book;
import LibraryManagementSystem.Models.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryServices {

    private static  List<Book> bookList = new ArrayList<>();
    private static  List<User> userList = new ArrayList<>();

    public static List<Book> getBookList() {
        return bookList;
    }

    public static List<User> getUserList() {
        return userList;
    }

    

    public void addBooks(String BooKName, String Author, int Price, int TotalNumberOfCopiesAvailable) {
        Book book = new Book(BooKName, Author, Price, TotalNumberOfCopiesAvailable);
        bookList.add(book);
        System.out.println(
                "Book -> " + book.getBooKName() + " with Id: [" + book.getBookId() + "] <- addded successfully !!");
        System.out.println();
    }

    public void deleteBook(String BookId) {
        for (Book book : bookList) {
            if (book.getBookId().equals(BookId)) {
                bookList.remove(book);
                System.out.println("Book with id: " + BookId + " deleted successfully !!");
            } else {
                System.out.println("Book not found for the given book id: " + BookId);
            }
        }
    }

    public void listAllBooks() {

        if (bookList.isEmpty()) {
            System.out.println("No Books are available now !");
            return;
        }
        System.out.println("Available books are : --------------->");
        int i = 1;
        for (Book book : bookList) {
            System.out.println(i + " -> " + book.getBooKName() + " | " + "Author: " + book.getAuthor());
            i++;
        }
    }

    public void listAllUsers() {
        if(userList.isEmpty()) {
            System.out.println("No Users are available now !");
            return;
        }
        System.out.println("Available books are : --------------->");
        int i = 1;
        for (User user : userList) {
            System.out.println(i + " -> " + user.getUserName() + " | " + "User Id: " + user.getUserId());
            i++;
        }
    }

    public void registerUser(String UserName, String Address, Number Contact, int CreditLeft, int MaxBookBorrowCount) {
        User user = new User(UserName, Address, Contact, CreditLeft, MaxBookBorrowCount);
        userList.add(user);
        System.out.println(
                "User -> " + user.getUserName() + " with Id: [" + user.getUserId() + "] <- addded successfully !!");
        System.out.println();
    }

    public void deleteUser(String UserId) {
        for (User user : userList) {
            if (user.getUserId().equals(UserId)) {
                userList.remove(user);
                System.out.println("User with id: " + UserId + " deleted successfully !!");
            } else {
                System.out.println("User not found for the given user id: " + UserId);
            }
        }
    }

    public void allUsers() {
        if (userList.isEmpty()) {
            System.out.println("No Users are available now !");
        }
        System.out.println("Available books are : --------------->");
        int i = 1;
        for (User user : userList) {
            System.out.println(i + " -> " + "User id: " + user.getUserId() + " | " + user.getUserName());
            i++;
        }
    }

    
}
