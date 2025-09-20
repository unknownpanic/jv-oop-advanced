package core.basesyntax;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "Circle";
    private double radius;

    public Circle(String color, double circumFerence) {
        super(color);
        this.radius = circumFerence;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", area: " + this.getArea()
                + ", radius: " + radius);
    }
}
