package controllers;

import services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement() {
        System.out.println("Menu \n" +
                "1.Display list employees \n" +
                "2.Add new employee \n" +
                "3.Delete employee \n" +
                "4.Edit employee \n " +
                "5.Return main menu \n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    displayListEmployees();
                    break;
                case "2":
                    addNewEmployee();
                    break;
                case "3":
                    deleteEmployee();
                    break;
                case "4":
                    editEmployee();
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
