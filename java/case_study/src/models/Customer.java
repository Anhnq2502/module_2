package models;

import java.time.LocalDate;

public class Customer {
    private int customerCode;
    private String fullNameCustomer;
    private LocalDate dateOfBirthCustomer;
    private String genderCustomer;
    private int identityCardNumberCustomer;
    private int phoneNumberCustomer;
    private String emailCustomer;
    private String typeOfGuest;
    private String addressCustomer;


    public Customer(int customerCode, String fullNameCustomer, LocalDate dateOfBirthCustomer, String genderCustomer, int identityCardNumberCustomer, int phoneNumberCustomer, String emailCustomer, String typeOfGuest, String addressCustomer) {
        this.customerCode = customerCode;
        this.fullNameCustomer = fullNameCustomer;
        this.dateOfBirthCustomer = dateOfBirthCustomer;
        this.genderCustomer = genderCustomer;
        this.identityCardNumberCustomer = identityCardNumberCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.typeOfGuest = typeOfGuest;
        this.addressCustomer = addressCustomer;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getFullNameCustomer() {
        return fullNameCustomer;
    }

    public void setFullNameCustomer(String fullNameCustomer) {
        this.fullNameCustomer = fullNameCustomer;
    }

    public LocalDate getDateOfBirthCustomer() {
        return dateOfBirthCustomer;
    }

    public void setDateOfBirthCustomer(LocalDate dateOfBirthCustomer) {
        this.dateOfBirthCustomer = dateOfBirthCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getIdentityCardNumberCustomer() {
        return identityCardNumberCustomer;
    }

    public void setIdentityCardNumberCustomer(int identityCardNumberCustomer) {
        this.identityCardNumberCustomer = identityCardNumberCustomer;
    }

    public int getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(int phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
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
                "customerCode=" + customerCode +
                ", fullNameCustomer='" + fullNameCustomer + '\'' +
                ", dateOfBirthCustomer=" + dateOfBirthCustomer +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", identityCardNumberCustomer=" + identityCardNumberCustomer +
                ", phoneNumberCustomer=" + phoneNumberCustomer +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }
}
