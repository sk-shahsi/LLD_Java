package com.behavioral.iterator.solution;

// Aggregate interface
public interface BookCollection {
    LibraryIterator createIterator();

    ReverseLibraryIterator createReverseIterator();

}
