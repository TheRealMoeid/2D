public interface ILine {

    IPoint getStartPoint();
    IPoint getEndPoint();

    void setStartPoint(IPoint point);
    void setEndPoint(IPoint point);

    double length();

    //--[ factory ]-------------------------
    static ILine create(IPoint start,IPoint end){
        return new Line(start,end);
    }
}