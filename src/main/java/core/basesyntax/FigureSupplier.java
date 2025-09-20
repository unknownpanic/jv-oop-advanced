package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final Figures[] figures = Figures.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);
        String nameOfFigure = figures[index].toString();
        double randomDoubleSpecific = random.nextDouble();
        String randomColor = colorSupplier.getRandomColor();

        switch (nameOfFigure) {
            case "Circle":
                return new Circle(randomColor, randomDoubleSpecific);
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(randomColor,
                        randomDoubleSpecific, randomDoubleSpecific, randomDoubleSpecific);
            case "Rectangle":
                return new Rectangle(randomColor, randomDoubleSpecific, randomDoubleSpecific);
            case "RightTriangle":
                return new RightTriangle(randomColor, randomDoubleSpecific, randomDoubleSpecific);
            case "Square":
                return new Square(randomColor, randomDoubleSpecific);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
