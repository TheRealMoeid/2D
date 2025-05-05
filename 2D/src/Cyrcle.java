public class Cyrcle extends Shape2D implements ICircle {
    private float radius;

    public Cyrcle(IPoint center , float radius){
        super(center);
        this.radius = radius;
    }

    @Override
    public float getRadius() {
        return radius;
    }

    @Override
    public void setRadius(float r) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*radius);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Circle;
    }
}