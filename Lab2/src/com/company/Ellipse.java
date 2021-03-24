package com.company;

public class Ellipse extends Rectangle{
    public Ellipse(int x, int y, int weigh, int height,String color) {
        super(x, y, weigh, height,color);
    }
    public String Graph()
    {
        String out;
        out = "Эллипс: x=" + getX() + ", y=" + getY() + ", h= "+ getHeight() + ", w= "+ getWeigh()+ ", цвет: " + getColor();;
        return out;
    }
}
