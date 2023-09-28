import java.util.Scanner;
public class Bank{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Sbi sbi = new Sbi();
        Pnb pnb = new Pnb();
        int name;
        char money;
        System.out.println("name of bank you have\n" + "SBI or PNB\n" + "press 1 for sbi or 2 for pnb ");
        name = sc.nextInt();
        if(name == 1){
            sbi.getInformation();
            System.out.println("to deposit money press d or to withdraw press w or to scheck interest press i");
            money = sc.next().charAt(0);
            System.out.print(money+" condition "+(money == 'd'));
            if(money == 'd' || money == 'D' ){
                sbi.deposit();
            }
            else if(money == 'w' || money == 'W'){
                sbi.withdraw();
            }
            else if(money == 'i' || money == 'I'){
                sbi.interest();
            }
            else{

            }

        }
        if(name == 2){
            pnb.getInformation();
            System.out.println("to deposit money press d or to withdraw press w or to scheck interest press i");
            money = sc.next().charAt(0);
            if(money == 'd' || money == 'D' ){
                pnb.deposit();
            }
            else if(money == 'w' || money == 'W'){
                pnb.withdraw();
            }
            else if(money == 'i' || money == 'I'){
                pnb.interest();
            }
            else{
                
            } 

        }
       

    }
}