package com.company.figuren;

import com.company.factory.FigureType;

import java.awt.*;

public class Linie extends Figure {

    private int x;
    private int y;
    private int endX;
    private int endY;

    public Linie(Point x, Point y, Color farbe) {
        super(x, y, FigureType.LINE, farbe);
        this.x = (int) x.getX();
        this.y = (int) x.getY();
        this.endX = (int) y.getX();
        this.endY = (int) y.getY();
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        endX += deltaX;
        endY += deltaY;
    }

    @Override
    public void zeichne(Graphics g) {
        g.setColor(this.getFarbe());
        g.drawLine(x, y, endX, endY);
    }
}
