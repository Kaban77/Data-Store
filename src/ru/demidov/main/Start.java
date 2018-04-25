package ru.demidov.main;

import ru.demidov.objects.TableImpl;

public class Start {

    public static void main(String[] args) {
        var table = new TableImpl(10, 10);

        try {
            System.out.println(table.put(1, 1, "TEST"));
            System.out.println(table.put(1, 1, "TEST2"));

            System.out.println(table.get(2, 1));
            System.out.println(table.get(1, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
