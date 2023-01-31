package ss11_stack_queue.baitap.count_occurrences;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        TreeMap<String, Integer> stringTree = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần đếm:");
        String stringNeedCount = scanner.nextLine();
        stringNeedCount = stringNeedCount.toLowerCase();
        String[] stringArr = stringNeedCount.split("");
        for (String word : stringArr) {
            if (!stringTree.containsKey(word)) {
                stringTree.put(word, 1);
            } else {
                int count = stringTree.get(word);
                stringTree.put(word, count + 1);
            }
        }
        System.out.println(stringTree);

    }
}