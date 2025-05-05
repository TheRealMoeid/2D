public class Square extends Shape2D implements ISquare{
    private float size;

    public Square(IPoint center,float size){
        super(center);
        this.size = size;
    }


    @Override
    public float getSize() {
        return size;
    }

    @Override
    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return (size*size);
    }

    @Override
    public double getPerimeter() {
        return 4*size;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Square;
    }
}