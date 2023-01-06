package ss6_inheritance.baitap;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        super();
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
