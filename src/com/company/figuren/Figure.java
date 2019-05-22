package com.company.figuren;

import com.company.factory.FigureType;

import java.awt.*;

public abstract class Figure {

    private Point x;
    private Point y;
    private Color farbe;
    private FigureType type;

    public Figure(Point x, Point y, FigureType type, Color farbe){
        this.x = x;
        this.y = y;
        this.type = type;
        this.farbe = farbe;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    public FigureType getType() {
        return type;
    }

    public void move(int deltaX, int deltaY){
        //x += deltaX;
        //y += deltaY;
    }

    public abstract void zeichne(Graphics g);
}
