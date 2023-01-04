package ss3_array.baitap;

import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = Integer.parseInt(scanner.nextLine());

        int[][] array = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Ma trận vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
