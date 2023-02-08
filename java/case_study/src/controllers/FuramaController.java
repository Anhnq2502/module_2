package controllers;

import services.FuramaServiceImpl;
import services.IFuramaService;

import java.util.Scanner;

public class FuramaController {
    IFuramaService iFuramaService = new FuramaServiceImpl();
    public static void displayMainMenu() {
        System.out.println("Menu \n" +
                "1.Employee Management \n" +
                "2.Customer Management \n" +
                "3.Facility Management \n" +
                "4.Booking Management \n " +
                "5.Promotion Management \n" +
                "6.Exit");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    employeeManagement();
                    break;
                case "2":
                    customerManagement();
                    break;
                case "3":
                    facilityManagement();
                    break;
                case "4":
                    bookingManagement();
                    break;
                case "5":
                    promotionManagement();
                    break;
                case "6":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Nhập từ 1 - 6");
            }
        } while (true);
    }

    public static void employeeManagement() {
        System.out.println("Menu \n" +
                "1.Display list employees \n" +
                "2.Add new employee \n" +
                "3.Delete employee \n" +
                "4.Edit employee \n " +
                "5.Return main menu \n");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        do {
            switch (select) {
                case "1":
                    displayListEmployees();
                    break;
                case "2":
                    addNewEmployee();
                    break;
                case "3":
                    deleteEmployee();
                    break;
                case "4":
                    editEmployee();
                    break;
                case "5":
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 5");
            }
        } while (true);
    }

    public static void customerManagement() {
        System.out.println("Menu \n" +
                "1.Display list customer \n" +
                "2.Add new customer \n" +
                "3.Edit customer \n" +
                "4.Return main menu \n ");
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
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 4");
            }
        } while (true);

    }

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
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 4");
            }
        } while (true);
    }

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
