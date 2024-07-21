package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model;

public class Products {
    private int product_id;
    private String product_name;
    private int product_price;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public Products() {
    }

    public Products(int product_id, String product_name, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return
                "Mã sản phâm: " + product_id +
                ", Tên: '" + product_name + '\'' +
                ", Giá: " + product_price + "$" ;

    }
}
