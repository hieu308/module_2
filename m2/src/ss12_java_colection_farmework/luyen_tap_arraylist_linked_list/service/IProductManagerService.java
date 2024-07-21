package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.service;

import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model.ProductManager;

import java.util.List;

public interface IProductManagerService {
    List<ProductManager> findAll();
    void addProduct(ProductManager productManager);
    void removeProduct(int id );
    void editProduct(int index, ProductManager product);


    public void sortProductsAscendingByPrice() ;

    public void sortProductsDescendingByPrice();


    ProductManager checkId(int id);

    int getIndex(ProductManager product);
    ProductManager checkName(String name);

}
