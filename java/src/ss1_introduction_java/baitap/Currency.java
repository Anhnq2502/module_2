package ss1_introduction_java.baitap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double Usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money USD");
        Usd = Integer.parseInt(scanner.nextLine());
        double Vnd = Usd*23000;
        System.out.println("Value VND: "+ Vnd + "VND");
    }
}
