public class citizen {

    private String name;
    private int age;
    private address address;

    public citizen(String name, int age, address address){
        this.name=name;
        this.age=age;
        this.address= new address(
            address.getCity(),
            address.getStreet(),
            address.getZip()
        );
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        this.address.print();
    }
    
    
}
