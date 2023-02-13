package models;

public class Customer extends Person {
    int customerCode;
    String customerType;

    public Customer(String name, int dayOfBirth, String sex, int identityCardNumber, int phoneNumber, String email, int customerCode, String customerType) {
        super(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return customerCode + "," + customerType + "," + name + "," + dayOfBirth + "," + sex + "," + identityCardNumber + "," + phoneNumber + "," + email;
    }
}