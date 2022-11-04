public class Square extends Rectangle {
    /**
     * default.
     */
    public Square() {

    }

    /**
     * side.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * double, string, bool.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * add Point.
     */
    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + super.topLeft.toString() + ",side="
                + getSide() + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
