package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "IsoscelesTrapezoid";
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME
                + ", color: " + this.getColor()
                + ", area: " + this.getArea() + " sq. units"
                + ", firstBase: " + firstBase + " units"
                + ", seconfBase: " + secondBase + " units"
                + ", height: " + height + " units");
    }
}
