package ss11_stack_queue.baitap.count_occurrences;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        TreeMap<String, Integer> strTree = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can dem:");
        String strNeedCount = scanner.nextLine();
        strNeedCount = strNeedCount.toLowerCase();
        String[] strArr = strNeedCount.split("");
        for (String word : strArr) {
            if (!strTree.containsKey(word)) {
                strTree.put(word, 1);
            } else {
                int count = strTree.get(word);
                strTree.put(word, count + 1);
            }
        }
        System.out.println(strTree);

    }
}