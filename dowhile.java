import java.util.Scanner;

public class dowhile {
    public static void main(String1[] args) {
        /*
         
        while() {

        }


        DO WHILE

        do{

        }while();


         */

        // int num = 1;

        // do{
        //     System.out.println(num);
        //     num++;
        // }while(num <= 10);
    
    
    
        int num = 0;

        // while(num>0){
        //     System.out.println("NUM > 0");
        //     num = 0;
        // }
        
        do{
            System.out.println("NUM > 0");
            num = 0;
        }while(num>0);

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number");
        // int num2 = sc.nextInt();
        // System.out.println("Enter b");
        // int b = sc.nextInt();


        //int temp_b = b;

        // // do-while does the 
        // int temp_num = num;
        // do{
        //     int num_ = num * temp_b;
        //     temp_b++;
        //     System.out.println(num_);
        //     num = temp_num;
        // }while(temp_b<=b);

        

        //int temp_num = num2;
        // do{
        //     int num_ = num2 * b;
        //     b--;
        //     System.out.println(num_);
        // }while(b>=1);
        

        /*
        4 6

        4
        .
        .
        .
        .
        5
        .
        .
        .
        .
        .
        6
        .
        .
        .
        .
        .
        */
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // System.out.println("Enter a number");
        // int b = sc.nextInt();


        // do{
        //     System.out.println(a++);
        //     int b_ = 1;
        //     do{
                
        //         System.out.println(a*b_++);
        //     }while(b<=10);
        // }while(a<=b);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int sumOdd = 0;
        int sumEven = 0;

        int temp = 1;
        do{
            //System.out.println(temp);
            if(temp%2 ==0){
                sumEven+=temp;
            }else{
                sumOdd+=temp;
            }
            temp++;
        }while(temp<=n);
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
