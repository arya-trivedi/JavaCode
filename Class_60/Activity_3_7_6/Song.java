package Class_60.Activity_3_7_6;

public class Song
{
    // Add a public static variable called numVerses
    public static int numVerses = 0;

    // Add a static chorus method

    public static void chorus(){
        System.out.println("And they all go marching down to the ground \nTo get out of the rain, BOOM! BOOM! BOOM! BOOM! ");

    }

    // Add a static verse method with two parameters

    public static void verse(String number, String action){

        numVerses+=1;
        System.out.println("Verse :" + numVerses);
        System.out.println("The ants go marching " + number + " by " + number + ", hurrah, hurrah");
        System.out.println("The ants go marching " + number + " by " + number + ", hurrah, hurrah");

        System.out.println("The ants go marching " + number + " by " + number);
        System.out.println("The little one stops to" + action);
        chorus();
        System.out.println();

    }


    public static void main(String args[])
    {
        // Print out the static variable numVerses
        // and call the static methods to print out the Song for 3 verses
        System.out.println(Song.numVerses);
        Song.verse("one","suck a thumb");
        Song.verse("two","tie a shoe");
        Song.verse("three","climb a tree");



    }
}
