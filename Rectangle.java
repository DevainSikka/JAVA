import java.util.Scanner;
public class Rectangle{
    Scanner sc = new Scanner(System.in);
    public float length;
    public float bredth;
    Rectangle(float length,float bredth){
        this.length = length;
        this.bredth = bredth;
    }
    public void perimeter(){
        System.out.println(2*(length+bredth));
    }
    public void area(){
        System.out.println(length*bredth);
    }

}