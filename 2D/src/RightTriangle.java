public class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, calculateHypotenuse(base, height));
        validateRightTriangle(base, height, hypotenuse);
    }

    private static double calculateHypotenuse(double base, double height) {
        return Math.sqrt(base * base + height * height);
    }

    // بررسی صحت مثلث قائم‌الزاویه
    private void validateRightTriangle(double a, double b, double c) {
        double tolerance = 0.0001;
        if (Math.abs(a*a + b*b - c*c) > tolerance) {
            throw new IllegalArgumentException("Not a valid right triangle.");
        }
    }
}