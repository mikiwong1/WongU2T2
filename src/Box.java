public class Box
{
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double side)
    {
        length = side;
        width = side;
        height = side;
    }

    public double volume()
    {
        return length * width * height;
    }

    public boolean anySideLongerThan(int side)
    {
        if (length > side || width > side || height > side)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printDimensions()
    {
        System.out.println("L = " + length + ", W = " + width + ", H = " + height);
    }
}
