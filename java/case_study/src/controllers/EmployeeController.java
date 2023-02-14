package controllers;

import services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        System.out.println("Menu\n" +
                "1.Display list employees\n" +
                "2.Add new employee\n" +
                "3.Delete employee\n" +
                "4.Edit employee\n" +
                "5.Return main menu\n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    employeeService.display();
                    break;
                case "2":
                    employeeService.add();
                    break;
                case "3":
                    employeeService.remove();
                    break;
                case "4":
                    employeeService.edit();
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
