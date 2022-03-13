package com.adriano.codigo_morse;

import java.util.*;

public class CodigoMorse {

    private final Map<Character,String> mapa = new HashMap<>();

    public CodigoMorse() {
        mapa.put('S',"...");
        mapa.put('O',"---");
    }

    public List<String> convertWordToMorse(String word) {
        List<String> result = new ArrayList<>();

        if (word == null)
            return result;

        for (int i = 0; i < word.length(); i++) {
            result.add(mapa.get(word.toUpperCase().charAt(i)));
        }

        return result;
    }

}
