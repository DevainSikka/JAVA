package interfaces;

class Main implements Shape,Square{
    public void getDimensions(){};
    public void area(){
        System.out.println("hello");
    };
    public void hello(){};
    public static void main(String args[]){
        Main obj = new Main();
        obj.area();
        System.out.println("hello world");

    }
}