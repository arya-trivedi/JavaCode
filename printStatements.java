import java.util.Scanner;

public class printStatements {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your name? ");
        String name = sc.nextLine();

        System.out.println("What is your weight? ");
        double weight = sc.nextDouble();


        System.out.printf("Age is %d, name is %s, weight is %f\n", age, name, weight);
        System.out.format("Age is %d, name is %s, weight is %f\n", age, name, weight);
        System.out.println("Age is " + age + " name is " + name + " weight is " + weight);
        System.out.print("Age is " + age + " name is " + name + " weight is " + age);

    }
}
