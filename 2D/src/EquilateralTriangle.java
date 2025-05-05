public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        validateEquilateral(side);
    }

    // بررسی صحت مثلث متساوی‌الاضلاع
    private void validateEquilateral(double side) {
        if (side != side || side != side) { // بررسی برابری تمام اضلاع
            throw new IllegalArgumentException("All sides must be equal.");
        }
    }
}