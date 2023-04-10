package Overloading;
public class Overloading_Driver {

    public static void main(String[] args){
        Overloading obj1 = new Overloading(),
                    obj2 = new Overloading(),
                    obj3 = new Overloading();

        obj1.setDate("April", 23, 2023);
        obj2.setDate(1988);
        obj3.setDate(3, 19, 1998);

        System.out.println(obj1); // The same as the overloaded method obj1.toString()
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
