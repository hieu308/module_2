package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.repository;

import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model.ProductManager;

import java.util.ArrayList;
import java.util.List;

public class ProductManagerRepository implements IProductManagerRepository {
    private static List<ProductManager> list;

    static {
        list = new ArrayList<>();
        ProductManager telephone = new ProductManager(101, "samsum galaxy", 20, "samsung");
        ProductManager car = new ProductManager(201, "SHI5", 1000, "HonDa");
        list.add(telephone);
        list.add(car);
    }

    @Override
    public void sortProductsAscendingByPrice() {
        list.sort((p1, p2) -> Integer.compare(p1.getProduct_price(), p2.getProduct_price()));

    }

    @Override
    public void sortProductsDescendingByPrice() {

        list.sort((p1, p2) -> Integer.compare(p2.getProduct_price(), p1.getProduct_price()));
    }

    @Override
    public List<ProductManager> findAll() {
        return list;
    }

    @Override
    public void addProduct(ProductManager productManager) {
        list.add(productManager);
    }

    public ProductManagerRepository() {
        super();
    }

    @Override
    public ProductManager checkId(int id) {
        for (ProductManager product : list) {
            if (product.getProduct_id() == id) {
                return product;
            }
        }
        System.out.println("không tìm thấy id");
        return null;
    }


    @Override
    public int getIndex(ProductManager product) {
        return list.indexOf(product);
    }

    @Override
    public void editProduct(int index, ProductManager product) {
        list.set(index, product);
    }

    @Override
    public void removeProduct(int id) {
        list.remove(checkId(id));
    }

    @Override
    public ProductManager checkName(String name) {
        for (ProductManager product : list) {
            if (product.getProduct_name().trim().equalsIgnoreCase(name.trim())) {
                return product;
            }
        }
        System.out.println("không tìm thấy tên sản phẩm");
        return null;
    }
}
