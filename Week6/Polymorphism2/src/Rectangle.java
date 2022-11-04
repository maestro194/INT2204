public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * default.
     */
    public Rectangle() {

    }

    /**
     * double, double.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * double, double, string, bool.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * add Point.
     */
    public Rectangle(Point point, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = point;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString()
                + ",width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) o;

        if (Math.abs(rectangle.width - width) > 0.001) {
            return false;
        }

        if (Math.abs(rectangle.length - length) > 0.001) {
            return false;
        }

        return topLeft.equals(rectangle.topLeft);
    }
}
