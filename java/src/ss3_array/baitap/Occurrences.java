package ss3_array.baitap;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        String string;
        char characters;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        string = scanner.nextLine();
        System.out.println("Nhập vào ký tự: ");
        characters = scanner.next().charAt(0);


        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == characters) {
                count++;
            }
        }


        System.out.println("Số lần xuất hiện của ký tự " + characters + " trong chuỗi " + string + " = " + count);
    }
}
