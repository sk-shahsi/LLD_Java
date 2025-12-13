package com.stractural.composit;

public class Client {
    public static void main(String[] args) {
        Directory movieDictonary = new Directory("Movies");
        File rentalRecipt = new File("RentalReceipt");
        movieDictonary.add(rentalRecipt);

        Directory comedyMoviesDictonary = new Directory("ComedyMovies");
        File dumbAndDumber = new File("DumbAndDumber");
        comedyMoviesDictonary.add(dumbAndDumber);
        movieDictonary.add(comedyMoviesDictonary);

        movieDictonary.printContents();
    }
}
