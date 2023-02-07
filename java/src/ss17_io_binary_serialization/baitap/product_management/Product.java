package ss17_io_binary_serialization.baitap.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productName;
    private String manufacturer;
    private int price;

    public Product(int productCode, String productName, String manufacturer, int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
