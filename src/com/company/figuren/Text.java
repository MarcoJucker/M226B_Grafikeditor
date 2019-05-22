package com.company.figuren;

import com.company.factory.FigureType;

import java.awt.*;

public class Text extends Figure {

    private String value;

    public Text(Point x, Point y, String value, Color farbe){
        super(x, y, FigureType.TEXT, farbe);
        this.value = value;
        Label label = new Label();
        label.setText(value);
    }

    @Override
    public void zeichne(Graphics g) {
        g.setColor(this.getFarbe());
        g.drawString(this.getValue(), 10, 10);
    }

    public String getValue() {
        return value;
    }
}

