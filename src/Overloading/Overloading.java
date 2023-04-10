package Overloading;
public class Overloading {
    private int day;
    private String month;
    private int year;


    //Overloading Constructors
    public Overloading(){
        this.day = 1;
        this.month = "January";
        this.year = 2000;
    }
    public Overloading(String initialMonth, int initialDay, int initialYear){
        this.month = initialMonth;
        this.day = initialDay;
        this.year = initialYear;
    }
    public Overloading(int initialYear){
        this.month = "January";
        this.day = 1;
        this.year = initialYear;
    }

    //Overloading methods
    public void setDate(int newMonth, int newDay, int newYear){
        this.month = IntToString(newMonth);
        this.day = newDay;
        this.year = newYear;
    }
    public void setDate(String newMonth, int newDay, int newYear){
        this.month = newMonth;
        this.day = newDay;
        this.year = newYear;
    }
    public void setDate(int newYear){
        this.year = newYear;
    }

    public String IntToString(int month){
        if (month == 3){
            return "March";
        } else {
            System.out.println("Not part of code");
            return "flaw";
        }
    }

    public String toString(){
        return this.month + " " + this.day + ", " + this.year;
    }
}
