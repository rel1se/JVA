package practice6.Builder;

public class BuilderHouse implements Builder{
    House house = new House();
    @Override
    public void makeBase(int square) {
        house.buildBase(square);
    }

    @Override
    public void makeRooms(int roomsCount) {
        house.buildRooms(roomsCount);

    }

    @Override
    public void makeGarage(boolean hasGarage) {
        house.buildGarage(hasGarage);
    }

    @Override
    public House getResult() {
        return house;
    }
}
