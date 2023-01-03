package ss2.baitap;

import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int cout = 0;
        int i = 2;
        while (cout < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                cout++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
