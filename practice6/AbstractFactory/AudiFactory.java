package practice6.AbstractFactory;

public class AudiFactory implements CarsFactory{
    @Override
    public Sedan createSedan() {
        return new AudiSedan();
    }

    @Override
    public Coupe createCoupe() {
        return (Coupe) new AudiCoupe();
    }
}
