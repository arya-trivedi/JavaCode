public class DoubleClasses {
    public static void main(String[] args) {
        SecondClass second = new SecondClass();
        second.printSomething();
        System.out.println(second.x);

    }
}

class SecondClass {
    int x = 1;
    void printSomething(){
        
        System.out.println("Hello World");
    }
}
