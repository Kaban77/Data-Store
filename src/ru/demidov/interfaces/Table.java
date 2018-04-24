package ru.demidov.interfaces;

public interface Table {

    public String put(int column, int row, String value) throws Exception;

    public String get(int column, int row) throws Exception;
}
