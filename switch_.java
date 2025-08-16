import java.util.Scanner;

public class switch_ {
    public static void main(String1[] args){
        int day = 5;

        // switch(day){
        //     case 0:
        //         System.out.println("Sun");
        //         break;
        //     case 1:
        //         System.out.println("Mon");
        //         break;
        //     case 2:
        //         System.out.println("Tue");
        //         break;
        //     case 3:
        //         System.out.println("Wed");
        //         break;  
        //     case 4:
        //         System.out.println("Thur");
        //         break;
        //     case 5:
        //         System.out.println("Fir");
        //         break;
        //     case 6:
        //         System.out.println("Sat");
        //         break;
        // }

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a character: ");
        char check = sc.next().charAt(0);
        check = Character.toUpperCase(check);

        switch(check){

            case 'A':
                System.out.println("This is a vowel");
                break;
            case 'E':
                System.out.println("This is a vowel");
                break;
            case 'I':
                System.out.println("This is a vowel");
                break;
            case 'O':
                System.out.println("This is a vowel");
                break;
            case 'U':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is a consonant");
                break;
        }
    }
    
}
