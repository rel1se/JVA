package practice6.Builder;

public interface Builder {
    void makeBase(int square);
    void makeRooms(int roomsCount);
    void makeGarage(boolean hasGarage);
    House getResult();
}
