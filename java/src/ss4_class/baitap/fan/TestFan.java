package ss4_class.baitap;

public class TestFan {
    public static void main(String[] args) {
        Fan fan0 = new Fan();
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("Fan default: " + fan0);
        System.out.println("Fan 1:       " + fan1);
        System.out.println("Fan 2:       " + fan2);
    }
}
