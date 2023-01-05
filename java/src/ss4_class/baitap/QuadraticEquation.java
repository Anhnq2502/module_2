package ss4_class.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double x1, double x2, double x3) {
        this.a = x1;
        this.b = x2;
        this.c = x3;
    }

    double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }
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
        }
        else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm = " + quadraticEquation.getRoot1());
        }
        else {
            System.out.println("Phương trình có 2 nghiệm "+quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
        }
    }
}
