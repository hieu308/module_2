package bai_tap_them.model;

public class Moto extends Vehicle {
    private int power;

    public Moto() {
    }

    public Moto(String controlPlate, Brand brand, String yearOfManufacture, String owner, int power) {
        super(controlPlate, brand, yearOfManufacture, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
