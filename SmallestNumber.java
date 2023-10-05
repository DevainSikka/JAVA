import java.util.Scanner;
public class SmallestNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num[] = new double[3];
        for(int i = 0;i<3;i++){
            System.out.println("enter the number ");
            num[i] = sc.nextDouble();
        } 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                if(num[i] < num[j]){
                    double temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
            }
        }
    }
       // double smallest = num[0];
        System.out.println("smallest number is" + num[0]);
        System.out.println("final series is"+ num[0]+","+num[1]+","+num[2]);
    }
}