public interface ISize {


    float getWidth();
    float getHeight();

    void setWidth(float width);
    void setHeight(float height);

    //--[ factory ]-------------------------
    static ISize create (float width,float height){
        return new Size(width,height);
    }
}