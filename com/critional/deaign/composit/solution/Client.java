package com.critional.deaign.composit.solution;

import com.critional.deaign.composit.Directory;
import com.critional.deaign.composit.File;

public class Client {
    public static void main(String[] args) {
        com.critional.deaign.composit.Directory movieDictonary = new com.critional.deaign.composit.Directory("Movies");
        com.critional.deaign.composit.File rentalRecipt = new com.critional.deaign.composit.File("RentalReceipt");
        movieDictonary.add(rentalRecipt);

        com.critional.deaign.composit.Directory comedyMoviesDictonary = new Directory("ComedyMovies");
        com.critional.deaign.composit.File dumbAndDumber = new File("DumbAndDumber");
        comedyMoviesDictonary.add(dumbAndDumber);
        movieDictonary.add(comedyMoviesDictonary);

        movieDictonary.printContents();
    }
}
