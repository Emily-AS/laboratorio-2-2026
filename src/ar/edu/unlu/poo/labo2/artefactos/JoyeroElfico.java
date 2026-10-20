package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class JoyeroElfico implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
    if (artefacto.getNivelDePoder()<50){
    artefacto.duplicarPoder();
    }
    else if (artefacto.getNivelDePoder()>=50) {
        artefacto.incrementarPoderPorcentual(25);
        }
    }
}
