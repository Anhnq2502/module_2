package controllers;

import java.util.Scanner;

public class FacilityController {
    public static void facilityManagement() {
        System.out.println("Menu \n" +
                "1.Display list facility \n" +
                "2.Add new facility \n" +
                "3.Display list facility maintenance \n" +
                "4.Return main menu \n ");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    displayListFacility();
                    break;
                case "2":
                    addNewFacility();
                    break;
                case "3":
                    displayListFacilityMaintenance();
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
