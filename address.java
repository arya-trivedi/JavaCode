public class address {
    private String city;
    private String street;
    private String zip;


    public address(String city, String street, String zip){
        this.city = city;
        this.street = street;
        this.zip = zip;

    }

    public void print(){
        System.out.println("City: " + this.city);
        System.out.println("Street: " + this.street);
        System.out.println("Zip: " + this.zip);
    }

    public String getCity(){
        return this.city;
    }

    public String getStreet(){
        return this.street;
    }

    public String getZip(){
        return this.city;
    }
    
}
