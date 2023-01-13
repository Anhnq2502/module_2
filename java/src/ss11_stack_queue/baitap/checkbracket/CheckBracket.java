package ss11_stack_queue.baitap.checkbracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức toán học cần kiểm tra: ");
        String expression = scanner.nextLine();
        String[] expressionArr = expression.split("");
        boolean flag = true;
        for (int i = 0; i < expressionArr.length; i++) {
            if (expressionArr[i].equals("(")) {
                bStack.push(expressionArr[i]);
            }
            if (expressionArr[i].equals(")")) {
                if (bStack.isEmpty()) {
                    flag = false;
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (flag && bStack.isEmpty()) {
            System.out.println("Well");
        } else System.out.println("Not well ");

    }
}
