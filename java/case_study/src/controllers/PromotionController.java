package controllers;

import services.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionController {
    public static void promotionManagement() {
        PromotionServiceImpl promotionService = new PromotionServiceImpl();

        do {
            System.out.println("Menu \n" +
                "1.Display list customer use service\n" +
                "2.Display list customer get voucher\n" +
                "3.Return main menu");
            Scanner scanner = new Scanner(System.in);
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    promotionService.displayListCustomerUseService();
                    break;
                case "2":
                    promotionService.displayListCustomerGetVoucher();
                    break;
                case "3":
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 3");
            }
        } while (true);
    }
}
