public class methodQuestion {
    public static void main(String[] args) {
        
        //printPattern(5);
        //printPatternOpposite(5);
        printPatternBinary(4);
        /*
        printPattern(4)
        n = 4

        1
        1 2
        1 2 3
        1 2 3 4



         */
    
    }

    static void printPattern(int n){
        for(int row = 1; row<=n; row++){
            //System.out.println(row);
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
     n = 4
          *
        * *
      * * *
    * * * *

    N=4(N is given, i is row)
    Row 1 -> 3Space, 1 Star | (N-i) Spaces, i star
    Row 2 -> 2Space, 2 Star |
    Row 3 -> 1Space, 3 Star |
    Row 4 -> 0Space, 4 Star |

    */

    static void printPatternOpposite(int n){
        for(int row = 1; row<=n; row++){
            //System.out.println(row);
            for(int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    /*N = 4
        * * * *
        * * *
        * *
        *

        n= 4
        stars--


        1
        0 1
        1 0 1
        0 1 0 1     

        */

    static void printPatternBinary(int n){

        n = 4;
        for(int row =1; row <=n; row++){
            int start =  row % 2;
            //System.out.print(start);

            for(int col = 1; col <=row; col++){
                start = 1-start;
                System.out.print(start + " ");
            }
            System.out.println();
        }



    }

    




}
