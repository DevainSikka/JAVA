import java.util.Scanner;
public class Sbi extends MainBank{
    Scanner sc = new Scanner(System.in);
    public void deposit(){
        System.out.println("enter the amount you want to deposit");
        amount = sc.nextInt();
        amountinbank = amountinbank + amount;
        System.out.println("your money is deposited "+ amountinbank);

    }
    public void withdraw(){
        System.out.println("enter the money you want to withdraw ");
        amount = sc.nextInt();
        if(amount > amountinbank){
            System.out.println("sorry you do not have tht much money in your bank account");

        }
        else{
            amountinbank = amountinbank - amount;
            System.out.println("here is your money"+ amountinbank);
            
        }
    }
    public void interest(){
        System.out.println("enter the amount you wanna deposit");
        amount = sc.nextInt();
        System.out.println("for how much time(in year)");
        time = sc.nextInt();
        System.out.println("rate of interest is 5%"+ "prifit will be"+ calculateAmount());

    }
}