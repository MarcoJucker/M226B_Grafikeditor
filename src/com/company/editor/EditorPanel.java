package com.company.editor;

import com.company.listener.KeyListener;
import com.company.listener.MouseListener;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public final class EditorPanel extends JPanel {

    private EditorController controller;

    public EditorPanel(EditorController controller) {
        this.controller = controller;
        addKeyListener(new KeyListener(controller));
        addMouseListener(new MouseListener(controller, this));
    }

    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die drawFigures()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        controller.drawFigures(g);
        this.repaint();
    }
}