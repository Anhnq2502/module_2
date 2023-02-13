package models;

import java.time.LocalDate;

public class Customer extends Person{
    private String typeOfGuest;
    private String addressCustomer;


    public Customer(int code, String fullName, LocalDate dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String typeOfGuest, String addressCustomer) {
        super(code, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.addressCustomer = addressCustomer;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
