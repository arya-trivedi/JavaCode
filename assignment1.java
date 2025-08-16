import java.util.Scanner;

public class assignment1 {
    public static void main(String1[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for subject 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter marks for subject 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter marks for subject 3: ");
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;

        System.out.println("Total Marks: " + (sum));
        System.out.println("Average Marks: " + sum/3);
    }


    

}
