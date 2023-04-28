package Implements;

public class ActionMovie extends Movie{
    private String ActionName;

    public ActionMovie(String name, String rating, int minLength, String ActionName){
        super(name, rating, minLength);
        this.ActionName = ActionName;
    }
    public void play(){
        System.out.println("The ActionMovie is Playing");
    }
}
