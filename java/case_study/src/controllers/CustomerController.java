package controllers;

import services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu\n" +
                "1.Display list customer\n" +
                "2.Add new customer\n" +
                "3.Edit customer\n" +
                "4.Return main menu\n");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    customerService.displayListCustomer();
                    break;
                case "2":
                    customerService.addNewCustomer();
                    break;
                case "3":
                    customerService.editCustomer();
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

