package com.company.factory;

public enum FigureType {

    RECTANGLE('r'),
    CIRCLE('k'),
    LINE('l'),
    TEXT('t');

    public char asChar() {
        return asChar;
    }

    private final char asChar;

    FigureType(char asChar) {
        this.asChar = asChar;
    }
}
