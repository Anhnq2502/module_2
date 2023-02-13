package controllers;

import java.util.Scanner;

public class BookingController {
    public static void bookingManagement() {
        System.out.println("Menu \n" +
                "1.Add new booking\n" +
                "2.Display list booking \n" +
                "3.Return main menu");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    addNewBooking();
                    break;
                case "2":
                    displayListBooking();
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
