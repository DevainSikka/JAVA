import java.util.Scanner;
public class SmallestNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num[] = new double[3];
        for(int i = 0;i<3;i++){
            System.out.println("enter the number ");
            num[i] = sc.nextDouble();
        } 
        double smallest = num[0];

    if (num[1] < smallest) {
        smallest = num[1];
    }

    if (num[2] < smallest) {
        smallest = num[2];
     }
        System.out.println("smallest number is " + smallest);
    if(num[0] == smallest){
        if(num[1]<num[2]){
            System.out.println(num[0]+"<"+num[1]+"<"+num[2]);
        }
        if(num[2]<num[1]){
            System.out.println(num[0]+"<"+num[2]+"<"+num[1]);
        }
    }
    if(num[1] == smallest){
        if(num[0]<num[2]){
            System.out.println(num[1]+"<"+num[0]+"<"+num[2]);
        }
        if(num[2]<num[0]){
            System.out.println(num[1]+"<"+num[2]+"<"+num[0]);
        }
    }
    if(num[2] == smallest){
        if(num[1]<num[0]){
            System.out.println(num[2]+"<"+num[1]+"<"+num[0]);
        }
        if(num[0]<num[1]){
            System.out.println(num[2]+"<"+num[0]+"<"+num[1]);
        }
    }
    }
}