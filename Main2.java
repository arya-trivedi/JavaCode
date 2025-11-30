public class Main2 {
    //git add . --> tracks files, sees if there is any change
    //git status --> shows current changes
    //git init --> 
    //git commit --> shows a message explaining code
    //git remote add origin --> links with GitHub Repo
    public static void main(String[] args) {
        System.out.printf("Hello");
        greet();
        print();

    }

    static void greet(){
        System.out.println("Hello World");
        greet();
    }

    static void print(){
        System.out.println("Testing");
    }


    
}
