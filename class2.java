public class class2 {
    public static void main(String[] args) {
        
        System.out.println(withdrawal(100));
    }


    /*
     * name: withdrawal function
     * purpose: withdraw money from account
     * @params: money, this variable is used to subtract from balance variable
     * return -> (double)balance
     * precondition: money > 0
     * precondition: money > balance
     */
    static double withdrawal(double money){

        double balance = 200;
        if(money > 0 && money > balance){
            balance -=money;
        }
    
        return balance;
    }

}
