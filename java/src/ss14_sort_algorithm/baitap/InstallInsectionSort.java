package ss14_sort_algorithm.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InstallInsectionSort {
    public static void inputArray(int[] array, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("array[ " + i + "]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static void insectionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentValue; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentValue;
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
        insectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
