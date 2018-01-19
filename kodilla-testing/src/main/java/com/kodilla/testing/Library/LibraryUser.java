package com.kodilla.testing.Library;

import java.util.List;
import java.util.Objects;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;
    List<Book> bookList;

    public LibraryUser(String firstname, String lastname, String peselId, List<Book> bookList) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
        this.bookList=bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstname, lastname, peselId);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
