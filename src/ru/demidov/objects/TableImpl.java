package ru.demidov.objects;

import ru.demidov.exceptions.InvalidIndexException;
import ru.demidov.interfaces.Table;

public class TableImpl implements Table {

    private int column;
    private int row;
    private String[][] data;

    public TableImpl(int row, int column) {
        this.column = column;
        this.row = row;
        data = new String[row][column];
    }

    @Override
    public String get(int column, int row) throws InvalidIndexException {
        if(row < 0 || row >= this.row || column < 0 || column >= this.column) {
            throw new InvalidIndexException("Invalid row number or column number");
        }
        if(column == 0) {
            return null;
        }
        return data[row][column - 1];
    }

    @Override
    public String put(int column, int row, String value) throws InvalidIndexException {
        if(row < 0 || row >= this.row || column < 0 || column >= this.column) {
            throw new InvalidIndexException("Invalid row number or column number");
        }
        data[row][column] = value;

        return data[row][column - 1];
    }
}
