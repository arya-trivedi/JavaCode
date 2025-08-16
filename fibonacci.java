import java.util.Scanner;

public class fibonacci {
    public static void main(String1[] args) {
        /*
        nth = (n-1)term + (n-2) term
        
        0 and 1

        0,1

        3rd term => 0 + 1 (2nd term + 1st term) = 1

        4th term => 1 + 1 (3rd term + 2nd term)
         */

        //  int terms = 5;
        //  int firstTerm = 0;
        //  int secondTerm = 1;

        //  System.out.println(firstTerm);
        //  System.out.println(secondTerm);
        
        //  /*
        //   sum of last 2 terms
        //   */

        //   int times = 3;
        //   int thirdTerm;
        //   while(times <= terms){
        //     thirdTerm = firstTerm + secondTerm;
        //     times++;
        //     System.out.println(thirdTerm);

        //     firstTerm = secondTerm;
        //     secondTerm = thirdTerm;
        //   }

        /*
         
        0 1 1 1 1   
        
        */
        
        // int n = 13;

        // if((n % n == 0) && (n % 1 == 0) ){
        //     System.out.println("This number is a prime number");
        // }   


        // break and continue

    // int count;
    // int temp = 7;

    // for (count = 1; count<=10 ; count++){
    //     if(count == temp){
    //         System.out.println("It's " + count);
    //         continue; // skips code block below, and continues wiht the next iteration
    //     }
    //     System.out.println(count);
    //    // count++;
    
    
    // }

    float x = 0;
    float sum = 0;
    while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float or an integer: ");
        x = sc.nextFloat();
        if(x % 2 == 0){
            continue;
        }
        if (sum+x > 100) {
            break;
        }
        sum += x;
        // if(sum > 100){
        //     break;
        // }
    }
    //sum-=x;
    System.out.println(sum);

    }   
    


}
