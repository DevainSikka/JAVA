// import java.lang;
//java pue OOPS language
//James Gosling - team of 3
//Green team
//oak - register oak trademark of someone else
//java - indonesia island name
//1995/96 - popular
//features - platform independent - windows, mac, linux, mobile
//jvm, byte code
import java.util.Scanner; //user input
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("hello world");
        System.out.print("Hello");
        
        Scanner sc = new Scanner(System.in); //object, new - keyword
        System.out.println("Enter number ");
        char a;
        a = sc.next().charAt(5);
        System.out.println("Entered value is "+a);
        for(int i = 0; i < 5; i++){
            System.out.println("Value "+ i); // string concatination
        }

        String stringValue;
        System.out.println("Enter the value to store in string ");
        stringValue = sc.next();
        System.out.println("Entered value is "+stringValue);
    }
    
}
