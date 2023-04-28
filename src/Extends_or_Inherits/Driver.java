package Extends_or_Inherits;

public class Driver {

    public static void main (String[] args){
        //Animal worm = new Animal(10, 20, "happyBoy"); // Does Not Work
        /*
        Since we called the class abstract, we cannot make an object (instantainted) of the Animal class.
        It is just used so that we can hold and manipulate variables that are of an animal.
         */

        Animal Sally = new Cat("I rule the world.", 12, 10, "Sally");
        Cat Bobby = new Cat("I really don't like Sally.", 10, 13, "Bobby");

        System.out.println(Sally.toString()); // This will call Animal.toString()
        // Even though this calls the Animal.toString() method, since we override this in the cat class, it will
        // print from the cat class

        System.out.println(Bobby.toString()); // This will call Cat.toString();
        System.out.println();

        Dog Mav = new Dog("I like balls.", 19, 25, "Mav");
        Dog Ruffles = new Dog("Give me food.", 12, 10, "Jonny");

        // This is a very important loop
        Animal[] animals = {
                Sally,
                Bobby,
                Mav,
                Ruffles
        };

        // Because they all Extend the animal class, we can use a loop like this

        for (Animal animal : animals){
            System.out.println(animal.toString());
        }
        /*
        Prints:
        I rule the world.
        I really don't like Sally.
        I like balls.
        Give me food.

        All of these are from the child classes because they override the toString() in the parent class
         */
    }
}
