import java.util.Scanner;

public class assignment3 {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();

        // if(num > 0){
        //     if(num % 3 == 0 && num % 5 == 0){
        //         System.out.println(num + " is positive and divisible by 3 and 5");
        //     }else{
        //         System.out.println(num + " is positive and not divisible by 3 and 5");
        //     }
        // }
        // else if(num < 0){
        //     if(num % 3 == 0 && num % 5 == 0){
        //         System.out.println(num + " is negative and divisible by 3 and 5");
        //     }else{
        //         System.out.println(num + " is negative and not divisible by 3 and 5");
        //     }
        // } 

        // else{
        //     if(num % 3 == 0 && num % 5 == 0){
        //         System.out.println(num + " is zero and divisible by 3 and 5");
        //     }else{
        //         System.out.println(num + " is zero and not divisible by 3 and 5");
        //     }
        // }

        // Objective: Use conditional logic to validate a transaction.

        // Question:
        // Ask the user for current balance and withdrawal amount.
        // Validate using rules:

        // Withdrawal ≤ balance
        // Amount must be a multiple of 100
        // After withdrawal, minimum ₹500 balance must be maintained

        System.out.println("Enter the current balance: ");
        double bal = sc.nextDouble();

        System.out.println("Enter the withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if(withdraw <= bal && (withdraw % 100 == 0) && (bal - withdraw >= 500)){
            System.out.println("Success");
        }else{
            System.out.println("Failed transfer");
        }

   }
}
