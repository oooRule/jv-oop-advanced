package core.basesyntax;

public class RightTriangle extends Color {

    private double firstLeg;
    private double secondLeg;

    RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + getColor());

    }
}
