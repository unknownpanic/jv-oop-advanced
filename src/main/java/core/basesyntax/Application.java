package core.basesyntax;

public class Application {
    private static final int ARRAY_FIGURE_LENGTH = 4;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_FIGURE_LENGTH];

        for (int i = 0; i < ARRAY_FIGURE_LENGTH; i++) {
            if (i >= (ARRAY_FIGURE_LENGTH / 2)) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].toDraw();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].toDraw();
            }
        }
    }
}
