package Implements;

public class RomanceMovie extends Movie{
    private String RomanceName;

    public RomanceMovie(String name, String rating, int minLength, String RomanceName){
        super(name, rating, minLength);
        this.RomanceName = RomanceName;
    }
    @Override
    public void play(){
        System.out.println("The RomanceMovie is Playing");
    }
}
