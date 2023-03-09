package practice6.AbstractFactory;

public class PorscheFactory implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new PorscheSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new PorscheCoupe();
    }
}
