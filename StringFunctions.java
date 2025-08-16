public class StringFunctions {
    public static void main(String[] args) {
        // String name = "Hello, how ARe you 123";

        /*
        UPPER CASE -> NO NEED TO CHANGE 
        LOWER CASE -> CONVERT IT TO UPPER CASE
        SPACE -> NO NEED TO CHANGE
        SPECIAL CHAR -> NO NEED TO CHANGE
        NUMBER -> NO NEED TO CHANGE
         */

        //  System.out.println("a ascii " +  (int) 'a');
        //  System.out.println("a ascii " +  (int) 'z');

        //  System.out.println("A ascii " +  (int) 'A');
        //  System.out.println("Z ascii " +  (int) 'Z');


        //  String result = "";

        // for(int i = 0; i < name.length(); i++){
        //  char abc = 'h';
        //  int ascii = (int)abc;
        //  if(ascii >= 97 && ascii <= 122){
        //     System.out.println("LOWER CASE");
        //     int upper = ascii-32;
        //     result += (char) upper;
        //     continue;
        //  }
        
        // }

            
        // String result = "";
        // for(int i = 0; i < name.length(); i++){   
        //     char abc = name.charAt(i);
        //     int ascii = (int)abc;
        //     if(ascii >= 65 && ascii <= 90){
        //         //System.out.println("UPPER CASE");
        //         int lower = ascii + 32;
        //         result += (char)lower;
        //         continue;
        //     }
        //     result += abc;
        // }
        // System.out.println(result);

        // String sen = "Hello";
        // char find = 'l';
        // char replace = 'z';
        // String result = "";

        // for(int i = 0; i < sen.length(); i++){
        //     if(find ==sen.charAt(i)){
        //         System.out.println("We found target");
        //         result += replace;
        //     }else{
        //         result +=sen.charAt(i);
        //     }
        // }
        // System.out.println(result);

        
        String name2 = "    Python World    ";
        // System.out.println(name2.trim().length());
        //.trim() only removes prefix and suffix spaces

        String result = "";

        int start;

        for(start = 0; start < name2.length(); start++){
            if(name2.charAt(start) != ' '){
                break;
            }
        }

        int start2;

        for(start2 = name2.length()-1; start2 > 0; start2--){
            if(name2.charAt(start2) != ' '){
                break;
            }
        }
        System.out.println(start2);

        int start_new;

        for(start_new = start; start_new <= start2; start_new++){
            result += name2.charAt(start_new);
        }
        System.out.println(result);


    }
}
