package ss4_class.baitap;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double x1 = sc.nextDouble();
        System.out.print("b = ");
        double x2 = sc.nextDouble();
        System.out.print("c = ");
        double x3 = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(x1, x2, x3);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        }
    }
}
