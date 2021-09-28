package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        System.out.println("Datos Ordenados");

        List<String> lista = new ArrayList<>();
        lista.add("Cundinamarca");
        lista.add("Risaralda");
        lista.add("Atlantico");

        System.out.println("Representacion toString");
        System.out.println(lista);
        System.out.println("");

        System.out.println("ArroyList Iterator");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String valor = iterator.next();
            System.out.println(valor);
        }

        System.out.println("");
        System.out.println("ArroyList forEach");
        for (String valor : lista){
            System.out.println(valor);
        }
        System.out.println("");
        System.out.println("Java 8 method reference");
        lista.forEach(System.out::println);

    }
}
