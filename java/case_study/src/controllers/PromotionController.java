package controllers;

import java.util.Scanner;

public class PromotionController {
    public static void promotionManagement() {
        System.out.println("Menu \n" +
                "1.Display list customer use service\n" +
                "2.Display list customer get voucher \n" +
                "3.Return main menu");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    displayListCustomerUseService();
                    break;
                case "2":
                    displayListCustomerGetVoucher();
                    break;
                case "3":
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 3");
            }
        } while (true);
    }
}
