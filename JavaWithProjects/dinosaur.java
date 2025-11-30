package JavaWithProjects;

public class dinosaur {
    public static void main(String[] args) {
        String name = "Arya Trivedi";
        String breed = "triceratops";
        int age = 34;
        double height = 114;
        double length = 30;
        double weight = 26000;
        boolean carnivore = true;
        System.out.println("Welcome, " + name + " to Mesozoic Eden!");
        System.out.println("Mesozoic Eden is safe and secure");

        if(carnivore){
            System.out.println("Is a carnivore, so give meat");
        }else{
            System.out.println("Is herbivore, so give plants");
        }

        switch (breed) {
            case "Triceratops":
                System.out.println(breed);
            case "T-Rex":
                System.out.println("T-Rex");
            default:
                break;
        }

        


    }
    
}
