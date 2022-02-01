package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD red = new CD(700, 700, 1500, "Red", "TSWIFT songs", "CD");
        DVD inTheMoodForLove = new DVD(2000, 2000, 3000, "In the Mood for Love", "Drama", "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        red.readDisc();
        red.spinDisc();
        inTheMoodForLove.readDisc();
        inTheMoodForLove.spinDisc();
        red.printInformation();
        inTheMoodForLove.printInformation();
    }
}
