import java.util.Scanner;


public class javaClass {
    public static void main(String[] args) {// not able to run as main1
        System.out.println("Hello World");


        myClass c1 = new myClass();
        // System.out.println(c1.Name);
        // c1.Name = "Java";
        // System.out.println(c1.Name);
        // c1.getName();
        c1.setName("java");
        c1.setAge(18);

        /*
        PUBLIC -> ANY CLASS CAN ACCESS
        PRIVATE -> WITHIN THE CLASS
        PROT. -> WITHIN THE SAME PACKAGE AND SUBCLASSES
        DEF -> WITIHN THE SAME PACKAGE


         */
        
        c1.info();
        c1.Age =100;
       // c1.getName();
        //c1.getAge();
        c1.info();
    }
}
