public class Point2D {
    private float x;
    private float y;

    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] {x, y};
    }
    public String toString() {
        return " x = " + x + ", y = " + y;
    }
}
