import java.util.Scanner;

public class Adventure {
  private static Scanner scan = new Scanner(System.in);
    
  public static void main(String[] args) 
    {
        // TODO #1. Change the adventure text below, especially the ?'s. 
        // Be creative!
        System.out.println("You are on an island surrounded by water.");
        System.out.println("There is a path to the forest to the north, "
                         + "the sea to the south, a river to the east, and a mall to the west."); 
        System.out.println("Which way do you want to go (n,e,s,w)?");
        String command = scan.next(); // use nextLine() in your own IDE
        if (command.equals("n"))
        {
            System.out.println("You go north.");
            forest();
        }
        // TODO #2: Add else-ifs for command equals s, e, or w,
        // calling a method you will write below for each location.
        // Add an else error message "You can't go in that direction!" 
        // Change the input below the coding area to test these.
        else if (command.equals("s"))
        {
            System.out.println("You go south.");
            sea();
        }else if (command.equals("e"))
        {
            System.out.println("You go east.");
            river();
        }else if (command.equals("w"))
        {
            System.out.println("You go west.");
            mall();
        }else{
            System.out.println("You can't go in that direction!");
        }
        
        
        System.out.println("End of adventure!");   
        scan.close();
   }    

  // TODO #3: Complete this method 
  // north from main goes to the forest
  public static void forest(){
      System.out.println("You enter a dark forest and see ?");
      System.out.println("Do you want to walk e or w?");

      // Add more if/else-if statements for the next action
      //  and call your other methods to move to other locations
      String command = scan.next(); // use nextLine() in your own IDE
      if (command.equals("e"))
      {
          System.out.println("You move east and reach the sea");
          sea();
      }else if(command.equals("w")){
          System.out.println("You move west and reach a river");
          river();
      }else{
          System.out.println("You cannot go in this direction.");
      }

  // TODO #4: Complete this method
  // south from main or east from forest goes to the sea 
  // (feel free to rename to another location of your choice)  
  
  
  // TODO #5:  Add at least 2 more static methods for 2 more locations 

    }

public static void sea(){
      // Print a description
      // Ask for input
      // Add more if/else-if statements for the next action
      // Move to different locations
      
      System.out.println("You enter a dark forest and see ?");
      System.out.println("Do you want to walk e or w?");

      // Add more if/else-if statements for the next action
      //  and call your other methods to move to other locations
      String command = scan.next(); // use nextLine() in your own IDE
      if (command.equals("e"))
      {
          System.out.println("You move east and reach the sea");
          sea();
      }else if(command.equals("w")){
          System.out.println("You move west and reach a river");
          river();
      }else{
          System.out.println("You cannot go in this direction.");
      }

  }

  public static void river(){

    System.out.println("You encounter a river and see ?");
    System.out.println("Do you want to cross n or s?");

    // Add more if/else-if statements for the next action
    //  and call your other methods to move to other locations
    String command = scan.next(); // use nextLine() in your own IDE
    if (command.equals("n"))
    {
        System.out.println("You cross the river");
        sea();
    }else if(command.equals("s")){
        System.out.println("You don't cross the river");
        river();
    }else{
        System.out.println("You cannot go in this direction.");
    }
  }

  public static void mall(){
    System.out.println("You encounter a mall and see ?");
    System.out.println("Do you want to cross n or s?");

    // Add more if/else-if statements for the next action
    //  and call your other methods to move to other locations
    String command = scan.next(); // use nextLine() in your own IDE
    if (command.equals("n"))
    {
        System.out.println("You enter the mall");
        sea();
    }else if(command.equals("s")){
        System.out.println("You don't enter the mall");
        river();
    }else{
        System.out.println("You cannot go in this direction.");
    }
  }


}
