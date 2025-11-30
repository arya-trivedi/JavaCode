public class IsPrime {
    public static void main(String[] args){
        //checkPrime(8);

        for (int i = 2; i <= 100; i++){
            checkPrime(i);
        }

    }

    public static void checkPrime(int n){
        int i = 2;
        boolean flag = true;
        while (i < n){
            if(n % i != 0){
                i++;
            }else {
                System.out.println(n + " is not a prime number");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(n + " is a prime Number");
        }
    }


}
