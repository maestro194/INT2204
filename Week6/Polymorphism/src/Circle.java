public class Circle extends Shape{
    protected double radius;

    /**
     * default.
     */
    public Circle() {

    }

    /**
     * double.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * double, String, boolean.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {

    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
