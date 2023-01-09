package ss6_inheritance.baitap.pointMove;

public class Move {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        Point p2 = new Point();
        System.out.println(p2);

        p1.setX(3);
        p2.setY(4);
        System.out.println(p1);
        System.out.println(p1.getX());
        System.out.println(p2.getY());

        MovablePoint movablePoint = new MovablePoint(11, 12);
        System.out.println(movablePoint);
        movablePoint.setxSpeed(21);
        movablePoint.setySpeed(22);
        System.out.println(movablePoint);
        System.out.println(movablePoint.getxSpeed());
        System.out.println(movablePoint.getySpeed());
    }
}
