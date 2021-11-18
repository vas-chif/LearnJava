package src.accesmodifiersAndConstructor.accesmodifiers.library;

public class Librarian {
    void  readBook(){
        Book book = new Book();

        book.isbn = "def";
        book.printBook();

        book.author= "dec";
        book.modifyTemplate();

        book.issueCount = 0;
        book.issueHistory();

        // book.pages = 0; // nu se pot accesa  atribute sau metohode "private" chiar daca este in acelas package
    }
}
