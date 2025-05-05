public class RightTriangle extends Shape2D implements ITriangle {

    private float base;
    private float height;

    public RightTriangle(IPoint center, float base, float height) {
        super(center);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getBase() {
        return base;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Unknown;
    }
}