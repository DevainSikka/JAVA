package exceptions;
import java.io.*;
import java.util.Scanner;

public class Exceptions {
    public static void main(String arrgs[]){
        File file = new File("hello world");
        try {
            if(file.exists() == false){
                file.createNewFile();
            }
            //Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next());
            
        }
        }
        catch(IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
    
}
