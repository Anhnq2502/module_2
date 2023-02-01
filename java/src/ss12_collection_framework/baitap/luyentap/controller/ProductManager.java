package ss12_collection_framework.baitap.luyentap.controller;

import ss12_collection_framework.baitap.luyentap.service.IProductService;
import ss12_collection_framework.baitap.luyentap.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductManager {
    public static void menuProduct() {
        IProductService iProductService = new ProductServiceImpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quản lý sản phẩm:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm\n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Hiển thị sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm\n" +
                    "6. Sắp xếp\n" +
                    "7. Exit");
            System.out.print("Bạn chọn gì: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.remove();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.search();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(1);
            }
        } while (true);
    }
}