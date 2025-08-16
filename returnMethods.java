public class returnMethods {
    public static void main(String[] args) {
        System.out.println(square(5)); //we cannot directly call square(5) because this is a void return function 
        //System.out.println(abc);
        System.out.println(stringLength("hello"));
        System.out.println(reversal("helloworld"));
    }

    // static void square(int a){
    //     System.out.println(a*a);
    // }

    static int square(int a){
        int abc = 10; //local scope
        String nameAbc = "Hello";
        return a*a;
    }

    // static boolean isPrine(int n){
    //     if (n==1) {
    //         return true;
    //     }
        
    //     for(int i = 2; i <n; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
        
    //     return true;
    // }

        static int stringLength(String word){
            int i = 0;
            for(i = 0; i < word.length(); i++){
                //x++;
            }
            return i;
        }

        static String reversal(String word){
            String reversed = "";
            for(int i = word.length()-1; i >= 0; i--){
                //System.out.println(word.charAt(i));
                reversed += word.charAt(i);
            }

            return reversed;
        }



}
