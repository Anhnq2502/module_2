package models;

public class Employee extends Person {
    int employeeCode;
    String level;
    String workingPosition;
    Double wage;

    public Employee(String name, String dayOfBirth, String sex, int identityCardNumber, int phoneNumber, String email, int employeeCode, String level, String workingPosition, Double wage) {
        super(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.workingPosition = workingPosition;
        this.wage = wage;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + "," + dayOfBirth + "," + sex + ","+ identityCardNumber + "," + phoneNumber + "," + email + "," + employeeCode +"," + level + "," + workingPosition + "," + wage;
    }
}
