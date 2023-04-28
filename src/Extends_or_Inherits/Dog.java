package Extends_or_Inherits;

public class Dog extends Animal {
    private String DogsSassyRemark;

    //Use super to set up variables that are in the parent class.

    public Dog(String DogsSassyRemark, int height, int weight, String name) {
        super(height,weight,name);
        this.DogsSassyRemark = DogsSassyRemark;

    }
    @Override
    public String toString(){
        return DogsSassyRemark;
    }
}

