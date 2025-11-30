import java.util.Scanner;

public class alogs {
    public static void main(String[] args){
        // Seq;
        // selection and repetition

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("EVEN");
        }
        System.out.println(num*num);
    }
}
