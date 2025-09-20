package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE_NAME = "Square";
    // Чи треба в кожному класі створювати одну і ту саму константу?
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", side: " + side);
    }
}
