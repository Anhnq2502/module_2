package services;

import controllers.EmployeeController;
import models.Employee;
import models.Person;
import utils.DataEmployee;
import utils.Constant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    DataEmployee dataEmployee = new DataEmployee();
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListEmployees() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
            if (employeeList1.isEmpty()) {
                System.out.println("Không có nhân viên nào");
            } else {
                for (Person i : dataEmployee.readEmployee()) {
                    System.out.println(i);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("Tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Ngày sinh");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới tính");
        String sex = scanner.nextLine();
        System.out.println("Số chứng minh nhân dân");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Số điện thoại");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("Mã nhân viên");
        boolean flag;
        int employeeCode;
        do {
            employeeCode = Integer.parseInt(scanner.nextLine());
            flag = true;
            for (Employee i : employeeList) {
                if (employeeCode == i.getEmployeeCode()) {
                    System.out.println("Mã đã tồn tại\n" +
                            "Mời bạn nhập lại");
                    flag = false;
                    break;
                }
            }
        } while (!flag);
        String chooseOfLevel = null;
        String level = null;

        do {
            System.out.println("Mời bạn chọn trình độ\n" +
                    "1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học\n" +
                    "5.Khác");
            chooseOfLevel = scanner.nextLine();
            switch (chooseOfLevel) {
                case "1":
                    level = "Trung cấp";
                    break;
                case "2":
                    level = "Cap đẳng";
                    break;
                case "3":
                    level = "Đại học";
                    break;
                case "4":
                    level = "Sau đại học";
                    break;
                case "5":
                    level = scanner.nextLine();
                    break;
            }
        } while ("12345".equals(chooseOfLevel));
        String chooseOfWorkingPosition = null;
        String workingPosition = null;
        do {
            System.out.println("Vị trí làm việc\n" +
                    "1.Lễ tân\n" +
                    "2.Phục vụ\n" +
                    "3.Chuyên viên\n" +
                    "4.Giám sát\n" +
                    "5.Quản lý\n" +
                    "6.Giám đốc\n" +
                    "7.Vị trí khác");
            chooseOfWorkingPosition = scanner.nextLine();
            switch (chooseOfWorkingPosition) {
                case "1":
                    workingPosition = "Lễ tân";
                    break;
                case "2":
                    workingPosition = "Phục vụ";
                    break;
                case "3":
                    workingPosition = "Chuyên viên";
                    break;
                case "4":
                    workingPosition = "Giám sát";
                    break;
                case "5":
                    workingPosition = "Quản lý";
                    break;
                case "6":
                    workingPosition = "Giám đốc";
                    break;
                case "7":
                    workingPosition = scanner.nextLine();
                    break;
                default:
                    System.out.println("Chỉ chọn từ 1 - 7");
            }
        } while (!"123456".contains(chooseOfWorkingPosition));
        System.out.println("Nhập số lương");
        Double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name, String.valueOf(dayOfBirth), sex, identityCardNumber, phoneNumber, email, employeeCode, level, workingPosition, wage);
        employeeList.add(employee);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(Constant.FILE_EMPLOYEE, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.toString() + "\n");
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
    }

    @Override
    public void deleteEmployee() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
            System.out.println("Nhập mã nhân viên");
            int codeEmployee = Integer.parseInt(scanner.nextLine());
            if (employeeList1.isEmpty()) {
                System.out.println("Không có nhân viên");
            } else {
                for (int i = 0; i < employeeList1.size(); i++) {
                    if (codeEmployee == employeeList1.get(i).getEmployeeCode()) {
                        employeeList1.remove(i);
                    }
                }
            }
            dataEmployee.writeEmployee(employeeList1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void editEmployee() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        do {
            System.out.println("Nhập thông tin cần sửa\n" +
                    "1.Tên\n" +
                    "2.Ngày sinh\n" +
                    "3.Giới tinh\n" +
                    "4.Số chứng minh nhân dân\n" +
                    "5.Số điện thoại\n" +
                    "6.Email\n" +
                    "7.Mã nhân viên\n" +
                    "8.Trình độ\n" +
                    "9.Vị trí làm việc\n" +
                    "10.Lương\n" +
                    "11.Back to menu");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1": {
                    boolean flag = false;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tên mới");
                    String nameAfter = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (nameAfter.contains(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setName(nameAfter);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "2": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập ngày sinh mới");
                    int day = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setDayOfBirth(String.valueOf(day));
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "3": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String sex = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setSex(sex);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "4": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập số chứng minh mới");
                    int identityCardNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setDayOfBirth(String.valueOf(identityCardNumber));
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "5": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập số điện thoại mới");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setPhoneNumber(phoneNumber);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "6": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập email mới");
                    String email = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setEmail(email);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "7": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập mã mới");
                    int employeeCode = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setEmployeeCode(employeeCode);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "8": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập lại trình độ mới");
                    String level = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setLevel(level);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "9": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập vị trí làm việc mới");
                    String workingPosition = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setWorkingPosition(workingPosition);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");

                    }
                }
                break;
                case "10": {
                    boolean flag = true;
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    System.out.println("Nhập số lương mới");
                    Double wage = Double.parseDouble(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setWage(wage);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Tên không tồn tại");
                    }
                }
                break;
                case "11":
                    EmployeeController.employeeManagement();
                    break;
                default:
                    System.out.println("Nhập từ 1 - 11");
            }
            try {
                dataEmployee.writeEmployee(employeeList1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
}