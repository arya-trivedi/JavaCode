import java.util.Scanner;

public class array2D{
    public static void main(String1[] args){
    //     int [][] age;
        
    //     age = new int[][]{
    //       {1, 2, 3, 4},
    //       {4, 5, 6, 5},
    //       {7, 8, 9, 6}

    //     };

    //     System.out.println(age[1][3]);

    //     age[1][3] = 99;
    //     System.out.println(age[1][3]);

    //     for(int i = 0; i < age.length; i++){
    //         System.out.println("\n\nROW "+ (i + 1));
    //         for(int j = 0; j < age[i].length; j++){
    //             System.out.println(age[i][j]);
    //         }

    //     }

    // }

    Scanner sc = new Scanner(System.in);
    int [][]newAge = new int[2][3];



    for(int i = 0; i < newAge.length; i++){
        System.out.println("Enter the row elements: ");
        for(int j = 0; j < newAge[i].length; j++){
            System.out.println("Enter the column elements: ");
            int input = sc.nextInt();
            newAge[i][j] = input;
        }
    }    

    for(int i = 0; i < newAge.length; i++){
        System.out.println("\n\nROW " + (i + 1));
        for(int j = 0; j < newAge[i].length; j++){
            System.out.println(newAge[i][j]);
        }
    }

    }

}