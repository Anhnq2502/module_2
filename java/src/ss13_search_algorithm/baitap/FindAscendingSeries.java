package ss13_search_algorithm.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindAscendingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi");
        String myString = scanner.nextLine();
        LinkedList<Character> characterList = new LinkedList<>();
        for (int i = 0; i < myString.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(myString.charAt(i));
            for (int j = i + 1; j < myString.length(); j++) {
                if (myString.charAt(j) > list.getLast()) {
                    list.add(myString.charAt(j));
                }
            }
            if (list.size() > characterList.size()) {
                characterList.clear();
                characterList.addAll(list);
            }
            list.clear();
        }
        for (int i = 0; i < characterList.size(); i++) {
            System.out.print(characterList.get(i));
        }
    }
}
