package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.service;

import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model.ProductManager;
import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.repository.IProductManagerRepository;
import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.repository.ProductManagerRepository;

import java.util.List;

public class ProductManagerService implements IProductManagerService {
    IProductManagerRepository iProductManagerRepository = new ProductManagerRepository();

    @Override
    public List<ProductManager> findAll() {
        return iProductManagerRepository.findAll();
    }

    @Override
    public void addProduct(ProductManager productManager) {
        iProductManagerRepository.addProduct(productManager);
    }

    @Override
    public void removeProduct(int id) {
        iProductManagerRepository.removeProduct(id);
    }

    public ProductManagerService() {
        super();
    }

    @Override
    public ProductManager checkId(int id) {
        return iProductManagerRepository.checkId(id);
    }

    @Override
    public void editProduct(int index, ProductManager product) {
        iProductManagerRepository.editProduct(index, product);
    }

    @Override
    public int getIndex(ProductManager product) {
        return iProductManagerRepository.getIndex(product);
    }

//    @Override
//    public void sortProductsDescendingByPrice() {
//        List<ProductManager> products = iProductManagerRepository.findAll();
//        products.sort((p1, p2) -> Integer.compare(p2.getProduct_price(), p1.getProduct_price()));
//    }


    @Override
    public void sortProductsAscendingByPrice() {
        iProductManagerRepository.sortProductsAscendingByPrice();
    }

    @Override
    public void sortProductsDescendingByPrice() {
        iProductManagerRepository.sortProductsDescendingByPrice();
    }

    @Override
    public ProductManager checkName(String name) {
        return iProductManagerRepository.checkName(name);
    }

}

