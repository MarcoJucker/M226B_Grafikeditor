package com.company.display;

import com.company.figuren.Figure;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {

    private List<Figure> figuren = new ArrayList<>();

    public void zeichneFiguren(Graphics g) {
        for (Figure f : figuren) {
            if (f != null) {
                f.zeichne(g);
            }
        }
    }

    /**
     * Fügt eine weitere Figure hinzu und l�st die Auffrischung des Fensterinhaltes aus.
     * @param figure Referenz auf das weitere Figure-Objekt.
     */
    public void add(Figure figure){
        figuren.add(figure);
    }

    public List<Figure> getFiguren() {
        return figuren;
    }

    /**
     * L�scht alle figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
    }
}
