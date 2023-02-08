package ss19_string_regex.baitap.validate_class_name;

import java.util.Scanner;

public class ValidateClassName {
    private static final String REGEX_CLASS_NAME = "^([CAP])\\d{4}([GHIKLM])$";

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên lớp: ");
            String name = scanner.nextLine();
            System.out.println(name.matches(REGEX_CLASS_NAME));
    }
}
