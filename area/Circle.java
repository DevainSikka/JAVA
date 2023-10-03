package area;
import java.util.Scanner;
class Circle implements Shape{
    Scanner sc = new Scanner(System.in);
    double radius;
    public void getDimensions(){
        System.out.println("enter the value of radius of circle");
        radius = sc.nextDouble();
    };
    public void calculate(){
        System.out.println("area = "+3.14*radius*radius );
    };

}