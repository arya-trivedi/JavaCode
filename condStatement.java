import java.util.Scanner;

public class condStatement {
    public static void main(String1[] args) {
        /*
        IF
        ELSE IF
        ELSE
        */
        
        /*
        if(condition){
            //stat1
            //stat2

        } 
        
        
        */
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num);
        }else{
            if(num == 0){
                System.out.println("ZERO");
            }else{
                System.out.println("NUMBER < 0");
            }
        }

        System.out.println("-----End of If-----");

        /*
        ELSE IF

        else if(){


        }
        */

        /*   
        POS(>0)
        NEG(<0)
        ZERO(==0)
         */

         if(num > 0){
            System.out.println("NUMBER > 0");
         }else if(num == 0){
            System.out.println("Zero");
         }
        //  else if(num < 0){
        //     System.out.println("Number < 0");
        //  }
        else{
            System.out.println("NUMBER < 0");
        }

        System.out.println("----END OF----");


        if(num > 0){
            System.out.println("NUMBER > 0");
        }
        if(num == 0){
            System.out.println("ZERO");
        }
        if(num < 0){
            System.out.println("NUMBER > 0");
        }
        else{
            System.out.println("HELLO WORLD");
        }

        // if it is 0, then 
        System.out.println("Please input the first number: ");
        int firstNum = sc.nextInt();

        System.out.println("Please input the second number: ");
        int secondNum = sc.nextInt();

        if(firstNum>secondNum){
            System.out.println("The first number is larger than the second number");
        }else if(firstNum < secondNum){
            System.out.println("The second number is larger than the first number");
        }else{
            System.out.println("The first and second numbers are equal");
        }
    }
    



}