package ss1_introduction_java.baitap;

import java.util.Scanner;

public class loi_chao {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
