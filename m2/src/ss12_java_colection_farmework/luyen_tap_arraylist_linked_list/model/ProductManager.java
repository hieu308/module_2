package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model;

public class ProductManager extends Products {
    private String manufacturer;

    public ProductManager() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ProductManager(int product_id, String product_name, int product_price, String manufacturer) {
        super(product_id, product_name, product_price);
        this.manufacturer = manufacturer;

    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Hang sản xuất: " + manufacturer;
    }
}
