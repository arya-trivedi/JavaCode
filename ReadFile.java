import java.io.*;
import java.util.Scanner;
public class ReadFile {

    public static void main(String[] args) {
        try {
            File textReader = new File("log.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your word: ");
            String word = sc.nextLine();

            Scanner sc2 = new Scanner(textReader);

            int count = 0;
            while(sc2.hasNextLine()){
                //System.out.println(sc2.nextLine());

                String text = sc2.nextLine();

                
                for(int i = 0; i < text.length(); i++){
                    if(text.substring(0, word.length()).equals(word)){
                        count++;
                    }
                }

            }
            System.out.println(count);

            
    
        } catch (Exception e) {
            System.out.println("Error occurred" + e);
        }

        
    }
}
