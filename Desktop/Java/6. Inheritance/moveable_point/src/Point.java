import java.lang.reflect.Array;
import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

    }
    public float getX() {
        return this.x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] getXY = {x, y};
        return getXY;
    }
    @Override
    public String toString() {
        return "(x, y) = "+ Arrays.toString(getXY());
    }
}
