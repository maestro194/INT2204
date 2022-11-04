public class Point {
    private double pointX;
    private double pointY;

    /**
     * constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point a) {
        return Math.sqrt(Math.abs(a.pointX - this.pointX) * Math.abs(a.pointX - this.pointX)
             + Math.abs(a.pointY - this.pointY) * Math.abs(a.pointY - this.pointY));
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        if (Double.compare(point.pointX, pointX) != 0) {
            return false;
        }

        return Double.compare(point.pointY, pointY) == 0;
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + getPointX() + "," + getPointY() + ")";
    }
}
