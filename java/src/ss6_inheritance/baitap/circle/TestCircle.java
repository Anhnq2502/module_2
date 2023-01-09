package ss6_inheritance.baitap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.4, "red", 10);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolumer());
    }
}
