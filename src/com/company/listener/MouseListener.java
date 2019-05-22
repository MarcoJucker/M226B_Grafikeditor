package com.company.listener;

import com.company.editor.EditorController;
import com.company.editor.EditorPanel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {

    private EditorController controller;
    private Point punkt;
    private EditorPanel panel;

    public MouseListener(EditorController controller, EditorPanel panel) {
        this.controller = controller;
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        punkt = e.getPoint();
        panel.repaint();
        panel.grabFocus();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        controller.createFigure(new Point(punkt), new Point(e.getX(), e.getY()));
        panel.repaint();
        panel.grabFocus();
    }
}
