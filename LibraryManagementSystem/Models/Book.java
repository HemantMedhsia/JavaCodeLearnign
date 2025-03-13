package LibraryManagementSystem.Models;

public class Book {
    private static int counter = 101;
    private String BookId;
    private String BooKName;
    private String Author;
    private int Price;
    private int TotalNumberOfCopiesAvailable;
    private boolean isAvailable;

    public Book(String Name, String Author, int Price, int TotalNumberOfCopiesAvailable) {
        this.BookId = "BK" + counter++;
        this.BooKName = Name;
        this.Author = Author;
        this.Price = Price;
        this.TotalNumberOfCopiesAvailable = TotalNumberOfCopiesAvailable;
        this.isAvailable = TotalNumberOfCopiesAvailable == 0 ? true : false;
    }

    public String getBookId() {
        return BookId;
    }

    public String getBooKName() {
        return BooKName;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPrice() {
        return Price;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public int getTotalNumberOfCopiesAvailable() {
        return TotalNumberOfCopiesAvailable;
    }

    public String borrowBook() {
        if (TotalNumberOfCopiesAvailable == 0) {
            return "Request Book " + BooKName + " is not availble";
        }
        TotalNumberOfCopiesAvailable--;
        return BooKName + " borrowed sucessfully";
    }

    public String returnBook() {
        TotalNumberOfCopiesAvailable++;
        return "Book returned sucessfully";
    }

    public void displayBook() {
        System.out.println("------------------------------------------------------------------------------>");
        System.out.println("Book Id: " + BookId);
        System.out.println("Book Name: " + BooKName);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
        System.out.println("Number of copies available: " + TotalNumberOfCopiesAvailable);
        System.out.println("------------------------------------------------------------------------------>");
    }

}
