package ss17_io_binary_serialization.baitap.product_management;

import java.util.Scanner;

public class ProductManagement {
    public static void menu() {
        IProductService iProductService = new ProductServicelmpl();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quản lý sản phẩm \n" +
                    "1.Thêm sản phẩm: \n" +
                    "2.Hiển thị sản phẩm: \n" +
                    "3.Tìm kiếm sản phẩm: \n" +
                    "4.Exit");
            System.out.println("Bạn chọn gì ?");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.search();
                    break;
                case 4:
                    System.exit(1);
            }
        } while (true);
    }
}
