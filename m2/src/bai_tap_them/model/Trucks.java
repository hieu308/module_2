package bai_tap_them.model;

public class Trucks extends Vehicle {
    private int playLoad;

    public Trucks() {

    }

    public Trucks(String controlPlate, Brand brand, String yearOfManufacture, String owner, int playLoad) {
        super(controlPlate, brand, yearOfManufacture, owner);
        this.playLoad = playLoad;
    }

    public int getPlayLoad() {
        return playLoad;
    }

    public void setPlayLoad(int playLoad) {
        this.playLoad = playLoad;
    }

    @Override
    public String toString() {
        return super.toString() + "Trucks" + "playLoad=" + playLoad ;
    }
}
