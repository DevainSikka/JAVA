import java.util.Scanner;

public class Task5{
    int function(){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter number ");
        a = sc.nextInt();
        if(a>0){
        return function();
        } 
        return a; 
    }
    public static void main(String args[]){
        Task5 task5 = new Task5();
        task5.function();
        System.out.print("bye bye user");
    } 
}