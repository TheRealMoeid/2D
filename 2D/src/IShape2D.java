public interface IShape2D {

    IPoint getCenter();
    void setCenter(IPoint center);

    double getArea();
    double getPerimeter();

    ShapeType getType();

    double distance(IShape2D other);

    //--[ factory ]-------------------------

    static IShape2D create(ShapeType type, IPoint center, float param1, float param2){
        switch (type){
            case Circle: return new Cyrcle(center,param1);
            case Rect: return new Rect(center,param1,param2);
            case Square: return new Square(center,param1);
            default:return null;
        }
    }
}

enum ShapeType{
    Unknown, Circle, Rect, Square
}