package ss12_collection_framework.baitap.luyentap.service;

import java.util.*;

public class ProductManagement implements ProductMagament {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> arrayList = new ArrayList<>();

    public void add() {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        arrayList.add(product);
    }

    public void remove() {
        System.out.print("Nhập ID cần xoá: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.remove(arrayList.get(i));
            }
        }
    }

    @Override
    public void disPlays() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    @Override
    public void edit() {
        System.out.print("Nhập ID cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm update: ");
        String name = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                arrayList.get(i).setName(name);
            }
        }
    }

    @Override
    public void sort() {
        Increase increase = new Increase();
        arrayList.sort(increase);
    }

    public void search() {
        System.out.print("Nhập sản phẩm cần tìm kiếm: ");
        String characters = scanner.nextLine();
        boolean flag = true;
        for (Product product : arrayList) {
            if (product.getName().toLowerCase().contains(characters.toLowerCase())) {
                System.out.println(product);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

}
