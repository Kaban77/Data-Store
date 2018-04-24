package ru.demidov.main;

import ru.demidov.interfaces.Table;
import ru.demidov.objects.TableImpl;

public class Start {

    public static void main(String[] args) {
        Table table = new TableImpl(10, 10);

        try {
            table.put(1, 1, "TEST");

            System.out.println(table.get(1, 11));
            System.out.println(table.get(0, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
