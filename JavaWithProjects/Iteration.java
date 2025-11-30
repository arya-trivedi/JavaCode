package JavaWithProjects;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        //while loop
        // int sum = 0;
        // boolean keepGoing = true;
        // while (keepGoing) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter a number (negative number to exit) --> ");
        //     int n = sc.nextInt();
        //     if(n<0){
        //         keepGoing = false;
        //     }else{
        //         sum = sum + n;
        //     }
        // }
        // System.out.println("Sum of numbers is: " + sum);
        int sum = 0;
        boolean keepGoing = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (negative number to exit) --> ");
            int n = sc.nextInt();
            if(n<0){
                keepGoing = false;
            }else{
                sum+=n;
            }
        }while(keepGoing);
        System.out.println("Sum of numbers is: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age --> ");
        int age = sc.nextInt();
        
        do{
            System.out.println("As you are " + age + " years of age, " + "you can purchase alcohol.");
            System.out.println("Please enter your age --> ");
            age = sc.nextInt();
        }while (age >= 18);

        for(int i = 1; i <=3; i++){
            System.out.println("Looping");
        }

        for(int i = 10; i <= 50; i+=10){
            System.out.println(i);
        }
        //System.out.println(i); // i is out of scope

        for(int i = 0, j = 0; i < 1 && j < 1; i++, j++){
            System.out.println(i + " " + j);
        }

    
    }
    
}
