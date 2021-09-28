package com.company;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {

        Map<String, String>  mapa = new HashMap<>();

        mapa.put("Cundinamarca","bogota");
        mapa.put("Valle","cali");
        mapa.put("Antioquia","Medellin");
       System.out.println(mapa);

        mapa.put("Boyaca","Tunja");
        System.out.println(mapa);

        String capital = mapa.get("Valle");
        System.out.println(capital);

        mapa.remove("Valle");
    }
}
