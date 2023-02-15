package services;

import controllers.CustomerController;
import models.Customer;
import models.Person;
import utils.DataCustomer;
import utils.Constant;
import utils.Regex;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Regex regex = new Regex();
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();
    DataCustomer dataCustomer = new DataCustomer();
    public void remove() {
        List<Customer> customerList2;
        try {
            customerList2 = dataCustomer.Read();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        if (customerList2.isEmpty()) {
            System.out.println("Không có khách hàng");
        } else {
            System.out.println("Nhập mã khách hàng");
            int customerCode = Integer.parseInt(scanner.nextLine());
            boolean flag = true;
            for (Customer i : customerList2) {
                if (customerCode == i.getCustomerCode()) {
                    i.setCustomerCode(customerCode);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Mã không tồn tại");
            }
        }
        try {
            dataCustomer.write(customerList2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayListCustomer() {
        try {
            if (dataCustomer.Read().isEmpty()) {
                System.out.println("không có khách hàng");
            } else {
                for (Person i : dataCustomer.Read()) {
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void addNewCustomer() {
        System.out.println("Tên khách hàng");
        String name = scanner.nextLine();
        String dayOfBirth;
        do {
            System.out.println("Ngày sinh của khac hàng");
            dayOfBirth = scanner.nextLine();
        }while (!regex.checkCodeDay(dayOfBirth));
        System.out.println("Giới tính của khách hàng");
        String sex = scanner.nextLine();
        System.out.println("Số chứng minh nhân dân của khách hàng");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Số điện thoại của khách hàng");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("email của khách hàng");
        String email = scanner.nextLine();
        int customerCode;
        boolean flagOfCustomerCode;
        System.out.println("Mã khách hàng");
        do {
            customerCode = Integer.parseInt(scanner.nextLine());
            flagOfCustomerCode = true;
            try {
                for (Customer i : dataCustomer.Read()) {
                    if (i.getCustomerCode() == customerCode) {
                        flagOfCustomerCode = false;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (!flagOfCustomerCode) {
                System.out.println("Mã đã tồn tại\n" +
                        "vui lòng nhập lại");
            }
        } while (!flagOfCustomerCode);
        String customerType = null;
        String chooseOfCustomerType;
        do {
            System.out.println("Chọn kiểu khách hàng\n" +
                    "1.Diamond\n" +
                    "2.Platinum\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member");
            chooseOfCustomerType = scanner.nextLine();
            switch (chooseOfCustomerType) {
                case "1":
                    customerType = "Diamond";
                    break;
                case "2":
                    customerType = "Platinum";
                    break;
                case "3":
                    customerType = "Gold";
                    break;
                case "4":
                    customerType = "Silver";
                    break;
                case "5":
                    customerType = "Member";
                    break;
                default:
                    System.out.println("Chỉ chọn từ 1 - 5");

            }
        } while (!"12345".contains(chooseOfCustomerType));
        Customer newCustomer = new Customer(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, customerCode, customerType);
        customerList.add(newCustomer);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(Constant.FILE_CUSTOMER, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newCustomer.toString() + "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thêm thành công");
        CustomerController.customerManagement();
    }

    @Override
    public void editCustomer() {
            List<Customer> customerList1 = null;
            try {
                customerList1 = dataCustomer.Read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Nhập mã khách hàng");
            int customerCode = Integer.parseInt(scanner.nextLine());
            boolean flagOfPeople = false;
            for (Customer i : customerList1) {
                if (customerCode == i.getCustomerCode()) {
                    flagOfPeople = true;
                }
            }
            if (flagOfPeople) {
                System.out.println("Nhập thông tin cần sửa\n" +
                        "1.Tên\n" +
                        "2.Ngày sinh\n" +
                        "3.Giới tính\n" +
                        "4.Số chứng minhh nhân dân\n" +
                        "5.Số điện thoại\n" +
                        "6.email\n" +
                        "7.Mã khách hàng\n" +
                        "8.Kiểu khách hàng\n" +
                        "9.Lưu thay đổi");
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        System.out.println("Nhập tên mới");
                        String name = scanner.nextLine();
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setName(name);
                            }
                        }
                        break;
                    case "2":
                        System.out.println("Nhập ngày sinh mới");
                        String dayOfBirth = String.valueOf(Integer.parseInt(scanner.nextLine()));
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setDayOfBirth(dayOfBirth);
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Nhập giới tính mới");
                        String sex = scanner.nextLine();
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setSex(sex);
                            }
                        }
                        break;
                    case "4":
                        System.out.println("Nhập số chứng minh nhân dân mới");
                        int identityCardNumber = Integer.parseInt(scanner.nextLine());
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setIdentityCardNumber(identityCardNumber);
                            }
                        }
                        break;
                    case "5":
                        System.out.println("Nhập số điện thoại mới");
                        int phoneNumber = Integer.parseInt(scanner.nextLine());
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setPhoneNumber(phoneNumber);
                            }
                        }
                        break;
                    case "6":
                        System.out.println("Nhập email mới");
                        String email = scanner.nextLine();
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                i.setEmail(email);
                            }
                        }
                        break;
                    case "7":
                        System.out.println("Nhập mã mới");
                        int newCustomerCode = Integer.parseInt(scanner.nextLine());
                        boolean flags = false;
                        for (Customer i : customerList1) {
                            if (customerCode == i.getCustomerCode()) {
                                flags = true;
                            }
                        }
                        if (flags) {
                            for (Customer i : customerList1) {
                                if (customerCode == i.getCustomerCode()) {
                                    i.setCustomerCode(newCustomerCode);
                                }
                            }
                        } else {
                            System.out.println("Mã khách hàng đã tồn tại");
                        }
                        break;
                    case "8":
                        String chooseOfCustomerType = null;
                        String customerType = null;
                        do {
                            System.out.println("Chọn kiểu khách hàng mới\n" +
                                    "1.Diamond\n" +
                                    "2.Platinum\n" +
                                    "3.Gold\n" +
                                    "4.Silver\n" +
                                    "5.Member");
                            chooseOfCustomerType = scanner.nextLine();
                            switch (chooseOfCustomerType) {
                                case "1":
                                    customerType = "Diamond";
                                    break;
                                case "2":
                                    customerType = "Platinum";
                                    break;
                                case "3":
                                    customerType = "Gold";
                                case "4":
                                    customerType = "Silver";
                                    break;
                                case "5":
                                    customerType = "Member";
                                    break;
                                default:
                                    System.out.println("vui long nhap lua chon tu 1 => 5");
                            }


                        } while (!chooseOfCustomerType.equals("12345"));
                        break;
                    default:
                        System.out.println("vui lonh nhap lua chon tu 1 => 9");
                }
                try {
                    dataCustomer.write(customerList1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Mã không tồn tại");
            }
    }
}