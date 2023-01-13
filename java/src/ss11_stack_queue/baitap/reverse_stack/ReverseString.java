package ss11_stack_queue.baitap.reverse_stack;


import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> string = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string1 = scanner.nextLine();
        String[] stringArr = string1.split(" ");
        for (int i = 0; i < stringArr.length; i++) {
            string.push(stringArr[i]);
        }
        String strings = " ";
        for (int i = 0; i < stringArr.length; i++) {
            strings += string.pop();
        }
        System.out.println(strings);
    }
}