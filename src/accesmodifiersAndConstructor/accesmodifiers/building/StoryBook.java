package src.accesmodifiersAndConstructor.accesmodifiers.building;

import src.accesmodifiersAndConstructor.accesmodifiers.library.Book;

public class StoryBook extends Book {
    void  readBook(){
        Book book = new Book();

        book.isbn = "dfm";
        book.printBook();

       // book.author = ""; // nu se poate de acesa prin instanta dar doare prin cuvint key "this"
        this.author = "";
        this.modifyTemplate();

        // book.issueCount = 0; // nu se pot accesa  atribute sau metohode "default/package" nici cu key "this"
    }
}
