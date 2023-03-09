package practice6.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        CarsFactory factory1;
        factory1 = new PorscheFactory();
        factory1.createSedan();
        CarsFactory factory2;
        factory2 = new AudiFactory();
        factory2.createCoupe();
    }
}
