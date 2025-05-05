public class Line implements ILine{
    private IPoint start;
    private IPoint end;

    public Line(IPoint start, IPoint end){
        this.end = end;
        this.start = start;
    }

    @Override
    public IPoint getStartPoint() {
        return start;
    }

    @Override
    public IPoint getEndPoint() {
        return end;
    }

    @Override
    public void setStartPoint(IPoint point) {
        this.start =start;
    }

    @Override
    public void setEndPoint(IPoint point) {
        this.end = end;
    }

    @Override
    public double length() {
        return start.distance(end);
    }

    public static ILine create(IPoint start,IPoint end){
        return new Line(start,end);
    }
}