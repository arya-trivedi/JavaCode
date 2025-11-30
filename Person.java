
public class Person {
    private static int count = 0;
    private String name;

    public Person(String n ){
        this.name = n;
        count++;
    }

    public static void getCount(){
        System.out.println(count);
    }

   
}


