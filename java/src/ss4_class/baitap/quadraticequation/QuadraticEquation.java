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

}
