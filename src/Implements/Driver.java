package Implements;

public class Driver {
    public static void main(String[] args){
        Movie Terminator = new ActionMovie("Terminator", "PG-13", 75, "Suuuuuper");
        Movie Mommy = new RomanceMovie("Mommy", "PG", 32, "Looooove");

        MoviePlayer[] movies = {
                Terminator,
                Mommy
        };

        for (MoviePlayer singleOne : movies){
            singleOne.play();
        }

        /*
        First it goes to the implemented method in MoviePlayer.
        Then it looks in the Movie class
        The Movie.play is Overriden in ActionMovie and RomanceMovie, so it plays those instead.
         */
    }
}
