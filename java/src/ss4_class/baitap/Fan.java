package ss4_class.baitap;

public class Fan {
    private static final int slow = 1;
    private static final int medium  = 2;
    private static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan() {

    }
    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.on = status;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (this.on == true) {
            return "Speed = " + this.speed + "|" +" Radius = " + this.radius + "|" +" Color = " + this.color + "| Fan is on";
        }
        else {
            return "Radius = " + this.radius + "|" +" Color = " + this.color + "| Fan is off";
        }
    }
    boolean getStatus() {
        return this.on;
    }
    void setStatus(boolean status) {
        this.on = status;
    }
    public static void main(String[] args) {
        Fan fan0 = new Fan();
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("Fan default: "+fan0.toString());
        System.out.println("Fan 1:       "+fan1.toString());
        System.out.println("Fan 2:       "+fan2.toString());
    }
}
