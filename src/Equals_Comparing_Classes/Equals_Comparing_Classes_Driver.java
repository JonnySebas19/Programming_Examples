package Equals_Comparing_Classes;
public class Equals_Comparing_Classes_Driver {
    public static void main(String[] args)
    {
        Equals_Comparing_Classes obj1 = new Equals_Comparing_Classes();
        Equals_Comparing_Classes obj2 = new Equals_Comparing_Classes();

        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // false
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // false

        obj1.num = 0;
        obj2.num = 1;

        System.out.println("\nobj1 == obj2 : " + (obj1 == obj2)); // false
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // false

        obj1 = obj2;

        System.out.println("\nobj1 == obj2 : " + (obj1 == obj2)); // true
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // true

        System.out.println("\nobj1.num : " + obj1.num); // 1
        System.out.println("obj2.num : " + obj2.num); // 1

        obj1.num = 2;

        System.out.println("\nobj1.num : " + obj1.num); // 2
        System.out.println("obj2.num : " + obj2.num); // 2
    }
}
