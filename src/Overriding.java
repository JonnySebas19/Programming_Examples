public class Overriding {
    private String name;
    @Override
    public boolean equals(Object anotherDog) {
        //Checking memory address
        if (this == anotherDog) {
            return true;
        }
        //Checks if empty or if the object is from a different class
        if (anotherDog == null || getClass() != anotherDog.getClass()) {
            return false;
        }

        /*
        Casting the passed in object as a Dog class
        We do this because...
         */
        Overriding dog = (Overriding) anotherDog;

        //Return if the contents equal each other
        return this.name.equals(dog.name);
    }
}

/*
Notes:
    Overriding:

    Java is pass-by-value. This means that when an argument is plugged in for a parameter (of any type),
    the argument is evaluated and the value obtained is used to initialize the value of the parameter.
    A method can change the instance variables of an object given as an argument.

 */