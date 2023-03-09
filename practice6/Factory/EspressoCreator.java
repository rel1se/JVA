package practice6.Factory;

public class EspressoCreator extends Factory{
    @Override
    protected CoffeeMachine doCoffee() {
        return new Espresso();
    }
}
