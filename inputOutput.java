import java.util.Scanner;


public class inputOutput {
    public static void main(String1[] args){
        Scanner sc = new Scanner(System.in);

        /*
         .next();
        int -> .nextInt();
        double -> .nextDouble();
        float -> .nextFloat();
        char -> .next().charAT(0);
        long -> .nextLong();
        short -> .nextShort();
        byte -> .nextByte();
        boolean -> .nextBoolean();

        Non-primitive
        String -> .nextLine();
        
          
         */

        //  System.out.println("Please enter a number: ");
        //  int input = sc.nextInt();
        //  System.out.println("Your number is: " + input);

        //  System.out.println("Please enter a decimal: ");
        //  double input2 = sc.nextDouble();
        //  System.out.println("Your decimal is: " + input2);

        // System.out.println("Please enter another decimal: ");
        // float input3 = sc.nextFloat();
        // System.out.println("Your decimal is: " + input3);

        // System.out.println("Please enter a number: ");
        // long input = sc.nextLong();
        // System.out.println("Your number is: " + input);

        // System.out.println("Please enter a number: ");
        // short input = sc.nextShort();
        // System.out.println("Your number is: " + input);

        // System.out.println("Please enter a number: ");
        // byte input = sc.nextByte();
        // System.out.println("Your number is: " + input);

        // System.out.println("Please enter either true or false: ");
        // boolean input = sc.nextBoolean();
        // System.out.println("Your answer is: " + input);

        /*
         print
         println --> cursor goes to next line

         printf --> returns a console type
         format --> returns a string

        int -> %d
        float/double -> %f
        char -> %c
        string -> %s
          
         */

        System.out.println("Hello\n");
        System.out.println("World");

        int age = 5;
        System.out.println("My age " + age); 
        System.out.printf("My age: %d My name is\n" , age ); // returns a print type
        System.out.format("My age: %d My name is\n" , age ); 

        sc.close();
    }    
}
