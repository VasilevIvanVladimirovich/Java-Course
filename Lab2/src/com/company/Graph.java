package com.company;

abstract class Graph {
    private String color;

    public Graph(String color){
        this.color=color;
    }

    public abstract String Graph();

    public String getColor() {
        return color;
    }
}
