public class car {
    String ID;
    String name;

    // Constructors are run automatically even 
    //without being called
    car(String ID_1, String NAME_1){
        System.out.println("Running car....");
        ID = ID_1; // initializes with ID_1 from human class
        name = NAME_1; // initializes with name from human class

    }
    public void info(){
        System.out.println(ID);
        System.out.println(name);
    }
    
}
