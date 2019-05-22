package com.company.editor;

@SuppressWarnings("serial")
public final class EditorFrame extends JFrame {

    public EditorFrame(int breite, int hoehe) {
        createPanels();
        frameSettings();
        frameCenter(breite, hoehe);
        super.setTitle("Grafikeditor");
    }

    private void createPanels() {
        EditorController controller = new EditorController();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());


        mainPanel.add(controller.getEditorPanel(), BorderLayout.CENTER);
        JPanel menuBar = new JPanel();
        menuBar.setLayout(new BorderLayout());
        menuBar.add(new MenuBar(this, controller), BorderLayout.NORTH);
        menuBar.add(new ToolsBar(controller), BorderLayout.SOUTH);
        mainPanel.add(menuBar, BorderLayout.NORTH);
        // TODO: Footer
        super.setContentPane(mainPanel);
    }

    private void frameCenter(int breite, int hoehe) {
        Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle fensterAusschnitt = new Rectangle();
        fensterAusschnitt.width = breite;
        fensterAusschnitt.height = hoehe;
        fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
        fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
        setBounds(fensterAusschnitt);
    }

    private void frameSettings() {
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
