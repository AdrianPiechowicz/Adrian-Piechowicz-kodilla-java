package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("New Library");
        Book book1 = new Book("New Age", "DArwin", LocalDate.of(1993,2,20));
        Book book2 = new Book("Bible", "N/A", LocalDate.of(1000,1,1));
        Book book3 = new Book("Pizza recipes", "Giovanni", LocalDate.of(2005,10,5));

        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowCloneOfLibrary = null;
        try {
            shallowCloneOfLibrary = library.shallowCopy();
            shallowCloneOfLibrary.setName("Shallow Copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCloneOfLibrary = null;
        try {
            deepCloneOfLibrary = library.deepCopy();
            deepCloneOfLibrary.setName("Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deleting one of objects from original class
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowCloneOfLibrary);
        System.out.println(deepCloneOfLibrary);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,shallowCloneOfLibrary.getBooks().size());
        Assert.assertEquals(3,deepCloneOfLibrary.getBooks().size());
    }
}
