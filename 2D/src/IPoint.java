public interface IPoint{

    public float getX();
    public float getY();
    public void setX(float value);
    public void setY(float value);

    public double distance(IPoint other);

    //--[ factory ]-------------------------
    static IPoint create (float x , float y){
        return new Point(x,y);
    }
}