package Human;

public class Person2 {
    String name;
    int age;

    public Person2(String n, int a){
        this.name = n;
        this.age = a;
    }
    
    public void getAge(){
        System.out.println(this.age);
    }

    public void getName(){
        System.out.println(this.name);
    }    
}
