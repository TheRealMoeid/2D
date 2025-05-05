public abstract class Triangle implements Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double a, double b, double c) {
        validateSides(a, b, c);
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    // بررسی صحت مثلث
    protected void validateSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be positive.");
        }
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException("Sides do not form a valid triangle.");
        }
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}