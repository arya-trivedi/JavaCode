public class error {
    public static void main(String[] args) {
        /*
        Compile time error
            -Syntax error
            -undec. variables
            -type mismatch

        Run time error

            -
        Logical error 

         */

         int [] arr = {1,2,3,4};
         try {
            //System.out.println(arr[5]);
            System.out.println(2/0);

         } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Fixed" + e);
            System.out.println(arr[2]);
         }catch(ArithmeticException e){
            System.out.println("Error while dividing" + e);
         }

    }
}
