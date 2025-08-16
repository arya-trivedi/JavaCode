import java.util.Scanner;

public class question2Sarray {
    public static void main(String1[] args) {
        //Matrix Add

        /*
        
        1  2  3
        4  5  6
        7  8  9

        ---------

        9  8  7
        6  5  4
        3  2  1

        
        ---------

        10  10  10
        10  10  10
        10  10  10

         */

        //  int[][] matrixA = new int[3][3];
        //  int[][] matrixB = new int[3][3];

        //  Scanner sc = new Scanner(System.in);

        //  System.out.println("Enter the value of Matrix A");
        //  for(int index = 0; index < matrixA.length; index++){
        //     System.err.println("\n\nROW " + index);
        //     for(int index2 = 0; index2 < matrixA[index].length; index2++){
        //         System.out.println("Enter value for " + index + " COL " + index2);
        //         matrixA[index][index2] = sc.nextInt();
        //     }
        //  }

        //  System.out.println("Enter the value of Matrix B");
        //  for(int index = 0; index < matrixB.length; index++){
        //     System.err.println("\n\nROW " + index);
        //     for(int index2 = 0; index2 < matrixB[index].length; index2++){
        //         System.out.println("Enter value for " + index + " COL " + index2);
        //         matrixB[index][index2] = sc.nextInt();
        //     }
        //  }

        // int [][] result = new int[3][3];
        // if((matrixA.length == matrixB.length) && (matrixA[0].length == matrixB[0].length)){
        //     for(int index  = 0; index < result.length; index++){
        //         for(int index2 = 0; index2 < result[index].length; index2++){
        //             result[index][index2] = matrixA[index][index2] + matrixB[index][index2];
        //         }
        //     }
        // }

        // System.out.println("RESULT");
        // for(int index = 0; index < result.length; index++){
        //     System.out.println();
        //     for(int index2 = 0; index2 < result[index].length; index2++){
        //         System.out.print(result[index][index2]);
        //         System.out.println(" ");
        //     }
        // }

        /*
        1  2  3
        4  5  6
        
        3  2  1
        6  5  4

        */

        int[][] arr = {{1, 2, 3, 4}, {4, 2, 3, 1}};
        int temp = 0;

        int start = 0;
        int end = arr.length-1;

        for(int i = 0; i < arr.length; i++){

            while(start < end){
                
                temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                
                start++;
                end--;
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.println();
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
