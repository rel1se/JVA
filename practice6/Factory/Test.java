package practice6.Factory;

public class Test {
    public static void main(String[] args) {
        Factory cappucino = new CappucinoCreator();
        cappucino.coffeeMake();
        Factory espresso = new EspressoCreator();
        espresso.coffeeMake();
    }
}
