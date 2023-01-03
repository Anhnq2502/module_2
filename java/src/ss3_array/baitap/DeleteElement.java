package ss3_array.baitap;

import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0);

        int[] array = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập số nguyên k: ");
        int k = Integer.parseInt(scanner.nextLine());

        for (c = i = 0; i < n; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }

        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
