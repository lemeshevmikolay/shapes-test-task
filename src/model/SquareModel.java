package model;

public class SquareModel extends _FigureModel {
    private Double side;

    public SquareModel(Double side, String colour) {
        this.side = side;
        this.colour = colour;
    }

    @Override
    public String print() {
        return "Фігура: квадрат, периметр: " + getPerimeter()
                + " од., площа: " + getArea()
                + " кв. од., довжина сторони: " + side
                + " од., колір: " + colour;
    }

    @Override
    protected Double getArea() {
        return side * side;
    }

    @Override
    protected Double getPerimeter() {
        return 4 * side;
    }
}
