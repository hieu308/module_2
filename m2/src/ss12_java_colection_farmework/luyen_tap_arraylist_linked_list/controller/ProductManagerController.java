package ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.controller;

import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.model.ProductManager;
import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.service.IProductManagerService;
import ss12_java_colection_farmework.luyen_tap_arraylist_linked_list.service.ProductManagerService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerController {
    IProductManagerService iProductManagerService = new ProductManagerService();
    List<ProductManager> products = iProductManagerService.findAll();
    Scanner sc = new Scanner(System.in);

    public void displayProductManager() {
        for (ProductManager productManager : products) {
            if (productManager != null) {
                System.out.println(productManager);
            }
        }
    }

    public void addProductManager() {
        System.out.println("Nhập id sản phẩm");
        int id = sc.nextInt();

        System.out.println("Nhập tên sản phâm");
        String name = sc.next();
        System.out.println("Nhập giá sản phẩm");
        int price = sc.nextInt();
        System.out.println("Nhâp hãng xản xuất");
        String category = sc.next();
        ProductManager productManager = new ProductManager(id, name, price, category);
        iProductManagerService.addProduct(productManager);
    }

    public void deleteProductManager() {
        System.out.println("Nhập id sản phẩm muốn xoá");
        int id = sc.nextInt();
      iProductManagerService.removeProduct(id);

    }

    public void updateProductManager() {
        System.out.println("Nhập id sản phẩm muốn chỉnh sửa");
        int id = sc.nextInt();
        ProductManager productUpdate = iProductManagerService.checkId(id);
        if (productUpdate != null) {
            int index = products.indexOf(productUpdate);
            System.out.println("Nhập thông tinh chỉnh sửa:");
            System.out.println("Nhập id mới");
            int updateId = sc.nextInt();
            System.out.println("Nhập tên moi");
            String name = sc.next();
            System.out.println("Nhập gia mới");
            int price = sc.nextInt();
            System.out.println("Nhập hãng mới");
            String category = sc.next();
            ProductManager productNew = new ProductManager(updateId, name, price, category);
            iProductManagerService.editProduct(index, productNew);
            System.out.println("Cập nhật  sản phẩm thành công");

        }
    }


    public void sortProductAscending() {
        iProductManagerService.sortProductsAscendingByPrice();
    }

    public void sortProductDescending() {
        iProductManagerService.sortProductsDescendingByPrice();
    }

    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm cần tìm ");
        String name = sc.nextLine();
        ProductManager product = iProductManagerService.checkName(name);
        if (product != null) {
            System.out.println(product);
            displayDetail();
        } else {
            displayDetail();
        }
    }

    public void displayDetail() {
        int choice;
        do {
            System.out.println("Quảng lý sản pham: \n" +
                    "1.Hiển thị danh sách sản phẩm \n" +
                    "2.Thêm mới sản pham \n" +
                    "3.Xoá sản phẩm \n" +
                    "4.Tìm kiếm sản phẩm \n" +
                    "5.Chỉnh xửa sản phẩm \n" +
                    "6.Sắp xếp sản phẩm \n" +
                    "7.Trở về");
            System.out.println("Nhập lựa chọn của bạn");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayProductManager();
                    break;
                case 2:
                    addProductManager();
                    break;
                case 3:
                    deleteProductManager();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    updateProductManager();
                    break;
                case 6:
                    int choice2;
                    System.out.println("Chọn cách sap xếp: \n" +
                            "1.Sắp xếp  theo giá sản phẩm tăng giần \n" +
                            "2.Sắp xếp  theo giá sản phẩm giảm giần \n" +
                            "3.Trở về");
                    choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            sortProductAscending();
                            System.out.println("Xếp thành công theo thứ tự  giá tăng dần");
                            break;
                        case 2:

                            sortProductDescending();
                            System.out.println("Xếp thành công theo thứ tự giá giảm giần");
                            break;
                        case 3:
                            return;
                    }

                    break;
                case 7:
                    return;
            }
        } while (true);
    }
}
