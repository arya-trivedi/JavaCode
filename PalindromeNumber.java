public class PalindromeNumber {
    public static void main(String[] args){
        int num = 4334;
//        System.out.println(num%10);
//        System.out.println(num/10);

        int num2 = num;
        int result = 0;
        while (num > 0){
            int lastDigit = num % 10;
            result = (10*result) + lastDigit;
            num = num/10;
        }
        System.out.println(result);

        if(result==num2){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }


    }
}