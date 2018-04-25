package ru.demidov.objects;

import ru.demidov.exceptions.InvalidIndexException;
import ru.demidov.interfaces.Table;

import java.util.ArrayList;
import java.util.HashMap;

public class TableImpl implements Table {

    private int column;
    private int row;
    private HashMap<ArrayList<Integer>, String> data = new HashMap<ArrayList<Integer>, String>();

    public TableImpl(int row, int column) {
        this.column = column;
        this.row = row;
    }

    @Override
    public String get(int column, int row) throws InvalidIndexException {
        if(row < 0 || row >= this.row || column < 0 || column >= this.column) {
            throw new InvalidIndexException("Invalid row number or column number");
        }
        if(column == 0) {
            return null;
        }
        var key = new ArrayList<Integer>();
        key.add(0, row);
        key.add(1, column);

        return data.get(key);
    }

    @Override
    public String put(int column, int row, String value) throws InvalidIndexException {
        if(row < 0 || row >= this.row || column < 0 || column >= this.column) {
            throw new InvalidIndexException("Invalid row number or column number");
        }
        var key = new ArrayList<Integer>();
        key.add(0, row);
        key.add(1, column);

        String temp = data.get(key);
        data.put(key, value);

        return temp;
    }
}