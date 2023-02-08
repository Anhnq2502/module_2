package ss19_string_regex.baitap.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static final String REGEX_PHONE_NUMBER = "^(\\(\\d{2}\\))-(\\(0\\d{9}\\))$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại của bạn: ");
        String phoneNumber = scanner.nextLine();
        System.out.println(phoneNumber.matches(REGEX_PHONE_NUMBER));
    }
}
