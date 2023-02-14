package controllers;

import services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("Menu\n" +
                "1.Display list employees\n" +
                "2.Add new employee\n" +
                "3.Delete employee\n" +
                "4.Return main menu\n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    customerService.display();
                    break;
                case "2":
                    customerService.add();
                    break;
                case "3":
                    customerService.edit();
                    break;
                case "4":
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 4");
            }
        } while (true);
    }
}

