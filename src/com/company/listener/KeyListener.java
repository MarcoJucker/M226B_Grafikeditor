package com.company.listener;

import com.company.editor.EditorController;
import com.company.factory.FigureType;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {

    private EditorController controller;

    public KeyListener(EditorController controller) {
        this.controller = controller;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();

        for (FigureType type : FigureType.values()) {
            if (key == type.asChar()) {
                controller.setFigureType(type);
            }
        }

        if (controller.getFigureType() == null) {
            System.out.println(key + " ist keine gültige Taste");
        }
    }
}
