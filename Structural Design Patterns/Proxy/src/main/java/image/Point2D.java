package image;

public class Point2D
{
    private float x, y;

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "image.Point2D [x=" + x + ", y=" + y + "]";
    }

}