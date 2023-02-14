package controllers;

import services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    public static void facilityManagement() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        do {
            System.out.println("Menu\n" +
                "1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu\n ");
            Scanner scanner = new Scanner(System.in);
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    facilityService.displayListFacility();
                    break;
                case "2":
                    facilityService.addNewFacility();
                    break;
                case "3":
                    facilityService.displayListFacilityMaintenance();
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
