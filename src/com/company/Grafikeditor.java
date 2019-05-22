package com.company;

import com.company.editor.EditorFrame;

public final class Grafikeditor {

    public static void main(String[] args) {
        new Grafikeditor();
    }

    private Grafikeditor() {
        new EditorFrame(800, 600);
    }
}
