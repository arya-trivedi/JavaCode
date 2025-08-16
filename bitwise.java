
public class bitwise {
    public static void main(String1[] args) {
        /*
         Bitwise works on binary representation 1s and 0s
        
        Time complexity - amount of time taken for your code to run.
        
        
         */
    
        
        int num = 10;
        System.out.println(Integer.toBinaryString(num));
        
        int num2 = 11;
        System.out.println(Integer.toBinaryString(num2));    

        /*
        
        1 0

        1 + 1 = 10
        1 + 0 = 1
        0 + 1 = 1
        0 + 0 = 0

          1
        1 0 1 1(11)
        1 0 1 0(10)
        -------------
        1 0 1 0  1

        /*
        AND (&)
        OR  (|)
        NOT 
        
        XOR
        >>
        <<

        AND

         1 0 1 1
       & 1 0 1 0
       -----------
       1 0 1 0
         */
        
         System.out.println(11 & 10);
         System.out.println(Integer.toBinaryString(10));

         /*
          
         OR

          1 0 1 1
        | 1 0 1 0
        ----------
        1 0 1 1(11)
          */
    
        System.out.println(11 | 10);
        System.out.println(Integer.toBinaryString(11));

        /*
        
        ~
        1011 =  ~(1011) = 

        1011
        (0100)

         */
        System.out.println(~11);
        System.out.println(Integer.toBinaryString(~11));

        /*
         
        ~N = -(~(~N)+1) = -(N+1)

        ~11 = -(11+1) = -12
        ~(-11) = 10
         */
        System.out.println(~(-11));
        System.out.println(Integer.toBinaryString(~(-11)));
    
        /*
        XOR
        
        1011
        1010
        -----
        0001
         */

        System.out.println(10^11);
        System.out.println(Integer.toBinaryString(10^11));
    
        /*
        >>(R)
        <<(L)

        10 >> n(/ 2**n)
        10 << n(* 2**n)
        */
        
        // 10 >> 2(10 / 2**2) = 10/4 = 2.
        System.out.println(10>>2);

        // 50 >> 3 (50 / 2**3) = 50/8 = 6.25

        System.out.println(50>>3);

        // 10 << 2
        
        int x = 3;
        int y = 4;

        System.out.println(x | y); /* 
            0011
            0100
            -----
            0111

        */ 
                                  
        System.out.println(x & y);

        /*
         * 0011
         * 0100
         * ----
         * 0000
         */
        System.out.println(x >> y);

        /*
         * 3/16
         * 
         * 
         */
        System.out.println(x << y);

        /*
         * 48
         * 
         * 
         */
        System.out.println(x ^ y);
        /*
         * 0011
         * 0100
         * -----
         * 0111
         * 
         */
        System.out.println(~x);
        /*
         * !(x) = -(x+1)
         * x -> -4
         * 
         * 
         */
    }
}
