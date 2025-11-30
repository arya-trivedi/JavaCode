package Class_60.Activity_3_7_1;

public class Person
{
    // instance variables
    private String name;
    private String email;

    // constructor
    public Person(String initName, String initEmail)
    {
        name = initName;
        email = initEmail;
    }

    // instance method
    public void print()
    {
        System.out.println(name + ": " + email);
    }

    // static method
    public static void printStatic(Person p)
    {
        System.out.println("Static methods cannot print out non-static variables.");
        // The following lines will cause errors

        // TODO: Fix this by giving it the Person object as a parameter
        // Use the object to print out the name and call its instance methods.
        //System.out.println(name);
        p.print();
    }

    public static void main(String[] args)
    {
        Person p = new Person("Jana", "jana@gmail.com");

        // Call p's instance method to print
        p.print();

        // Call printStatic with the class name
        // Note this has errors.
        // TODO: Fix the errors by giving it the object p as an arguments
        Person.printStatic(p);
    }
}

