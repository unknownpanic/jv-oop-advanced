package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "IsoscelesTrapezoid";
    private double height;

    public IsoscelesTrapezoid(String color, double height) {
        super(color);
        this.height = height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", height: " + height);
    }
}
