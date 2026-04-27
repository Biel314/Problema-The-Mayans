package model;

import java.util.HashMap;
import java.util.Map;

public class Valores {
    public static final Map<Character, Integer> numerais = new HashMap<>();

    //Criando uma Hashmap para definir os valores dos simbolos
    static {
        numerais.put('*', 0);
        numerais.put('.', 1);
        numerais.put('-', 5);
    }

}