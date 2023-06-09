package New_Operator_and_Anonymous_Objects;

public class NewOperator_and_AnonymousObjects {
    public static void main(String[] args){
        ToyClass obj1 = new ToyClass("Joe", 42);

        // Using the Anonymous Object "new ToyClass(...)"
        if (obj1.equals(new ToyClass("Joe", 42))){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        //This is the same as...
        ToyClass otherToy = new ToyClass("Joe", 42);
        if (obj1.equals(otherToy)){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        //Testing printing with null pointer
        ToyClass obj2 = null;
        System.out.println(obj2); //Prints: null
        obj2 = new ToyClass("John", 30);
        System.out.println(obj2); //Prints: New_Operator_and_Anonymous_Objects.ToyClass@30f39991
    }
}

/*
Notes:
    Null : Special constant that can be used as a placeholder for memory address.

    ToyClass obj = null
        This is much better than...
    ToyClass obj;

    When you set as null and try to print...
    System.out.println(obj2);

    Prints:
    null

    NullPointerException : When the computer tries to access an object that is a memory address null
 */
