package area;
import java.util.Scanner;
class Rectangle implements Shape{
    Scanner sc = new Scanner(System.in);
    double length;
    double bredth;
    public void getDimensions(){
        System.out.println("length = ");
        length = sc.nextDouble();
        System.out.println("bredth = ");
        bredth = sc.nextDouble();
    };
    public void calculate(){
        System.out.println("area = "+length*bredth );
    };

}