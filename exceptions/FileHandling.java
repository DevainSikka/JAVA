package exceptions;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String arrgs[]){
        File file = new File("exceptions/helloWorld.txt");
        System.out.println("After creating file");
        try {
            System.out.println("file.exists() "+file.exists());
            if(file.exists() == false){
                file.createNewFile();
            }
            FileReader fr=new FileReader(file);
            int i;
            while (( i = fr.read())!=-1) {
                System.out.println((char)i);    
            }
                
            
        } catch(IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
    
}
