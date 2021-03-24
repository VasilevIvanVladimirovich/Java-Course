package ru.novsu.povt.viv.graphics;

public class Background extends Graph{
    private String nameTexture;

    public Background(String color,String nameTexture)
    {
        super(color);
        this.nameTexture=nameTexture;
    }

    public String Graph() {
        String out;
        out = "Background: цвет= " + getColor() + ", текстура: " + nameTexture;
        return out;
    }
    public String getNameTexture() {
        return nameTexture;
    }
}
