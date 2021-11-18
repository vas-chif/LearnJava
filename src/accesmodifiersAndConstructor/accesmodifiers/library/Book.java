package src.accesmodifiersAndConstructor.accesmodifiers.library;

public class Book {
    public String isbn;

    protected String author;

    int issueCount;

    private int pages;

    public void printBook() {
        System.out.println(pages); // atribut/method private poat fi accesate doar in aceast class

    }

    protected void modifyTemplate() {

    }

    void issueHistory() {
        countPages(); // atribut/method private poat fi accesate doar in aceast class
    }

    private void countPages() {

    }
}
