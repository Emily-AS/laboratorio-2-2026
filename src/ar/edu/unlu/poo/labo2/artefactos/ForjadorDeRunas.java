package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class ForjadorDeRunas implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        artefacto.incrementarPoder(15);
    }
}
