public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double equalSide, double base) {
        super(equalSide, equalSide, base);
        validateIsosceles(equalSide, base);
    }

    // بررسی صحت مثلث متساوی‌الساقین
    private void validateIsosceles(double equalSide, double base) {
        if (equalSide != equalSide) { // بررسی برابری دو ضلع
            throw new IllegalArgumentException("Equal sides must be the same.");
        }
    }
}