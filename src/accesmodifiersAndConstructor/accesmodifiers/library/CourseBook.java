package src.accesmodifiersAndConstructor.accesmodifiers.library;

public class CourseBook extends Book {
    void readBook() {
        Book book = new Book();

        book.isbn = "asd";
        book.printBook();

        book.author = "";
        book.modifyTemplate();

        book.issueCount = 0;
        book.issueHistory();

        // book.pages = 0; // nu se pot accesa  atribute sau metohode "private" chiar daca este in acelas package
    }
}
