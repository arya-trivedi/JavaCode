import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What activty would you like to add: ");
        String activity = sc.nextLine();
        
        if(activity.equals("View")){
            viewToDO();
        }else{
            addToDo();
        }


    }

    public static void addToDo(){
        try {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("What activity would you like to add to the file.");
            String activity = sc2.nextLine();
            FileWriter append = new FileWriter("todofile.txt",true);
            append.write(activity + "\n");
            append.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error:" + e);

        }
    }

    public static void viewToDO(){
        try {
            File view = new File("todofile.txt");
            Scanner sc = new Scanner(view);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

}
