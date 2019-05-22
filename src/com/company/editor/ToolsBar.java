package com.company.editor;

import com.company.factory.FigureType;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ToolsBar extends JMenuBar {

    public ToolsBar(EditorController controller) {
        try {
            super.add(createImageButton("/images/delete.png", e -> controller.clearWindow()));
            super.add(createImageButton("/images/rectangle.png", e -> controller.setFigureType(FigureType.RECTANGLE)));
            super.add(createImageButton("/images/circle.png", e -> controller.setFigureType(FigureType.CIRCLE)));
            super.add(createImageButton("/images/line.png", e -> controller.setFigureType(FigureType.LINE)));
        } catch (IOException e) {
            System.out.println("Error: Bild(er) nicht gefunden");
        }
    }

    private JButton createImageButton(String imgSrc, ActionListener actionListener) throws IOException {
        JButton button = new JButton();
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setIcon(getScaledImage(imgSrc));
        button.addActionListener(actionListener);
        return button;
    }

    private ImageIcon getScaledImage(String imageSrc) throws IOException {
        ImageIcon imageIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream(imageSrc)));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }
}
