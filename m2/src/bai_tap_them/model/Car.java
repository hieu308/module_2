package bai_tap_them.model;

public class Car extends TrafficManagement{
    private int seats;
    private String model;

    public Car() {

    }

    public Car(String controlPlate, Object brand, String yearOfManufacture, String owner, int seats, String model) {
        super(controlPlate, brand, yearOfManufacture, owner);
        this.seats = seats;
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + "Car seats=" + seats + ", model=" + model ;

    }

}
