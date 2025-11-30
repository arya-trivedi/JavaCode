class myClass {
    String Name;
    protected int Age;
    
    void setName(String name){
        Name = name;
    }

    void getName(){
        System.out.println(Name);
    }
    
    void setAge(int age){
        Age = age;
    }

    void getAge(){
        System.out.println(Age);
    }

    void info(){
        getName();
        getAge();
    }

    private void hello(){
        //these two variables 

        String name1 = "java"; 
        int id = 10;
    }


}
