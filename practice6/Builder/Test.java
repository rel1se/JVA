package practice6.Builder;

public class Test {
    public static void main(String[] args) {
        DirectorHouse directorHouse = new DirectorHouse();
        BuilderHouse houseBuilder = new BuilderHouse();
        directorHouse.constructSmallHouse(houseBuilder);
        House house = houseBuilder.getResult();
        System.out.println(house.getRoomCount());
        System.out.println(house);
    }
}
