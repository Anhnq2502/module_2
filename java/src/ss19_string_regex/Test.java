package ss19_string_regex;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int min;
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
        for (int i = 0; i < array1.length; i++){
            if (array1[0] != -1){
                min = array1[0];
            }else {
                min = array1[1];
            }
            for (int j = 0; j < array1.length; j++){
                if (min - array1[j] > 0 ){
                    min = array1[j];
                }
            }
        }
    }


}
