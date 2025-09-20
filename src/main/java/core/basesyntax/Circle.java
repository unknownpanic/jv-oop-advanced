package core.basesyntax;

public class Circle extends Figure {
    private static final String FIGURE_NAME = "Circle";
    private double circumFerence;

    public Circle(String color, double circumFerence) {
        super(color);
        this.circumFerence = circumFerence;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", circumFerence: " + circumFerence);
    }
}
