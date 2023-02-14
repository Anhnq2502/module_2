package controllers;

import services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        do {
            System.out.println("Menu\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Delete employee\n" +
                    "4.Edit employee\n" +
                    "5.Return main menu\n");
            Scanner scanner = new Scanner(System.in);
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    employeeService.displayListEmployees();
                    break;
                case "2":
                    employeeService.addNewEmployee();
                    break;
                case "3":
                    employeeService.deleteEmployee();
                    break;
                case "4":
                    employeeService.editEmployee();
                    break;
                case "5":
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 5");
            }
        } while (true);
    }
}
