package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class Book {
    private String author;
    private String title;
    private int pubicationYear;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPubicationYear() {
        return pubicationYear;
    }

    public Book(String author, String title, int pubicationYear) {
        this.author = author;
        this.title = title;
        this.pubicationYear = pubicationYear;
    }
}
