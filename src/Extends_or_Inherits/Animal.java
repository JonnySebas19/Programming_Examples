package Extends_or_Inherits;

abstract public class Animal {
    protected int height; // Inches
    protected int weight; // Pounds
    protected String name;
    public Animal(int height, int weight, String name){
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
    public Animal(){

    }
    public String toString(){
        return "Printing from Animal class";
    }
}
