//package ss12_collection_framework.baitap.luyentap.service;
//
//import ss12_collection_framework.baitap.luyentap.model.Product;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductServiceImpl implements IProductService {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final List<Product> productList = new ArrayList<>();
//
//    @Override
//    public void add() {
//        System.out.print("Nhập ID: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.print("Nhập giá: ");
//        int price = Integer.parseInt(scanner.nextLine());
//        productList.add(new Product(id, name, price));
//    }
//
//    @Override
//    public void edit() {
//        System.out.print("Nhập ID sản phẩm cần sửa: ");
//        int idEdit = Integer.parseInt(scanner.nextLine());
//        boolean isExit = false;
//
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getId() == idEdit) {
//                System.out.println("Sản phẩm cần sửa " + productList.get(i));
//                System.out.println("Bạn có muốn sửa không?\n" +
//                        "1. Có\n" +
//                        "2. Không");
//                int choice = Integer.parseInt(scanner.nextLine());
//                if (choice == 1) {
//                    System.out.println("Nhập tên mới ");
//                    String name = scanner.nextLine();
//                    System.out.println("Nhập giá mới ");
//                    int price = Integer.parseInt(scanner.nextLine());
//                    productList.set(i, new Product(productList.get(i).getId(), name, price));
//                    System.out.println(" Đã sửa");
//                }
//                isExit = true;
//                break;
//            }
//        }
//        if (!isExit) {
//            System.out.println("Không tìm thấy");
//        }
//    }
//
//    @Override
//    public void remove() {
//        System.out.print("Nhập ID sản phẩm cần xoá ");
//        int idRemove = Integer.parseInt(scanner.nextLine());
//        boolean isExit = false;
//        for (Product product : productList) {
//            if (product.getId() == idRemove) {
//                int choice = Integer.parseInt(scanner.nextLine());
//                if (choice == 1) {
//                    productList.remove(product);
//                    System.out.println("Đã xoá");
//                }
//                isExit = true;
//                break;
//            }
//        }
//        if (!isExit) {
//            System.out.println("Không tìm thấy");
//        }
//    }
//
//    @Override
//    public void display() {
//        for (Product product : productList) {
//            System.out.println(product);
//        }
//    }
//
//    @Override
//    public void search() {
//        System.out.print("Nhập tên sản phẩm cần tìm: ");
//        String nameSearch = scanner.nextLine();
//        boolean isExit = false;
//        for (Product product : productList) {
//            if (product.getName().contains(nameSearch)) {
//                System.out.println(product);
//                isExit = true;
//            }
//        }
//        if (!isExit) {
//            System.out.println("Không tìm thấy");
//        }
//    }
//
//    @Override
//    public void sort() {
//        int choice;
//        do {
//            System.out.println("Sắp xếp\n" +
//                    "1. Tăng dần\n" +
//                    "2. Giảm dần");
//            choice = Integer.parseInt(scanner.nextLine());
//            if (choice != 1 && choice != 2) {
//                System.out.println("Nhập lại");
//            }
//        } while (choice != 1 && choice != 2);
//        PriceComparatorDiscount priceComparatorDiscount = new PriceComparatorDiscount();
//        PriceComparatorReduction priceComparatorReduction = new PriceComparatorReduction();
//        if (choice == 1) {
//            productList.sort(priceComparatorDiscount);
//            System.out.println("Sắp xếp theo giá tăng dần: ");
//        } else {
//            productList.sort(priceComparatorReduction);
//            System.out.println("Sắp xếp theo giá giảm dần");
//        }
//        for (Product product : productList) {
//            System.out.println(product);
//        }
//    }
//}