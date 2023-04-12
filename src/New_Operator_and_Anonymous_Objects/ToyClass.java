package New_Operator_and_Anonymous_Objects;

public class ToyClass {
    private String name;
    private int num;
    public ToyClass(String newName, int newNum){
        this.name = newName;
        this.num = newNum;
    }

    public boolean equals(ToyClass obj){
        if (this.name.equals(obj.name) && this.num == obj.num){
            return true;
        }
        return false;
    }
}
