package controllers;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement() {
        System.out.println("Menu \n" +
                "1.Display list employees \n" +
                "2.Add new employee \n" +
                "3.Delete employee \n" +
                "4.Return main menu \n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    displayListCustomer();
                    break;
                case "2":
                    addNewCustomer();
                    break;
                case "3":
                    editCustomer();
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
}
