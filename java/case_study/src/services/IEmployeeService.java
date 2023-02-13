package services;

public interface IEmployeeService extends IService{
    void displayListEmployees();
    void addNewEmployee();
    void deleteEmployee();
    void editEmployee();
}
