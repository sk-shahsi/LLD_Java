package com.stractural.composit.solution;

import com.stractural.composit.Directory;
import com.stractural.composit.File;

public class Client {
    public static void main(String[] args) {
        com.stractural.composit.Directory movieDictonary = new com.stractural.composit.Directory("Movies");
        com.stractural.composit.File rentalRecipt = new com.stractural.composit.File("RentalReceipt");
        movieDictonary.add(rentalRecipt);

        com.stractural.composit.Directory comedyMoviesDictonary = new Directory("ComedyMovies");
        com.stractural.composit.File dumbAndDumber = new File("DumbAndDumber");
        comedyMoviesDictonary.add(dumbAndDumber);
        movieDictonary.add(comedyMoviesDictonary);

        movieDictonary.printContents();
    }
}
