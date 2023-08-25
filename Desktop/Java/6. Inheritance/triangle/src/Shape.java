public class Shape {
    private String color;
    public Shape() {

    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape with color "+getColor();
    }
}
