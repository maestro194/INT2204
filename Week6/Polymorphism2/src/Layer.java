import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;
    private int size = 0;

    public Layer() {
        shapes = new ArrayList<Shape>();
    }

    /**
     * addShape.
     */
    public void addShape(Shape s) {
        shapes.add(s);
        size++;
    }

    /**
     * getInfo.
     */
    public String getInfo() {
        String str = "";
        str += "Layer of crazy shapes:\n";
        for (int i = 0; i < size; i++) {
            Shape tmp = shapes.get(i);
            str += tmp.toString() + "\n";
        }
        return str;
    }

    /**
     * removeCircles.
     */
    public void removeCircles() {
        for (int i = 0; i < size; i++) {
            Shape tmp = shapes.get(i);
            if (tmp instanceof Circle) {
                shapes.remove(i);
                i--;
                size--;
            }
        }
    }

    /**
     * removeDuplicates.
     */
    public void removeDuplicates() {
        for (int i = 0; i < size; i++) {
            Shape tmp = shapes.get(i);
            for (int j = i - 1; j >= 0; j--) {
                Shape anotherTmp = shapes.get(j);
                if (tmp.equals(anotherTmp)) {
                    shapes.remove(i);
                    i--;
                    size--;
                    break;
                }
            }
        }
    }

    /**
     * testing.
     */
    public static void main(String[] args) {
        Shape c1 = new Circle(new Point(10.0, 5.0), 8.0, "RED", true);
        Shape r1 = new Rectangle(new Point(10.0, 5.0), 8.0, 6.0, "RED", true);
        Shape c2 = new Circle(new Point(10.0, 5.0), 8.0, "RED", true);
        Shape s1 = new Square(new Point(10.0, 5.0), 8.0, "RED", true);

        Layer layer = new Layer();

        layer.addShape(c1);
        layer.addShape(r1);
        layer.addShape(c2);
        layer.addShape(s1);

        layer.getInfo();

        System.out.println("");
        layer.removeCircles();
        layer.getInfo();
    }
}
