package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE_NAME = "Square";
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", area: " + this.getArea() + " sq. units"
                + ", side: " + side + " units");
    }
}
