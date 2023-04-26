public class Overriding extends Object{
    private String name;
    //All classes extend to the class Object, so we are Overriding the Object.equals(otherObject) function
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

        //Casting the passed in object as a Dog class because we only have the VALUE of the passed in object
        Overriding dog = (Overriding) anotherDog;

        //Return if the contents equal each other
        return this.name.equals(dog.name);
    }
}

/*
Notes:
    Overriding:

    Java is pass-by-value...
    This means that when an argument is plugged in for a parameter (of any type),
    the argument is evaluated and the value obtained is used to initialize the value of the parameter.
    A method can change the instance variables of an object given as an argument. But, if you make that object
    equal a new object, that would not change anything about the original object. It's kinda the same thing how
    we can name the values of things being passed into methods as a completely different name. This is because we
    are just assigning that new variable to the value of the argument. We are allowed to change the values of the
    things inside the object, just not the value of the object itself.

    - Overriding the Object.equals() method that is built into Java. Everything comes from this main class.
    All classes are secretly...  public class Overriding extends Object{};

    - Doesn't NEED to say @Override, but it will help the compiler to see what you are trying to do. This is
    also so that we know as coders which method is going to be called.
 */