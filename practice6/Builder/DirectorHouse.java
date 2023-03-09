package practice6.Builder;

public class DirectorHouse {
    public void constructSmallHouse(Builder builder){
        builder.makeBase(80);
        builder.makeGarage(false);
        builder.makeRooms(3);
    }
    public void constructBigHouse(Builder builder){
        builder.makeBase(200);
        builder.makeGarage(true);
        builder.makeRooms(7);
    }
}
