package ss12_collection_framework.baitap.luyentap.controller;

import ss12_collection_framework.baitap.luyentap.service.ProductMagament;
import ss12_collection_framework.baitap.luyentap.service.ProductManagement;

import java.util.Scanner;

public class ProductManager {
    static void menu() {
        Scanner scanner = new Scanner(System.in);
        ProductMagament productMagament = new ProductManagement();
        int choose;
        do {
            System.out.println("Menu \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm \n" +
                    "3. Xoá sản phẩm\n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm \n" +
                    "7. Exit");
            System.out.println("Nhập sự lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productMagament.add();
                    break;
                case 2:
                    productMagament.edit();
                    break;
                case 3:
                    productMagament.remove();
                    break;
                case 4:
                    productMagament.disPlays();
                    break;
                case 5:
                    productMagament.search();
                    break;
                case 6:
                    productMagament.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại ");
            }
        } while (true);
    }

    public static void main(String[] args) {
        ProductManager.menu();
    }
}