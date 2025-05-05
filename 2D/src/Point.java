public class Point implements IPoint {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.y = y;
        this.x = x;
    }


    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setX(float value) {
        this.x = value;
    }

    @Override
    public void setY(float value) {
        this.y = value;
    }

    @Override
    public double distance(IPoint other) {
        float dx = this.x - other.getX();
        float dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}