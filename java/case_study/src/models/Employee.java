package models;

import java.time.LocalDate;

public class Employee {
    private int employeeCode;
    private String fullNameEmployee;
    private LocalDate dateOfBirthEmployee;
    private String genderEmployee;
    private int identityCardNumberEmployee;
    private int phoneNumberEmployee;
    private String emailEmployee;
    private String literacyEmployee;
    private String positionEmployee;
    private int wageEmployee;

    public Employee(int employeeCode, String fullNameEmployee, LocalDate dateOfBirthEmployee, String genderEmployee, int identityCardNumberEmployee, int phoneNumberEmployee, String emailEmployee, String literacyEmployee, String positionEmployee, int wageEmployee) {
        this.employeeCode = employeeCode;
        this.fullNameEmployee = fullNameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.genderEmployee = genderEmployee;
        this.identityCardNumberEmployee = identityCardNumberEmployee;
        this.phoneNumberEmployee = phoneNumberEmployee;
        this.emailEmployee = emailEmployee;
        this.literacyEmployee = literacyEmployee;
        this.positionEmployee = positionEmployee;
        this.wageEmployee = wageEmployee;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public void setFullNameEmployee(String fullNameEmployee) {
        this.fullNameEmployee = fullNameEmployee;
    }

    public LocalDate getDateOfBirthEmployee() {
        return dateOfBirthEmployee;
    }

    public void setDateOfBirthEmployee(LocalDate dateOfBirthEmployee) {
        this.dateOfBirthEmployee = dateOfBirthEmployee;
    }

    public String getGenderEmployee() {
        return genderEmployee;
    }

    public void setGenderEmployee(String genderEmployee) {
        this.genderEmployee = genderEmployee;
    }

    public int getIdentityCardNumberEmployee() {
        return identityCardNumberEmployee;
    }

    public void setIdentityCardNumberEmployee(int identityCardNumberEmployee) {
        this.identityCardNumberEmployee = identityCardNumberEmployee;
    }

    public int getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(int phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getLiteracyEmployee() {
        return literacyEmployee;
    }

    public void setLiteracyEmployee(String literacyEmployee) {
        this.literacyEmployee = literacyEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public int getWageEmployee() {
        return wageEmployee;
    }

    public void setWageEmployee(int wageEmployee) {
        this.wageEmployee = wageEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", fullNameEmployee='" + fullNameEmployee + '\'' +
                ", dateOfBirthEmployee=" + dateOfBirthEmployee +
                ", genderEmployee='" + genderEmployee + '\'' +
                ", identityCardNumberEmployee=" + identityCardNumberEmployee +
                ", phoneNumberEmployee=" + phoneNumberEmployee +
                ", emailEmployee='" + emailEmployee + '\'' +
                ", literacyEmployee='" + literacyEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", wageEmployee=" + wageEmployee +
                '}';
    }
}
