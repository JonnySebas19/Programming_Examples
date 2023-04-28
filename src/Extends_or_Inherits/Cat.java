package Extends_or_Inherits;

public class Cat extends Animal{
    private String CatsSassyRemark;

    public Cat(String CatsSassyRemark, int height, int weight, String name) {
        super(height,weight,name);
        this.CatsSassyRemark = CatsSassyRemark;
    }
    @Override
    public String toString(){
        return CatsSassyRemark;
    }
}
