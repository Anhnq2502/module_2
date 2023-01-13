package ss11_stack_queue.baitap.reverse_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử: ");
            array.push(scanner.nextInt());
        }
        Stack<Integer> arrayReverse = new Stack<>();
        while (!array.isEmpty()) {
            arrayReverse.push(array.pop());
        }
        for (int i : arrayReverse) {
            array.push(i);
        }
        System.out.println("Mảng đảo ngược là: " + array);
    }
}