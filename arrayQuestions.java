import java.util.Scanner;

public class arrayQuestions {
    public static void main(String1[] args) {
        Scanner sc = new Scanner(System.in);

        // int size;
        // int[] marks;

        // System.out.println("Enter the size of the array: ");
        // size = sc.nextInt();

        // marks = new int[size];
        // System.out.println(marks.length);

        // for(int index = 0; index <size; index++){
        //     System.out.println("Enter the " + (index+1) + " element of the array");
        //     marks[index] = sc.nextInt();
        // }

        /*
         
        1 2 3  4  5
        1 4 27 16 125

        */

        int[] arr1;

        System.out.println("Enter the size of the array: ");
        int nums = sc.nextInt();

        arr1 = new int[nums];
        
        for(int i = 0; i < nums; i++){
            System.out.println("Enter the " + (i+1) + " element of the array");
            arr1[i] = sc.nextInt();

        }

        for(int i = 0; i < nums; i++){
            if(arr1[i] % 2 == 0){
                arr1[i]*=arr1[i];
                System.out.println(arr1[i]);
            }else{
                arr1[i] = arr1[i] * arr1[i] * arr1[i];
                System.out.println(arr1[i]);
            }
        }

        sc.close();


    }
}
