public class constant {
    public static void main(String1[] args) {
        /*
        abc + 1 = bcd
        bcd - 1 = abc
         
         */

        final int key = 5;

        System.out.println(key);

        //Data Conversion
        //int float, double

        //byte -> short -> int -> long -> float -> double

        // Narrow - > High to Low
        // Wide -> Low to High


        // 
        float num = 11.111f;
        int num2 = (int)num;
        System.out.println(num2);
        System.out.println((int)num);

        /*
        
        2 and 2.0 are not the same, different data types!!
        
        */

        int number = 9;
        double number_double = (double) number;
        System.out.println(number_double);

        int num3 = 5;
        double num4 = (double)num3;
        System.out.println(num4);

        long x1 = 4;
        short x2 = (short)x1;
        System.out.println(x2);

        short m = 7;
        byte x4 = (byte)m;
        System.out.println(x4);

        byte v = 3;
        long v1 = (long)v;
        System.out.println(v1);
        
        double w = 5;
        float w2 = (float)w;
        System.out.println(w2);

        float f = 6.5f;
        long b = (long)f;
        System.out.println(b);
        
        /*
        
        char c1 = 'a';
        String s1 = "java"
        
        print((int) c1));
        print((int) s1));


        */

        char c1 = 'a';
        //String s1 = "java";
        
        System.out.println((int) c1);
        //System.out.print((int) s1));  -> does not convert into ASCII, because it is not a character.
        
        
    
    }
}
