public abstract class Shape2D implements IShape2D {
    protected IPoint center;

    public Shape2D(IPoint center) {
        this.center = center;
    }

    @Override
    public IPoint getCenter() {
        return center;
    }

    @Override
    public void setCenter(IPoint center) {
        this.center = center;
    }

    @Override
    public double distance(IShape2D other){
        return center.distance(other.getCenter());
    }
}