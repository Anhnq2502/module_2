package ss3_array.baitap;

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        n = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
