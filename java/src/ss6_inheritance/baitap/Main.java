package ss6_inheritance.baitap;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.4, "red", 10);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolumer());
    }
}
