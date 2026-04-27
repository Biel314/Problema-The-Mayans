package controller;

import model.Valores;

public class CtlConversor {

    public int decimal(String entrada) {

        int total = 0;
        int base = 20;

        String[] grupos = entrada.split(" ");

        //Laço para saber a posição
        for (int posicao = 0; posicao < grupos.length; posicao++) {
        	
            String grupo = grupos[grupos.length - 1 - posicao];
            int valorGrupo = 0;
            
            //Correções
            for (char simbolo : grupo.toCharArray()) {
                if (!Valores.numerais.containsKey(simbolo)) {
                    throw new IllegalArgumentException("Este simbolo não existe: " + simbolo);
                    
                }

                valorGrupo += Valores.numerais.get(simbolo);
            }

            if (valorGrupo > 19) {
                throw new IllegalArgumentException("Valor invalido (>19)");
                
            }
            total += valorGrupo * Math.pow(base, posicao);
        }

        return total;
    }
}