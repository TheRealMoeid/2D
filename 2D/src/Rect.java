public class Rect extends Shape2D implements IRect{
    private ISize size;

    public Rect(IPoint center, float x , float y){
        super(center);
        this.size= new Size(x,y);
    }


    @Override
    public ISize getSize() {
        return size;
    }

    @Override
    public void setSize(ISize size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return (2*(size.getWidth())+ size.getHeight());
    }

    @Override
    public double getPerimeter() {
        return (size.getHeight()* size.getWidth());
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Rect;
    }
}