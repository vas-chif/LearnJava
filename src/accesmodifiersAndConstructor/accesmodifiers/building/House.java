package src.accesmodifiersAndConstructor.accesmodifiers.building;

import src.accesmodifiersAndConstructor.accesmodifiers.library.Book;

public class House {
    void read() {
        Book book = new Book();

        book.isbn = "abc";
        book.printBook();

        // book.author = "dec"; // nu se pot accesa  atribute sau metohode "protected"

        // book.issueCount = 0; // nu se pot accesa  atribute sau metohode "default/package"
    }
}
