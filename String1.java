import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        // String name = "hello";

        // System.out.println(name);
        // System.out.println(name.length());
    
        // String name2 = "asdf";
        // System.out.println(name2.length());
    
        // System.out.println(name2.charAt(5));
    
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a string: ");
        // String input = sc.nextLine();

        // int i = input.length();
        // do {
        //     i--;
        //     System.out.println(input.charAt(i));
        // } while (i > 0);


        // String result = "";

        // String name2 = "Hello World";

        // for(int i = 0; i < name2.length(); i++){
        //     result += name2.charAt(i);
        // }
        // System.out.println(result);

        // String story = "Hello how are you?";
        // System.out.println(story.indexOf("ba")); // if it is not present in string, it will return -1

        String sen = "Hello, how are you?";
        String find = "Hello,";

        // /*
   
        // Hi How are you

        // are 

        // 0,1,2 -> false
        // 1,2,3 -> false

        //  */

        // System.out.println(sen.indexOf(find));

        // for(int index = 0; index < sen.length()-find.length(); index++){
        //     //System.out.println(index);
        //     //System.out.println("");
        //     int index3 = 0;
        //     int flag = 0;
        //     for (int index2 = index; index2 < (index+find.length()); index2++){
        //         //System.out.println(index2 + " " + index3);
        //         if(sen.charAt(index2) == find.charAt(index3)){
        //             //System.out.println("The string was found");
        //             flag++;
        //         }
        //         else{

        //             break;
        //         }
        //         index3++;

        //     }
        //     //System.out.println("\n\n-----\n\n");
        //     if(flag == find.length()){
        //         System.out.println("Found the match at " + index);
        //         break;
        //     }
        // }

        System.out.println(sen.toUpperCase());
        
        char var = 'c';

        int varI = (int)var;
        System.out.println(varI);
        if(varI >= 65 || varI <= 90){
            System.out.println("UPPER");
        } else{
            System.out.println("LOWER");
        }
        System.out.println((int) 'a');
        System.out.println((int) 'z');

    }

}
