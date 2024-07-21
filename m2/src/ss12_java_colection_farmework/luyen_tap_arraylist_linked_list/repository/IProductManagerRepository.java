package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.repository;

import quang_ly_code_gym.model.Student;
import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model.ProductManager;

import java.util.List;

public interface IProductManagerRepository {
    List<ProductManager> findAll();

    void addProduct(ProductManager productManager);

    void editProduct(int index, ProductManager product);

    public void sortProductsAscendingByPrice();
    public void sortProductsDescendingByPrice();
    //
    void removeProduct(int id);

    ProductManager checkId(int id);

    int getIndex(ProductManager product);
    ProductManager checkName(String name);

}