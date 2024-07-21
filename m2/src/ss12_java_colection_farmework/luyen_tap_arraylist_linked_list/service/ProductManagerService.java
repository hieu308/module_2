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
    public void editStudent(int index, ProductManager product) {
        iProductManagerRepository.editStudent(index, product);
    }

    @Override
    public int getIndex(ProductManager product) {
        return iProductManagerRepository.getIndex(product);
    }

    @Override
    public ProductManager checkName(String name) {
        return iProductManagerRepository.checkName(name);
    }

    @Override
    public void sortProductsByPrice(boolean ascending) {

    }
}
