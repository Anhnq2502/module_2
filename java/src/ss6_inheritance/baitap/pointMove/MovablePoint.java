package ss6_inheritance.baitap.pointMove;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;


    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "(" + this.xSpeed + "," + this.ySpeed + ")" + "speed: " + "(" + getxSpeed() + "," + getySpeed() + ")";
    }
}
