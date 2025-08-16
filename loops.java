public class loops {
    public static void main(String1[] args) {
        
        /*
        3 Loop
        
        for loop
        
        
        while loop
        do-while loop
        */

        /*
        WHILE LOOP

        while(){


        }
        
        */
        
        // int num = 5;
        // while(num < 10){
        //     System.out.println("Hello");
        // }

        // System.out.println("END OF WHILE LOOP");


        int num = 1;

        while(num<=5){
            System.out.println(num++);
        }

        //
        int num2 = 7;
        int var1 = 1;
        while(var1<=10){
            int product = num2*var1;
            System.out.print(num2 + " * " + var1 + " = " + (product));
            
            if(product % 2 == 0){
                System.out.println("| EVEN");
            }else{
                System.out.println("| ODD");
            }
            var1++;
        }


        /*... */

        /*
        10

        1 -> 1
        2 -> 1, 2
        3 -> 1, 2, 3
        ..
        10 -> 1, 2, 3, 4, 5,...10
         */

        int num3 = 10;
        int count = 1;
        while(count <= 10){
            System.out.println(count++);
            System.out.println("------");
            int temp = 1;
            while(temp < count){
                System.out.println(temp++);
            }
            System.out.println("\n\n----------------\n");
        }
        /*
         
        count = 1
        1 time, inner 1 times

        count = 2
        1 time, inner 2 times

        count = 3
        1 time = inner 3 times

        ...........

        count = 4
        1 time 
        
        
        */

        /*
        
        4   6: 4,5,6
        
        4 * 1 = 4
        ....
        4 * 10 = 40
        
        5*1 = 5
        ----
        5*10 = 50
        
        
        6*1 = 6
        ...
        6*10 = 60


        
        */

        int x = 4;
        int y = 6;
        int count2 = 1;

        while(x<=y){
            while(count2 <= 10){
                System.out.println(x + " * " + count2 + " = x " + (x*count2));
                count2++;
            }
            System.out.println(" ");
            count2 = 1;
            x++;
        }
        

    }

    
}
