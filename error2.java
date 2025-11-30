import java.util.InputMismatchException;
import java.util.Scanner;

public class error2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        try{
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println(num1/num2);

        }
        catch(ArithmeticException e){
            System.out.println("Error: " +e);
            System.out.println("Please enter a number non-zero");
            num2 = sc.nextInt();
            try{
                System.out.println(10/num2);

            }catch(ArithmeticException e2) {

                System.out.println("Error: " + e2 + "\nEXIT");
            }catch(InputMismatchException e3){
                System.out.println("Error: " + e);
            }

        }
    }
}
