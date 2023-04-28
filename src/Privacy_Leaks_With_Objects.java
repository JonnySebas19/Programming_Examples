public class Privacy_Leaks_With_Objects {
}
/*
Returning a class Ex:

private Date born;

// GOOD (Deep Copy)
public Date getBirthDate(){
    return new Date(born);
}

// BAD (Shallow Copy)
public Date getBirthDate(){
    return born;
}

- In this example, we use a copy constructor in the Date class and return that.(Deep copy)
  This has a new reference and cannot change the original object that we are using.

// GOOD (Deep Copy)
public void setBirthDate(Date newBirthDate){
    if(newBirthDate == null){
        System.out.println("Fatal Error... Shutting Down");
        System.exit(0);
    }
    born = new Date(newBirthDate);
}

// BAD (Shallow Copy)
born = newBirthDate;

- This is the same situation for setting. If we set with the same reference, this would cause
  a privacy leak and others would be able to modify the object from outside the class.

Notes:
    - Never return a reference to a mutable private object... Always return a copy.
** Later on I will learn how to use the clone function **

 */
