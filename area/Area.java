package area;

public class Area{
    public static void main(String args[]){
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        square.getDimensions();
        square.calculate();
        rectangle.getDimensions();
        rectangle.calculate();
        circle.getDimensions();
        circle.calculate();
    } 
}