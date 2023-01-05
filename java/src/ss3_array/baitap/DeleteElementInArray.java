package ss3_array.baitap;

import java.util.*;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng = ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng     " + Arrays.toString(arr));
        System.out.print("Nhập phần tử bạn muốn xoá: ");
        int deleteElm = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < lengthArr; i++) {
            if (arr[i] == deleteElm) {
                for (int k = i; k < lengthArr - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[lengthArr - 1] = 0;
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Không tìm thấy phần tử !!");
        } else {
            System.out.println("Mảng mới  " + Arrays.toString(arr));
        }
    }
}
