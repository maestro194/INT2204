import javax.swing.plaf.IconUIResource;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * default constructor.
     */
    public Shape() {

    }

    /**
     * String, boolean.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public double getArea() {};


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
