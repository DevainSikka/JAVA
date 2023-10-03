import java.util.Scanner;
public class Consecutive{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num[] = new double[3];
        for(int i = 0;i<3;i++){
            System.out.println("enter the number ");
            num[i] = sc.nextDouble();
        }
        System.out.println("after getting numbers ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                if(num[i] < num[j]){
                    double temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
            }
        }
    }
        for(int i=0;i<3;i++){
            System.out.println(num[i]);
        }
     
        if (num[0] == num[1] - 1 && num[1] == num[2] - 1) {
            System.out.println("they are consecutive and final series are"+ num[0]+","+num[1]+","+num[2]);
        }
        else{
            System.out.println("they are not consecutive");
        }
    }
}
