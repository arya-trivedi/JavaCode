public class methods {
    /*
    NAME OF THE FUNCTION
    RETURN TYPE OF FUNCTION
    TYPE OF FUNCTION(PUBLIC, PRIVATE, STATIC....)
    PARAMS OF FUNCTION


     * 
     */

    // static void greet(String name){
    //     System.out.println("Hello, good morning!");
    // }

    //Age(float), 18+

    /*
    RETURN TYPES & PARAMS
    
    Void - Params

    Void - Non Params

    Return - Params
    Return - Non Params
    */


    static void check_vote(float age){
        if(age > 18){
            System.out.println("PLEASE VOTE");
        }else{
            System.out.println("CAN'T VOTE");
        }
    }

    public static void main(String[] args) {
        // System.out.println("Hello World");
        // greet("Java");
        // greet("Python");s
        // greet("C++");

        // check_vote(5);
        // check_vote(20);

       // math(4.5f, 7.5f);

       oper(4,6 );


    }
    
    static void math(float num1, float num2){
        float sum = num1 + num2;
        System.out.println(sum);

        float diff = num1 - num2;
        System.out.println(diff);

        float product = num1 * num2;
        System.out.println(product);

        float quotient = num1/num2;
        System.out.println(quotient);

    }

    static void add(float num1, float num2){
        System.out.println("ADD" + (num1+num2));
    }

    static void subtract(float num1, float num2){
        System.out.println("SUB" + (num1-num2));

    }

    static void multiply(float num1, float num2){
        System.out.println("ADD" + (num1*num2));

    }

    static void divide(float num1, float num2){
        System.out.println("ADD" + (num1/num2));

    }

    static void oper(float num1, float num2){
        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }
}
