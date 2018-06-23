package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;



public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Nowy autor","XoXo", 1993, "Pusto");
        Book book2 = new Book("Jan Kowalski","Janusz biznesu", 2018, "brak");
        Book book3 = new Book("John Smith","England", 2005, " ");
        Book book4 = new Book("Jezus z Nazaretu","Biblia", 32, "");
        Book book5 = new Book("Shakespere","Hamlet", 1666, "Pusto");
        Book book6 = new Book("Inkwizycja","Czarownice z Salem", 666, "Pusto");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearmedian(bookSet);

        //Then
        Assert.assertEquals(2018, result );
    }
}
