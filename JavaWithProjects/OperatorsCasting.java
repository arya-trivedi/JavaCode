package JavaWithProjects;

public class OperatorsCasting {
    public static void main(String[] args) {
        int a = 2 + 3 * 4;
        System.out.println(a);

        int x = 72/6/3;

        System.out.println(x);

        x = 72/(6/3);

        System.out.println(x);

        boolean b1 = false;
        boolean b2;
        boolean b3;
        b3=b2=b1;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        int x2 = 3;
        ++x2;
        System.out.println(x2); //4
        System.out.println(x2++); //4
        System.out.println(x2); //5


        int y = 4;
        y--;
        System.out.println(y); //3
        System.out.println(--y); //2
        System.out.println(y); //2

        int x3 = +6;
        int y2 = -x;
        System.out.println(x3); //6
        System.out.println(y2); //-6

        int z = (int)3.45;
        System.out.println(z);

        boolean b = true;
        System.out.println(!b);
        System.out.println(b);

        int res = 6+4-2;
        System.out.println(res);

        System.out.println(10/3);

        int mod1 = 10 % 3;
        System.out.println(mod1);
        int mod2 = 0 % 3;
        System.out.println(mod2);

        int res2 = 3+2*4;
        System.out.println(res2);
        res2 = (3+2) * 4;
        System.out.println(res2);
        res = 6 + 4 - 2;
        System.out.println(res);
        res = 10/4 * 6 % 10;
        System.out.println(res);

        int a2=3, b4=2;
        int res3 = a2+b4;

        System.out.println(res3); //5
        String s = "abc";
        String s1 = a+s;
        String s2 = s+a;
        System.out.println(s1 + " " + s2);

        System.out.println("Output is " + (a2+b4)); //"Output is 32"
        System.out.println("Output is " + (a2+b4)); //"Output is 5"

        boolean b5 = false, b6 = true;
        boolean res4 = b1 && (b2=false);
        
        System.out.println(b1 + " " + b2 + " " + res); //false true

        int x4 = 2;
        x4 *= 2 + 5;
        System.out.println(x4); // 14

        int k=1;
        k += (k=4) * (k+2);
        System.out.println(k); //25

        char c = 'a'; //normal
        int i = c; //widening, char to int
        float f = i; //widening, int to float
        double d = f; //widening, float to double
        float f2 = 1L; //widening, long to float

        int i1 = (int)3.5;
        byte b7 = (byte)233;
        float f1 = (float) 3.5;
        System.out.println(i1 + " " + b7 + " " + f1);



    }
    
}
