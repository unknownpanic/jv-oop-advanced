package core.basesyntax;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "Rectangle";
    private double diagonal;

    public Rectangle(String color, double diagonal) {
        super(color);
        this.diagonal = diagonal;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", diagonal: " + diagonal);
    }
}
