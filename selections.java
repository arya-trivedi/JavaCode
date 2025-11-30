import java.util.Scanner;

public class selections {
    public static void main(String[] args) {
        /*
         IF
         IF-ELSE

         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter age: ");
         int age = sc.nextInt();

         if(age > 20){
            System.out.println("ADULT");
         }
         if(age > 15){
            System.out.println(">15");
         }

         System.out.println("END-OF-CODE");
    }
}
