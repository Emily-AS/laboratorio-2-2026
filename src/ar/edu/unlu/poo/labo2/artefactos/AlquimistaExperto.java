package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class AlquimistaExperto implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
    if (artefacto.getNivelDePoder()>80){
        artefacto.limitarPoderMaximo(100);
    } else if (artefacto.getNivelDePoder()<=80) {
        artefacto.incrementarPoder(20);
    }
    }
}
