package com.company.editor;

import com.company.display.Zeichnung;
import com.company.factory.FigureFactory;
import com.company.factory.FigureType;
import com.company.figuren.Figure;
import com.company.loader.FigureLoader;

import java.awt.*;

public class EditorController {

    private Zeichnung zeichnung = new Zeichnung();
    private EditorPanel editorPanel = new EditorPanel(this);
    private FigureFactory figureFactory = new FigureFactory();
    private FigureLoader figureLoader = new FigureLoader();
    private FigureType figurTyp;

    void drawFigures(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void clearWindow() {
        zeichnung.allesLoeschen();
        setFigureType(null);
    }

    public void createFigure(Point x, Point y) {
        Figure figure = figureFactory.create(figurTyp, x, y);
        zeichnung.add(figure);
    }

    public EditorPanel getEditorPanel() {
        return editorPanel;
    }

    public FigureType getFigureType() {
        return figurTyp;
    }

    public void setFigureType(FigureType figurTyp) {
        this.figurTyp = figurTyp;
    }

    public FigureLoader getFigureLoader() {
        return figureLoader;
    }

    public Zeichnung getZeichnung() {
        return zeichnung;
    }
}
