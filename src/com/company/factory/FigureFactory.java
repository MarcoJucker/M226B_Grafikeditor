package com.company.factory;

import com.company.figuren.Figure;
import com.company.figuren.Kreis;
import com.company.figuren.Linie;
import com.company.figuren.Rechteck;

import java.awt.*;

public class FigureFactory {

    public Figure create(FigureType type, Point x, Point y) {
        if (type == FigureType.CIRCLE) {
            return new Kreis(x, y, Color.BLUE);
        }
        if (type == FigureType.LINE) {
            return new Linie(x, y, Color.CYAN);
        }
        if (type == FigureType.RECTANGLE) {
            return new Rechteck(x, y, Color.GREEN);
        }
        return null;
    }
}
