import java.util.Scanner;

public class error4 {
    public static void main(String[] args) throws TriangleError{
        Scanner sc = new Scanner(System.in);
        System.out.println("First side of triangle: ");
        double s1 = sc.nextDouble();

        System.out.println("Second side of triangle: ");
        double s2 = sc.nextDouble();
        
        System.out.println("Third side of triangle: ");
        double s3 = sc.nextDouble();

        if((s1+s2>s3) && (s1+s3 > s2) && (s2+s3>s1)){
            System.out.println("Valid triangle");
        }else{
            throw new TriangleError("Invalid triangle, please try again");
        }
    }
}

class TriangleError extends Exception {
    public TriangleError(String message){
        super(message);
    }
    
}