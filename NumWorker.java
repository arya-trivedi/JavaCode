public class NumWorker
{
    public static int even_div(String s, int n)
    {
        int count = Integer.parseInt(s);
        int i = 0;
        while (count != 0){
            int lastDigit = count % 10;
            if(lastDigit%n==0){
                i++;
            }
            count/=10;
        }
        // Add your code here
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println(even_div("6892", 3) + " should be 2");
    }
}
