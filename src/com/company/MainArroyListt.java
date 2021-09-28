package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainArroyListt {
    public static void main(String[] args) {

        List<String> Lista = new ArrayList<>();

        Lista.add("Cundinamarca");
        Lista.add("valle");
        Lista.add("Antioquia");

        System.out.println(Lista);

        Lista.add("Antioquia");
        System.out.println(Lista);

        Lista.remove(0);
        System.out.println(Lista);

        String departamento = Lista.get(1);
        System.out.println(departamento);

        int posicion = Lista.indexOf("Boyaca");
        System.out.println(posicion);

    }
}
