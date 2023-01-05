package ss3_array.baitap;

import java.util.Scanner;
import java.util.*;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng 2 chiều = ");
        int rowLengthArr = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột của mảng 2 chiều = ");
        int colLengthArr = Integer.parseInt(sc.nextLine());
        int[][] arr;
        arr = new int[rowLengthArr][colLengthArr];
        for (int i = 0; i < rowLengthArr; i++) {
            for (int j = 0; j < colLengthArr; j++) {
                System.out.println("Nhập phần tử thứ " + (j + 1) + " của hàng thứ " + (i + 1));
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowLengthArr; i++) {
            System.out.print("Row " + (i + 1));
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Bạn muốn tính tổng của cột nào ? ");
        int colOfUserInput = Integer.parseInt(sc.nextLine());
        int totalElmInCol = 0;
        if (colOfUserInput > 0 && colOfUserInput <= colLengthArr) {
            for (int i = 0; i < rowLengthArr; i++) {
                totalElmInCol += arr[i][colOfUserInput - 1];
            }
            System.out.println("Tổng " + colOfUserInput + " là: " + totalElmInCol);
        } else {
            System.out.println("Cột này không có.");
        }
    }
}


