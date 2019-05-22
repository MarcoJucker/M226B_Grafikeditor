package com.company.editor;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuBar extends JMenuBar {

    public MenuBar(JFrame frame, EditorController controller) {
        List<JMenuItem> menuItems = new ArrayList<>();
        menuItems.add(createMenuItem("Importieren", e -> controller.getFigureLoader().importZeichnung(controller)));
        menuItems.add(createMenuItem("Exportieren", e -> controller.getFigureLoader().exportZeichnung(frame, controller.getZeichnung())));
        menuItems.add(createMenuItem("Exit", e -> System.exit(0)));
        super.add(createBar(Collections.singletonList(createMenu("Datei", menuItems))));
    }

    private JMenuBar createBar(List<JMenu> menus) {
        JMenuBar menuBar = new JMenuBar();
        for (JMenu menu : menus) {
            menuBar.add(menu);
        }
        return menuBar;
    }

    private JMenu createMenu(String name, List<JMenuItem> menuItems) {
        JMenu menu = new JMenu(name);
        int index = 1;
        for (JMenuItem menuItem : menuItems) {
            if (menuItems.size() == index) {
                menu.addSeparator();
            }
            menu.add(menuItem);
            index++;
        }
        return menu;
    }

    private JMenuItem createMenuItem(String name, ActionListener actionListener) {
        JMenuItem menuItem = new JMenuItem(name);
        menuItem.addActionListener(actionListener);
        return menuItem;
    }
}
