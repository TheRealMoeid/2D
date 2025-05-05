public class Size implements ISize{
    private float width;
    private float height;

    public Size(float width,float height){
        this.height = height;
        this.width = width;
    }


    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height();
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    public static ISize create(float width,float height){
        return new Size(width,height);
    }
}