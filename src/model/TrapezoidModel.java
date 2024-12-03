package model;

import java.util.Objects;

public class TrapezoidModel extends _FigureModel {

    private Double base1;
    private Double base2;
    private Double side1;
    private Double side2;

    public TrapezoidModel(Double base1, Double base2, Double side1, Double side2, String colour) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.colour = colour;
    }

    @Override
    public String print() {
        return "Фігура: трапеція, периметр: " + getPerimeter()
                + " од., площа: " + getArea()
                + " кв. од., довжина першої основи: " + base1
                + " од., довжина другої основи: " + base2
                + " од., довжина першої сторони: " + side1
                + " од., довжина другої сторони: " + side2
                + " од., довжина висоти: " + getHeight()
                + " од., колір: " + colour;
    }

    @Override
    protected Double getArea() {
        return ((base1 + base2) / 2) * getHeight();
    }

    @Override
    protected Double getPerimeter() {
        return base1 + base2 + side1 + side2;
    }

    private Double getHeight() {
        if (Objects.equals(base1, base2)) {
            throw new IllegalArgumentException("This is not a trapezoid; the bases cannot be equal.");
        }

        double numerator = 2 * Math.sqrt((-base1 + base2 + side1 + side2) * (base1 - base2 + side1 + side2)
                * (base1 - base2 - side1 + side2) * (base1 - base2 + side1 - side2));
        double denominator = Math.abs(base1 - base2);

        return numerator / denominator;
    }
}
