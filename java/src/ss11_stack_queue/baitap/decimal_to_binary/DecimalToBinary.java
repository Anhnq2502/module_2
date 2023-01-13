package ss11_stack_queue.baitap.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập vào số thập phân: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\n Giá trị nhị phân của là: ");
        while (!(stack.empty())) {
            System.out.print(stack.pop());
        }
    }
}
