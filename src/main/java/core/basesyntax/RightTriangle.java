package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "RightTriangle";
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", area: " + this.getArea() + " sq. units"
                + ", firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units");
    }
}
