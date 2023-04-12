public class Overriding {
    private String name;
    @Override
    public boolean equals(Object anotherDog) {
        if (this == anotherDog){
            return true;
        }
        //Checking that another dog is actually an instance of the Overriding class
        if (!(anotherDog instanceof Overriding)) {
            return false;
        }
        //Checks if empty or if from different classes
        if (anotherDog == null || getClass() != anotherDog.getClass()) {
            return false;
        }

        //Casting the passed in object as a Dog class
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

    - Overriding the Object.equals() method that is built into Java. Everything comes from this main class.
    All classes are secretly...  public class Overriding extends Object{};

    - Doesn't NEED to say @Override, but it will help the compiler to see what you are trying to do.

 */