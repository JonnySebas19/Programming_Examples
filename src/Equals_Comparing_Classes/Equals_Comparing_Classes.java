package Equals_Comparing_Classes;
public class Equals_Comparing_Classes{
    private int num;

    //Overriding because it is the same as the .equals function for the Object Class
    // ...all classes are extended to Object...
    @Override
    public boolean equals (Object otherObj)
    {
        if (otherObj == null || !(otherObj instanceof Equals_Comparing_Classes)){
            return false;
        }
        Equals_Comparing_Classes obj = (Equals_Comparing_Classes) otherObj;
        return (this.num == obj.num);
    }

    public void setNum(int newNum){
        this.num = newNum;
    }

    public int getNum(){
        return this.num;
    }

}
