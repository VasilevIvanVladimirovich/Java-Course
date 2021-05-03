public class Circle extends Point{
    private int radius;

    public Circle(int x, int y,int radius,String color) {
        super(x, y,color);
        this.radius=radius;
    }
    public String Graph()
    {
        String out;
        out = "Круг: x=" + getX() + ", y=" + getY() + ", радиус="+ getRadius() + ", Цвет: " + getColor();
        return out;
    }

    public int getRadius() {
        return radius;
    }
}
