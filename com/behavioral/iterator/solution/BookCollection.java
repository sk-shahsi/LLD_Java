package com.behavioral.iterator.solution;

import java.util.Iterator;
// Aggregate interface
public interface BookCollection {
    Iterator<Book> createIterator();

    Iterator<Book> createReverseIterator();

}
