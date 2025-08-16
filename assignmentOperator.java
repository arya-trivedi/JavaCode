import java.util.Scanner;

public class assignmentOperator {
    public static void main(String1[] args) {
        /*

        =

        +=

        -= --> x = x - 10

        *= --> x = x * 10

        /= --> x = x / 10

        %= --> x = x % 10

        int x = 5;

        x+=10;
         
        */

        // int x = 5;
        
        
        // // x += 9;
        // // System.out.println(x);
        // // x -= 11;
        // // System.out.println(x);

        // int x = 10;
        // System.out.println(x++);
        // System.out.println(x);
        // x += 11;
        // System.out.println(x);


        //C.O

        /*
        == -> 

        != ->

        >

        >=

        <

        <=
        */

        // int x = 5;
        // int y = 10;

        // System.out.println(x==y);
        // System.out.println(x!=y);
        // System.out.println(x>y);
        // System.out.println(x>=y);
        // System.out.println(x<y);
        // System.out.println(x<=y);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type in a float: ");
        float in1 = sc.nextFloat();
        System.out.println("Please type in a float: ");
        float in2 = sc.nextFloat();
        
        System.out.println(in1 + in2);
        System.out.println(in1 - in2);
        System.out.println(in1 * in2);
        System.out.println(in1 / in2);
        System.out.println(in1 % in2);
    
        System.out.println(in1++);
        System.out.println(in2--);

        System.out.println(in1==in2);
        System.out.println(in1!=in2);
        System.out.println(in1>=in2);
        System.out.println(in1<=in2);
        System.out.println(in1<in2);
        System.out.println(in1>in2);

        // 'a' > 'z' --> Comparison of ASCII key values -- This statement is false

        // Logical Operators

        // And/Orx

        
        sc.close();


        //boolean st1 = 5 > 10;
        //boolean st2 = 10 < 10;

    }
}