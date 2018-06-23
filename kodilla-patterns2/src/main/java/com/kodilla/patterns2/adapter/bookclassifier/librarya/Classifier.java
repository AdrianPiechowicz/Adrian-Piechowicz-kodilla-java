package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearmedian(Set<Book> bookSet);
}
