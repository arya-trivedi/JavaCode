import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber<secondNumber) {
            System.out.println("first num is smaller");
        }else if(firstNumber > secondNumber){
            System.out.println("first num is greater");

        }else{
            System.out.println("Both number are equal");
        }

    }
}
