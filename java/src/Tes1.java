

        import casetudy.controller.FuramaController;
        import casetudy.models.Employee;
        import casetudy.servives.interfacee.IEmployeeService;
        import casetudy.utils.DataEmployee;
        import casetudy.utils.HangSo;

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
    FuramaController furamaController = new FuramaController();

    public void display() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
            if (employeeList1.isEmpty()) {
                System.out.println("danh sach trong");
            } else {
                for (int i = 0; i < employeeList1.size(); i++) {
                    System.out.println(employeeList1.get(i));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add() {
        System.out.println("ten nhan vien");
        String name = scanner.nextLine();
        System.out.println("ngay sinh");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("gioi tinh");
        String sex = scanner.nextLine();
        System.out.println("so chung minh nhan dan");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("so dien thoai");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("ma nhan vien");
        boolean flag;
        int employeeCode;
        do {
            employeeCode = Integer.parseInt(scanner.nextLine());
            flag = true;
            for (Employee i : employeeList) {
                if (employeeCode == i.getEmployeeCode()) {
                    System.out.println("ma da ton tai\n" +
                            "moi ban nhap lai");
                    flag = false;
                    break;
                }
            }
        } while (!flag);
        String chooseOfLevel = null;
        String level = null;

        do {
            System.out.println("moi ban chon trinh do\n" + "1.trung cap\n" + "2.cao dang\n" + "3.dai hoc\n" + "4.sau dai hoc\n" + "5.khac");
            chooseOfLevel = scanner.nextLine();
            switch (chooseOfLevel) {
                case "1":
                    level = "trung cap";
                    break;
                case "2":
                    level = "cao dang";
                    break;
                case "3":
                    level = "dai hoc";
                    break;
                case "4":
                    level = "sau dai hoc";
                    break;
                case "5":
                    level = scanner.nextLine();
            }
        } while ("12345".equals(chooseOfLevel));
        String chooseOfWorkingPosition = null;
        String workingPosition = null;
        do {
            System.out.println("vi tri lam viec\n" + "1.le tan\n" + "2.phuc vu\n" + "3.chuyen vien\n" + "4.giam sat\n" + "5.giam doc\n" + "6.vi tri khac");
            chooseOfWorkingPosition = scanner.nextLine();
            switch (chooseOfWorkingPosition) {
                case "1":
                    workingPosition = "le tan";
                    break;
                case "2":
                    workingPosition = "phuc vu";
                    break;
                case "3":
                    workingPosition = "chuyen vien";
                    break;
                case "4":
                    workingPosition = "giam sat";
                    break;
                case "5":
                    workingPosition = "giam doc";
                    break;
                case "6":
                    workingPosition = scanner.nextLine();
            }
        } while (!"123456".contains(chooseOfWorkingPosition));
        System.out.println("nhap so luong");
        Double wage = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, employeeCode, level, workingPosition, wage);
        employeeList.add(employee);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(HangSo.FILE_EMPLOYEE, true);
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
    }

    public void edit() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        do {
            System.out.println("nhap thong tin can sua\n" + "1.ten\n" + "2.ngay sinh\n" + "3.gioi tinh\n" + "4.so chung minh nhan dan\n" + "5.so dien thoai\n" + "6.email\n" + "7.ma nhan vien\n" + "8.cap do\n" + "9.vi tri lam viec\n" + "10.luong\n" +
                    "11.luu thay doi\n" +
                    "12.return main menu");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1": {
                    boolean flag = false;
                    System.out.println("nhap ten can sua");
                    String nameBefore = scanner.nextLine();
                    System.out.println("nhap ten moi");
                    String nameAfter = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (nameAfter.contains(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setName(nameAfter);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("ten khong ton tai");

                    }
                }
                break;
                case "2": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap ngay moi");
                    int day = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setDayOfBirth(day);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "3": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap gioi tinh");
                    String sex = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setSex(sex);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "4": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so chung minh nhan dan moi");
                    int identityCardNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setDayOfBirth(identityCardNumber);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "5": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so dien thoai moi");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setPhoneNumber(phoneNumber);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("ten khong ton tai");

                    }

                }break;
                case "6": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap email moi");
                    String email = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setEmail(email);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "7": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap ma cong nhan moi");
                    int employeeCode = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setEmployeeCode(employeeCode);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "8": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("cap nhat lai trinh do");
                    String level = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setLevel(level);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "9": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap vi tri lam viec moi");
                    String workingPosition = scanner.nextLine();
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setWorkingPosition(workingPosition);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("tên không tồn tại");

                    }

                }break;
                case "10": {
                    boolean flag = true;
                    System.out.println("nhap ten can sua");
                    String name = scanner.nextLine();
                    System.out.println("nhap so luong moi");
                    Double wage = Double.parseDouble(scanner.nextLine());
                    for (int i = 0; i < employeeList1.size(); i++) {
                        if (name.equals(employeeList1.get(i).getName())) {
                            employeeList1.get(i).setWage(wage);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("ten khong ton tai");

                    }

                }break;
                case "12":
                    furamaController.displayMainMenu();
                    break;
                default:
                    System.out.println("vui long nhap lua hon tu 1 => 12");

            }
            try {
                dataEmployee.writeEmployee(employeeList1);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }

    public void remove() {
        List<Employee> employeeList1;
        try {
            employeeList1 = dataEmployee.readEmployee();
            System.out.println("nhap ma nhan vien");
            int codeEmployee = Integer.parseInt(scanner.nextLine());
            if (employeeList1.isEmpty()) {
                System.out.println("khong co nhan vien");
            } else {
                for (int i=0; i<employeeList1.size();i++) {
                    if (codeEmployee==employeeList1.get(i).getEmployeeCode()) {
                        employeeList1.remove(i);
                    }
                }
            }
            dataEmployee.writeEmployee(employeeList1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
Footer
        © 2023 GitHub, Inc.
        Footer navigation
        Terms
        Privacy
        Security
        Status
        Docs
        Contact GitHub
        Pricing
        API
        Training
        Blog
        About
        modul___2/EmployeeServiceImpl.java at main · minhnguyen0910/modul___2