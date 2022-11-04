public class Circle extends Shape {
    protected double radius;
    protected Point center;

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
     * double, string, bool.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * add Point.
     */
    public Circle(Point point, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = point;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return super.pi * radius * radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return super.pi * 2 * radius;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius
                + ",color=" + super.color + ",filled=" + filled + "]";
    }

    /**
     * equals override.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Circle circle = (Circle) o;

        return (Math.abs(circle.radius - radius) <= 0.001)
            && (circle.center.equals(this.center));
    }
}
