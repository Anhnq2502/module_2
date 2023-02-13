import casetudy.models.Customer;
import casetudy.models.People;
import casetudy.servives.interfacee.ICustomerService;
import casetudy.utils.DataCustomer;
import casetudy.utils.HangSo;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();
    DataCustomer dataCustomer = new DataCustomer();

    public void add(){
        System.out.println("ten khach hang");
        String name = scanner.nextLine();
        System.out.println("ngay sinh");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("so chung minh nhan dan");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("so dien thoai");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        int customerCode;
        boolean flagOfCustomerCode;
        System.out.println("ma khach hang");
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
                System.out.println("ma da ton tai\n" +
                        "vui long nhap lai");
            }
        } while (!flagOfCustomerCode);
        String customerType = null;
        String chooseOfCustomerType;
        do {
            System.out.println("chon kieu khach hang\n" +
                    "1.Diamond\n" +
                    "2.Platinium\n" +
                    "3.Gold\n" +
                    "4.Silver\n" +
                    "5.Member");
            chooseOfCustomerType = scanner.nextLine();
            switch (chooseOfCustomerType) {
                case "1":
                    customerType = "Diamond";
                    break;
                case "2":
                    customerType = "Platinium";
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
                    System.out.println("vui long nhap lua chon tu 1 => 5");

            }
        } while (!"12345".contains(chooseOfCustomerType));
        Customer newCustomer = new Customer(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, customerCode, customerType);
        customerList.add(newCustomer);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(HangSo.FILE_CUSTOMER, true);
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
    }


    public void display() {
        try {
            if (dataCustomer.Read().isEmpty()) {
                System.out.println("không có khách hàng");
            } else {
                for (People i : dataCustomer.Read()) {
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void edit() {
        List<Customer> customerList1 = null;
        try {
            customerList1 = dataCustomer.Read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("nhap ma khách hang");
        int customerCode = Integer.parseInt(scanner.nextLine());
        boolean flagOfPeople = false;
        for (Customer i : customerList1) {
            if (customerCode == i.getCustomerCode()) {
                flagOfPeople = true;
            }
        }
        if (flagOfPeople) {
            System.out.println("nhap thong tin can sua\n" +
                    "1.name\n" +
                    "2.ngay sinh\n" +
                    "3.gioi tinh\n" +
                    "4.so chung minh nhan dan\n" +
                    "5.so dien thoi\n" +
                    "6.email\n" +
                    "7.ma khach hang\n" +
                    "8.kieu khach hang\n" +
                    "9.luu thay doi");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("nhap ten moi");
                    String name = scanner.nextLine();
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setName(name);
                        }
                    }
                    break;
                case "2":
                    System.out.println("nhap ngay sinh moi");
                    int dayOfBirth = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setDayOfBirth(dayOfBirth);
                        }
                    }
                    break;
                case "3":
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setSex(sex);
                        }
                    }
                    break;
                case "4":
                    System.out.println("nhap so cmnd moi");
                    int identityCardNumber = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setIdentityCardNumber(identityCardNumber);
                        }
                    }
                    break;
                case "5":
                    System.out.println("nhap so dien thoai moi");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setPhoneNumber(phoneNumber);
                        }
                    }
                    break;
                case "6":
                    System.out.println("nhap email moi");
                    String email = scanner.nextLine();
                    for (Customer i : customerList1) {
                        if (customerCode == i.getCustomerCode()) {
                            i.setEmail(email);
                        }
                    }
                    break;
                case "7":
                    System.out.println("nhap ma moi");
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
                        System.out.println("ma khach hang da on tai");
                    }
                    break;
                case "8":
                    String chooseOfCustomerType = null;
                    String customerType = null;
                    do {
                        System.out.println("chon kieu khach hang moi\n" +
                                "1.Diamond\n" +
                                "2.Platinium\n" +
                                "3.Gold\n" +
                                "4.Silver\n" +
                                "5.Member");
                        chooseOfCustomerType = scanner.nextLine();
                        switch (chooseOfCustomerType) {
                            case "1":
                                customerType = "Diamond";
                                break;
                            case "2":
                                customerType = "Platinium";
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
            System.out.println("ma khong ton tai");
        }
    }

    public void remove(){
        List<Customer> customerList2;
        try {
            customerList2 = dataCustomer.Read();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        if (customerList2.isEmpty()) {
            System.out.println("khong co khach hang");
        } else {
            System.out.println("nhap ma khach hang");
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
                System.out.println("ma khong ton tai");
            }
        }
        try {
            dataCustomer.write(customerList2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}