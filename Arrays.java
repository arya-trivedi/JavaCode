public class Arrays {
    public static void main(String1[] args) {
        int marks1 = 1;
        int marks2 = 2;
        int marks3 = 1;
        int marks4 = 2;
        int marks5 = 1;
        int marks6 = 2;

        int marks = 0;
        
        
        int [] age; //Array Declaration

        age = new int[5]; //  first type of init to store a memory of 5

        int [] age2 = new int[4]; //  first type of init to store a memory of 5

        int [] age3 = {5,5,3,6,1}; //  first type of init to store a memory of 5


                        // 0        //1
        String[] name = {"Java", "python", "c++", "c"};

        //Java does not support negative indexes

        System.out.println(name);

        age[0] = 45;
        age[1] = 55;
        age[2] = 65;
        age[3] = 75;
        age[4] = 85;


        System.out.println(age[2]);

        // Arrays are mutable - they can change
        age[2] = 0;
        System.out.println(age[2]);

        System.out.println("Length of arrays: " + age.length);

        // Printing an array

        for(int index = 0; index <= age.length-1; index++){
            System.out.println("index: " + index + " is " + age[index]);
        }

        String[] arr = {"blue","red","green","white","purple"};
        int i = 0;

        while (i <= arr.length-1) {
            System.out.println(arr[i]);
            i++;
        }

    }
    
}
