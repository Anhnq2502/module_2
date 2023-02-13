package models;

import java.time.LocalDate;

public class Employee extends Person {

    private String literacy;
    private String position;
    private int wage;


    public Employee(int code, String fullName, LocalDate dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String literacy, String position, int wage) {
        super(code, fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.literacy = literacy;
        this.position = position;
        this.wage = wage;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "literacy='" + literacy + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
