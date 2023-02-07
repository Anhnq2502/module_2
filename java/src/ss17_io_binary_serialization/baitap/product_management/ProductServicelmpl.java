package ss17_io_binary_serialization.baitap.product_management;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServicelmpl implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Product> productList = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập Mã sản phẩm: ");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(productCode, productName, manufacturer, price));
        ByteStream.writeObjectList(productList);
    }

    @Override
    public void display() {
        List<Product> result = ByteStream.readObjectList();
        for (Product product : result) {
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String nameSearch = scanner.nextLine();
        boolean isExit = false;
        List<Product> search = ByteStream.readObjectList();
        for (Product product : search) {
            if (product.getProductName().contains(nameSearch)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy");
        }

    }
}
