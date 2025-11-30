import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileHandling {
    public static void main(String[] args) {
        //Hard=Disk vs RAM
        
        //Hard-Disk - permananent memory
        //RAM = temporary memory
        //pandas -> data science library used for file handling

        //webscraping -> collects all content on webpage

        /*
        Create, Read, Update, Delete
        - Four possible functions to work on a file

        Update->2-> Write(lost of data), Append

         */

         try{
            //File myFile = new File("files\\myfile.txt");
            FileWriter myFile = new FileWriter("files\\myfile.txt");
            //System.out.println(myFile.createNewFile());
            myFile.write("This is Java - 1\n");
            myFile.write("This is Java - 2");
            myFile.close();

         }
         catch(IOException e){
            System.out.println("Error " + e);
         }
        
    }
}
