package com.behavioral.iterator.solution;

import java.util.Iterator;
import java.util.List;

public class Library implements BookCollection {

    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }

    @Override
    public Iterator<Book> createReverseIterator() {
        return new ReverseLibraryIterator(books);
    }

//    @Override
//    public Iterator<Book> createIterator() {
//        return new LibraryIterator(books);
//    }
//
//    @Override
//    public Iterator<Book> createReverseIterator() {
//        return new ReverseLibraryIterator(books);
//    }

}
