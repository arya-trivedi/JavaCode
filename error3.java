import java.util.Scanner;

public class error3 {
    public static void main(String[] args) throws DLError{
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Welcome");
        }else{
            throw new DLError("Age < 18");
        }
    }
}

class DLError extends Exception {
    public DLError(String message){
        super(message);
    }
    
}
