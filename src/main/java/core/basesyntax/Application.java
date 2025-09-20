package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int arrayLength = 4;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            if (i >= (arrayLength / 2)) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Figure figure : figures) {
            figure.toDraw();
        }
    }
}
