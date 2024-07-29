package bai_tap_them.model;

import java.util.Objects;

public abstract class Vehicle {
    private String controlPlate;
    private Brand brand;
    private String yearOfManufacture;
    private String owner;

    public Vehicle() {

    }

    public Vehicle(String controlPlate, Brand brand , String yearOfManufacture, String owner) {
        this.controlPlate = controlPlate;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
        this.brand = brand;

    }

    public Object getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }



    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "controlPlate='" + controlPlate + '\'' +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", owner='" + owner + '\''
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle that = (Vehicle) o;
        return Objects.equals(controlPlate, that.controlPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(controlPlate);
    }
}
