package ss6_inheritance.baitap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumer() {
        return super.getArea() * this.height;
    }
}
