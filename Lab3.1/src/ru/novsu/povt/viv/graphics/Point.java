package ru.novsu.povt.viv.graphics;

public class Point extends Graph{
    private int x;
    private int y;

    public Point(int x,int y,String color)
    {
        super(color);
        this.x=x;
        this.y=y;
    }
    public String Graph()
    {
        String out;
        out = "Точка: x=" + this.x + ", y=" + this.y;
        return out;
    }
    public void moveTo(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void move(int dx,int dy)
    {
        this.x=dx;
        this.y=dy;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
