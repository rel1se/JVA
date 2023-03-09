package practice6.Factory;

public abstract class Factory {
    public CoffeeMachine coffeeMake(){
        CoffeeMachine coffee = doCoffee();
        coffee.grind();
        return coffee;
    }
    protected abstract CoffeeMachine doCoffee();
}
