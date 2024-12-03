package model;

public class CircleModel extends _FigureModel {
    private Double radius;

    public CircleModel(Double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public String print() {
        return "Фігура: коло, периметр: " + getPerimeter()
                + " од., площа: " + getArea()
                + " кв. од., радіус: " + radius
                + " од., колір: " + colour;
    }

    @Override
    protected Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected Double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
