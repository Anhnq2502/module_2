package ss3_array.baitap;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ":");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
