package LibraryManagementSystem.Models;

import java.util.List;

public class User {
    private static int counter = 101;
    private String UserId;
    private String UserName;
    private String Address;
    private Number Contact;
    private int CreditLeft;
    private int MaxBookBorrowCount;
    private List<Book> BorrowedBooks;

    public User(String userName, String address, Number contact, int creditLeft,
            int maxBookBorrowCount) {
        UserId = "UR" + counter++;
        UserName = userName;
        Address = address;
        Contact = contact;
        CreditLeft = creditLeft;
        MaxBookBorrowCount = maxBookBorrowCount;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getAddress() {
        return Address;
    }

    public Number getContact() {
        return Contact;
    }

    public int getCreditLeft() {
        return CreditLeft;
    }

    public int getMaxBookBorrowCount() {
        return MaxBookBorrowCount;
    }

    public List<Book> getBorrowedBooks() {
        return BorrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getIsAvailable()) {
            BorrowedBooks.add(book);
            book.borrowBook();
            System.out.println(UserName + " borrowed book: " + book.getBooKName());
        } else {
            System.out.println("Request Book " + book.getBooKName() + " is not availble");
        }
    }

    public void returnBook(Book book) {
        if (BorrowedBooks.contains(book)) {
            BorrowedBooks.remove(book);
            book.returnBook();
            System.out.println(UserName + " returned the book: " + book.getBooKName());
        } else {
            System.out.println("You did not borrowed this book");
        }
    }

    public void displayUser() {
        System.out.println(" User ID: " + UserId + ", Name: " + UserName);
        System.out.println(" Borrowed Books:");
        if (BorrowedBooks.isEmpty()) {
            System.out.println("   No books borrowed.");
        } else {
            for (Book book : BorrowedBooks) {
                System.out.println("   - " + book.getBooKName() + " by " + book.getAuthor());
            }
        }
    }

}
