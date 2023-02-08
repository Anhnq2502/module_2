package ss17_io_binary_serialization.baitap.product_management.controller;

import ss17_io_binary_serialization.baitap.product_management.service.IProductService;
import ss17_io_binary_serialization.baitap.product_management.service.ProductService;

import java.util.Scanner;

public class ProductManagement {
    public static void menu() {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quản lý sản phẩm \n" +
                    "1.Thêm sản phẩm: \n" +
                    "2.Hiển thị sản phẩm: \n" +
                    "3.Tìm kiếm sản phẩm: \n" +
                    "4.Exit");
            System.out.println("Bạn chọn gì ?");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    iProductService.add();
                    break;
                case "2":
                    iProductService.display();
                    break;
                case "3":
                    iProductService.search();
                    break;
                case "4":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chỉ nhập từ 1-4");
            }
        } while (true);
    }
}
