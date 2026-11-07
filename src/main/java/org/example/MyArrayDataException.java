package org.example;

public class MyArrayDataException extends RuntimeException {
    private int row;
    private int column;

    public MyArrayDataException(String message) {
        super(message);
        this.row = row;
        this.column = column;
    }

    public int getRow() { return row; }
    public int getColumn() { return column; }
}