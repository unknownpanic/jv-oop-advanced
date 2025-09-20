package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "RightTriangle";
    private double hypotenuse;

    public RightTriangle(String color, double hypotenuse) {
        super(color);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", hypotenuse: " + hypotenuse);
    }
}
