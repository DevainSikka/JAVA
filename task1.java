import java.util.Scanner;
public class task1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        for(;;){
        System.out.println("Enter number ");
        a = sc.nextInt();
        if(a>0){
            continue;
        
        }else {
            System.out.print("bye bye user");
            break;
        }
        }
    }
}