package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearmedian(Set<Book> bookSet) {
        if (bookSet.size() == 0 ) return 0;
        int[] years = new int[bookSet.size()];
        for (int n =0; n < bookSet.size() ; n++) {
            int tempVal = n;
            bookSet.stream()
                    .forEach(s -> years[tempVal] = s.getPublicationYear());
        }
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int)(years.length /2 +0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
