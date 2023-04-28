package Implements;

public class Movie implements MoviePlayer{
    protected String name;
    protected String rating;
    protected int minLength;

    public Movie(String name, String rating, int minLength){
        this.name = name;
        this.rating = rating;
        this.minLength = minLength;
    }
    public void play(){
        System.out.println("The Movie is playing");
    }

}
