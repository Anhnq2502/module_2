package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        System.out.println("Menu \n" +
                "1.Employee Management \n" +
                "2.Customer Management \n" +
                "3.Facility Management \n" +
                "4.Booking Management \n" +
                "5.Promotion Management \n" +
                "6.Exit");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    EmployeeController.employeeManagement();
                    break;
                case "2":
                    CustomerController.customerManagement();
                    break;
                case "3":
                    FacilityController.facilityManagement();
                    break;
                case "4":
                    BookingController.bookingManagement();
                    break;
                case "5":
                    PromotionController.promotionManagement();
                    break;
                case "6":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Nhập từ 1 - 5");
            }
        } while (true);
    }
}
