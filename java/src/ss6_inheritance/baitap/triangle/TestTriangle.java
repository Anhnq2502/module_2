package ss6_inheritance.baitap.triangle;

import java.util.*;

public class TestTriangle {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle triagle = getTriagle();
        System.out.print("nhập màu: ");
        triagle.setColor(sc.nextLine());
        System.out.print("có muốn fill không Y/N: ");
        String option = sc.nextLine();
        switch (option) {
            case "y":
            case "Y":
                break;
            default:
                triagle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triagle);

    }

    private static Triangle getTriagle() {
        System.out.print("nhập 3 cạnh a,b,c: ");
        String input = sc.nextLine();
        if (!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("không hợp lệ");
            System.out.print("nhập 3 cạnh a,b,c: ");
            input = sc.nextLine();
        }
        String[] triagle = input.split(",");
        Triangle outTriagle = new Triangle(
                Double.parseDouble(triagle[0]),
                Double.parseDouble(triagle[1]),
                Double.parseDouble(triagle[2])
        );
        if (!outTriagle.isValid()) {
            System.out.println("tam giác không hợp lệ!");
            outTriagle = getTriagle();
        }
        return outTriagle;
    }
}
