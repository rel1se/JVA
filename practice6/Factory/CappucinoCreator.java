package practice6.Factory;

public class CappucinoCreator extends Factory{
    @Override
    protected CoffeeMachine doCoffee() {
        return new Cappucino();
    }
}
