package ss2.baitap;

import java.util.Scanner;

public class Geometries {
    public static void main(String[] args) {
        int height;
        int width;
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("width = ");
        width = Integer.parseInt(sc.nextLine());
        System.out.println("Hình chữ nhật");

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        sc.close();
        System.out.println("Hình tam giác");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
        System.out.println("Hình tam giác ngược");
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
        System.out.println("Hình tam giác cân");
        int k = 0;
        for (int i = 1; i <= height; ++i, k = 0) {
            for (int space = 1; space <= height - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }

}
