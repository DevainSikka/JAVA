public class Inheritance{
    public static void main(String args[]){
        Mammals mammals = new Mammals();
        mammals.speak1();
        Marineanimals marineanimals = new Marineanimals();
        marineanimals.speak2();
        Bluewhale bluewhale = new Bluewhale();
        bluewhale.speak3();
        bluewhale.speak1();
        bluewhale.speak2();
    }
}