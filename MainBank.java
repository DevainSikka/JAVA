import java.util.Scanner;
public class MainBank{
    public String holdername;
    public int accountNumber;
    public int amountinbank;
    public int amount;
    public int time;
    double calculateAmount(){
            return amount*5*time/100;
        }
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter number ");
     //   a = sc.nextInt();    
    public void getInformation(){
        System.out.println("enter holder name");
        holdername = sc.next();
        System.out.println("enter your account number");
        accountNumber = sc.nextInt();
        System.out.println("enter amount you have in yor bank");
        amountinbank = sc.nextInt();
    }
}
