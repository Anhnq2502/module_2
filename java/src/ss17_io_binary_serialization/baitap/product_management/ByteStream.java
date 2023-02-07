package ss17_io_binary_serialization.baitap.product_management;

import java.io.*;
import java.util.List;

public class ByteStream {
    private static final String FILE_PATH = "F:\\CodeGym\\module2\\java\\src\\ss17_io_binary_serialization\\baitap\\product_management\\product.data";

    public static void writeObjectList(List<Product> productList) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readObjectList() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Product> productList;
        try {
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    public static void main(String[] args) {
        ProductManagement.menu();
    }
}
