
import java.io.*;
import java.util.Scanner;
public class NewFile {
    public static void main(String[] args) {
        
        try {
            File myFile = new File("numbers.txt");
            // evenNumbers.createNewFile();
            FileWriter myfile2 = new FileWriter("numbers.txt",true);
            Scanner reader = new Scanner(myFile);
            
            String read = reader.nextLine();
            System.out.println(read);
            read = reader.nextLine();
            System.out.println(read);


            myfile2.close(); // moves file from RAM to hard-disk storage

            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error" + e);
        }
        

    }
    
}