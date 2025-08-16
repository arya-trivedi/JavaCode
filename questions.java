public class questions {
    public static void main(String1[] args) {
        /*
         * Fact of a number
         * 
         * 
         *  
         */
    
        int result = 1;
        for(int num = 5; num >= 1; num--){
            result *= num;
        }
        System.out.println(result);

        int x = 4;
        int y = 5;

        int temp = 0;
        temp = y; // temp = 4
        y = x; // y = 4
        x = temp;
        
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
   }
}
