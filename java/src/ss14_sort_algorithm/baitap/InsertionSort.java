package ss14_sort_algorithm.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void inputArray(int[] array, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("array[ " + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int k = i;
            while (k > 0 && array[k - 1] > currentValue) {
                array[k] = array[k - 1];
                k--;
                System.out.println("Di chuyển phần tử: " + array[k]);
            }
            if (k != i) {
                System.out.println("Chèn phần tử: " + currentValue + " tại vị trí " + k);
                array[k] = currentValue;
            }
            System.out.println("Vòng lặp thứ: " + i);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        array = new int[n];
        inputArray(array, n);
        System.out.println("Mảng dữ liệu đầu vào: ");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("\nMảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));
    }
}
