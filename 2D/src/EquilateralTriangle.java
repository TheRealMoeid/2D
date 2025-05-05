public class EquilateralTriangle extends Shape2D implements ITriangle {

    private float side;

    public EquilateralTriangle(IPoint center, float side) {
        super(center);
        this.side = side;
    }

    @Override
    public float getBase() {
        return side;
    }

    @Override
    public float getHeight() {
        return (float) (Math.sqrt(3) / 2 * side);
    }

    @Override
    public void setBase(float base) {
        this.side = base;
    }

    @Override
    public void setHeight(float height) {
        // ignored: height is derived from side
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Unknown;
    }
}