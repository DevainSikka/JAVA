package area;
import java.util.Scanner;
class Square implements Shape{
    Scanner sc = new Scanner(System.in);
    double side;
    public void getDimensions(){
        System.out.println("enter the value of side of sqquare");
        side = sc.nextDouble();
    };
    public void calculate(){
        System.out.println("area = "+side*side );
    };

}