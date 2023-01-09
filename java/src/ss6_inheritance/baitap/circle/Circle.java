package ss6_inheritance.baitap.circle;

public class Circle {
    private static double radius;
    private static String color;

    public Circle(double radius, String color) {
        Circle.radius = radius;
        Circle.color = color;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Circle.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
