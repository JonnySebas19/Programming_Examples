package Equals_Comparing_Classes;
public class Equals_Comparing_Classes_Driver {
    public static void main(String[] args)
    {
        Equals_Comparing_Classes obj1 = new Equals_Comparing_Classes();
        Equals_Comparing_Classes obj2 = new Equals_Comparing_Classes();

        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // false
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // true
        // Both equal 0 because that is the default value

        obj1.setNum(0);
        obj2.setNum(1);

        System.out.println("\nobj1 == obj2 : " + (obj1 == obj2)); // false
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // false

        obj1 = obj2;

        System.out.println("\nobj1 == obj2 : " + (obj1 == obj2)); // true
        System.out.println("obj1.equals(obj2) : " + (obj1.equals(obj2))); // true

        System.out.println("\nobj1.num : " + obj1.getNum()); // 1
        System.out.println("obj2.num : " + obj2.getNum()); // 1

        obj1.setNum(2);

        System.out.println("\nobj1.num : " + obj1.getNum()); // 2
        System.out.println("obj2.num : " + obj2.getNum()); // 2

        /*
        Notes:
        We use == when comparing the memory address of the object
            - This is why after assigning obj1 = obj2 it becomes true. This
            is the same as with arrays.

        Normally .equals(obj) would be looking at the same thing. Although, I override this
        and have it look at the variables (contents) in the object
            - This is why .equals(obj) is true when num is the same for both objects
         */

        /*
        Extra Notes:
            - obj.toString() is the same as obj
            If we want to make this into a formatted method, we would override it
         */
    }
}
