package com.company;

public class Rectangle extends Point{
    private int weigh;
    private int height;

    public Rectangle(int x, int y,int weigh,int height,String color) {
        super(x, y,color);
        this.weigh=weigh;
        this.height=height;
    }

    public String Graph()
    {
        String out;
        out = "Прямоугольник: x=" + getX() + ", y=" + getY() + ", w="+ this.weigh + ", h=" + this.height + ", Цвет: " + getColor();;
        return out;
    }

    public int getHeight() {
        return height;
    }

    public int getWeigh() {
        return weigh;
    }
}
