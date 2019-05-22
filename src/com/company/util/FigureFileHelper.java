package com.company.util;

import com.company.factory.FigureFactory;
import com.company.factory.FigureType;
import com.company.figuren.Figure;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class FigureFileHelper {

    public static List<String> parseFigures(String text) {
        String[] figuren = text.split("\r\n");
        return Arrays.asList(figuren);
    }

    public static String[] parseSemicol(String text) {
        return text.split(";");
    }

    public static String figureToString(Figure figure) {
        String semico = ";";
        String figurAsString = figure.getType().toString() + semico;
        figurAsString += figure.getX().getX() + semico;
        figurAsString += figure.getX().getY() + semico;
        figurAsString += figure.getY().getX() + semico;
        figurAsString += figure.getY().getY() + semico;
        figurAsString += figure.getFarbe();
        return figurAsString;
    }

    public static Figure stringToFigure(String figurAsString) {
        FigureFactory factory = new FigureFactory();
        String[] settings = parseSemicol(figurAsString);
        double aX = Double.valueOf(settings[1]);
        double aY = Double.valueOf(settings[2]);
        double bX = Double.valueOf(settings[3]);
        double bY = Double.valueOf(settings[4]);
        Point pointA = new Point((int) aX, (int) aY);
        Point pointB = new Point((int) bX, (int) bY);
        return factory.create(FigureType.valueOf(settings[0]), pointA, pointB);
    }
}
