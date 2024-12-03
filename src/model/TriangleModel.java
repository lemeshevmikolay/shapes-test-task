package model;

public class TriangleModel extends _FigureModel {

    private Double side1;
    private Double side2;
    private Double side3;

    public TriangleModel(Double side1, Double side2, Double side3, String colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = colour;
    }

    @Override
    public String print() {
        return "Фігура: квадрат, периметр: " + getPerimeter()
                + " од., площа: " + getArea()
                + " кв. од., довжина першої сторони: " + side1
                + " од., довжина другої сторони: " + side2
                + " од., довжина третьої сторони: " + side3
                + " од., колір: " + colour;
    }

    @Override
    protected Double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    protected Double getPerimeter() {
        return side1 + side2 + side3;
    }
}
