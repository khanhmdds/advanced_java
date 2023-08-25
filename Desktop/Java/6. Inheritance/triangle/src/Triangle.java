public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getP() {
        return getPerimeter()/2;
    }
    public double getArea() {
        return Math.sqrt(getP() * (getP() - side1) * (getP() - side2) * (getP() - side3));
    }
    @Override
    public String toString() {
        return "Perimeter = "+getPerimeter()+", Area = "+getArea();
    }
}
