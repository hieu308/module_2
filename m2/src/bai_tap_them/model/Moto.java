package bai_tap_them.model;

public class Moto extends TrafficManagement{
    private int power;

    public Moto() {
    }

    public Moto(String controlPlate, String brand, String yearOfManufacture, String owner) {
        super(controlPlate, brand, yearOfManufacture, owner);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
