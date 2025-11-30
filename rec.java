import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        ///hello();
       // System.err.println(sumN(5));
       System.out.println(fibo(10));

        Scanner sc = new Scanner(System.in);

        // System.out.println("Please enter a number: ");
        // int fiboInput = sc.nextInt();

        // fiboFromInput(fiboInput);

        //System.out.println("Please enter a number: ");

        // int input =  sc.nextInt();

        // System.out.println(printDigits(input));

        System.out.println("Please enter the first number: ");

        int num1 = sc.nextInt();

        System.out.println("Please enter the first number: ");

        int num2 = sc.nextInt();

        System.out.println(powerRec(num1, num2));

    }

    static void hello(){
        System.out.println("Hello World");
        greet();//indirect recursion
    }

    static void greet(){
        System.out.println();
        hello(); //indirect recursion
    }

    /*
    sum(N) =  1 + 2 + ..... + N
    sum(5) =  1 + 2 + 3 + 4 + 5

    if N = 1 then 1

    sum(5) = 1 + 2 + 3 + 4 + 5
    sum(4) = sum(3) + 5
    sum(3) = sum(2) + 3
    sum(2) = sum(1) + 2
    aum(1) = 1

    sum(N) = sum(N-1) + N

    stack starts from bottom to top
    sum(5) -> sum(1)

    fact(6) - > 1 * 2 * 3 * 4 * 5 * 6
    fact(6) - > fact(5)  * 6
    fact(5) - >



    */

    // static void sumN(int N){
    //     int sum = 0;
    //     for(int i = 1; i <= N; i++){
    //         sum+=i;
    //     }
    //     System.err.println(sum);
    // }

    // static int sumN(int N){
    //     if(N==1){
    //         return 1;
    //     }
    //     return sumN(N-1) + N;
    // }

    // static void fact(int n){
    //     int prod = 1;
    //     for(int i = 1; i <= n; i++){
    //         prod *= i;
    //     }
    //     System.out.println(prod);

    // }

    // static int fact(int n){
    //     if(n == 1){
    //         return 1;
    //     }

    //     return fact(n-1) * n;
    // }

    // 0, 1, 1, 2, 3, 5, 8

    static int fibo(int n){
        if(n==1){
            return 0;
        }

        if(n==2){
            return 1;
        }
        
        return fibo(n-1) + fibo(n-2);
    }

    static void fiboFromInput(int n){
        if (n<1) {
            return;
        }

        System.out.println(n);
        fiboFromInput(n-1);
    }


    // static int printDigits(int n){
    //     /*
    //      * 12345 =  10000*1 + 1000 * 2 +  
    //      * 
    //      * 
    //      */

    //     //int count = 0;
    //     // while(n>0){
    //     //     n/=10;
    //     //     count++;
    //     // }
    //     // System.out.println(count);

    //     // if(n==0){
    //     //     return 0;
    //     // }
    //     // return 1+printDigits(n/10);

    // }

    static int powerRec(int a, int b){
        if(b == 0){
            return 1;
        }
        
        return a*powerRec(a, b-1); 

        /*
         * 2^5 = 2*2*2*2*2 = 2 * 2^4
         * 
         * 
         */

    }


}
