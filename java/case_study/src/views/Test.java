package views;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <= n; i++){
            map.put(i,i*i);
        }
        System.out.println(map);
    }
}
