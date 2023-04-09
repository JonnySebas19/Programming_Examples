package Static_Variables;
public class Static_Variables_Driver {
    public static void main(String[] args)
    {
        Static_Variables obj1 = new Static_Variables();
        Static_Variables obj2 = new Static_Variables();

        System.out.println(Static_Variables.getNum()); // 0
        System.out.println(obj1.getNum()); // 0

        obj1.setNum(2);

        System.out.println(Static_Variables.getNum()); // 2
        System.out.println(obj1.getNum()); // 2
        System.out.println(obj2.getNum()); // 2

        //All will give the same output, but Static_Variables.getNum() is better because
        //we would use that everything we use getNum();
    }
}
