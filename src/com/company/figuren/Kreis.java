package com.company.figuren;

import com.company.factory.FigureType;

import java.awt.*;

public class Kreis extends Figure {

    private Point beginPoint;
    private Point endPoint;

    public Kreis(Point x, Point y, Color farbe){
        super(x, y, FigureType.CIRCLE, farbe);
        beginPoint = x;
        endPoint = y;
    }

    @Override
    public void zeichne(Graphics g) {
        g.setColor(this.getFarbe());
        int x = (int) beginPoint.getX();
        int y = (int) beginPoint.getY();
        int width = (int) endPoint.getX() - (int) beginPoint.getX();
        int height = (int) endPoint.getY() - (int) beginPoint.getY();
        g.fillOval(x, y, width, height);
    }
}
