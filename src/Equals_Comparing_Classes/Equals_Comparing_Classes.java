package Equals_Comparing_Classes;
public class Equals_Comparing_Classes{
    private int num;

    public boolean equals (Equals_Comparing_Classes otherObj)
    {
        return (num == otherObj.num);
    }

    public void setNum(int newNum){
        this.num = newNum;
    }

    public int getNum(){
        return this.num;
    }

}
