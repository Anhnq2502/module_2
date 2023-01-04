package ss3_array.baitap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        int m;
        int n;
        int k;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        m = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của ma trận: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cột cần tính tổng: ");
        k = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == k) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng của cột đó là: " + sum);
    }
}

