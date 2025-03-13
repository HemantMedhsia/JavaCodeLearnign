package LibraryManagementSystem;

import LibraryManagementSystem.Services.LibraryServices;

public class Main {
    public static void main(String[] args) {
        LibraryServices libraryServices = new LibraryServices();
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.addBooks("Jungle Book", "Kim Laid B", 499, 5);
        libraryServices.listAllBooks();
    }
}
