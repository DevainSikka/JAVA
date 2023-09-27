import java.util.Scanner;

public class task4{
    int function(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter number ");
        a = sc.nextInt();
        return a;
    }   
    public static void main(String args[]){
        task4 Task4 = new task4();
        while(Task4.function()>0){
            
            Task4.function();
            
        } 
        
        System.out.print("bye bye user");
            
        }
}
