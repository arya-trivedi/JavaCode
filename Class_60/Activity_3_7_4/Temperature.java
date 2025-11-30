package Class_60.Activity_3_7_4;

public class Temperature
{
    private double temperature;
    public static double maxTemp = 0;

    public Temperature(double t)
    {
        temperature = t;
        if (t > maxTemp)
        {
             maxTemp = t;
        }
    }
    // This static method should print out the static variable
    public static void printMax()
    {
        System.out.println(maxTemp);
    }

    public static void main(String[] args)
    {
        Temperature t1 = new Temperature(75);
        Temperature t2 = new Temperature(100);
        Temperature.printMax();
    }
}
