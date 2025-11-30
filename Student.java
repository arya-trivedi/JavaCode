public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void getInfo_2(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }

    /*
    Getters and Setters
    
    */

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
