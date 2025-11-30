public class StringPalindrome {
    public static void main(String[] args){

        String s1 = "bob1";
        String result = "";
        for (int i = s1.length()-1; i >= 0; i--){
            result += s1.charAt(i);
        }
        System.out.println(result);
        if(result.equals(s1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
