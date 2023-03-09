package practice6.Builder;

public class House {

    private int square;
    private boolean hasGarage;
    private int roomCount;

    public void buildBase(int square){
        this.square = square;
    }

    public void buildGarage(boolean hasgarage){
        this.hasGarage = hasGarage;
    }

    public void buildRooms(int roomCount){
        this.roomCount = roomCount;
    }

    public int houseSquare() {
        return square;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public int getRoomCount() {
        return roomCount;
    }

    @Override
    public String toString() {
        return "House{" + "buildBase=" + square + ", hasGarage=" + hasGarage + ", roomCount=" + roomCount + '}';
    }
}