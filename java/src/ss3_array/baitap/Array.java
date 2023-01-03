package ss3_array.baitap;

import java.util.Scanner;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng 1: ");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0);

        int[] array1 = new int[n];

        System.out.println("Nhập các phần tử cho mảng 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng 1: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        int m;
        do {
            System.out.println("Nhập vào số phần tử của mảng 2: ");
            m = Integer.parseInt(scanner.nextLine());
        } while (m <= 0);

        int[] array2 = new int[m];

        System.out.println("Nhập các phần tử cho mảng 2: ");
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng 2: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        int p = array1.length + array2.length;
        int[] result = new int[p];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
