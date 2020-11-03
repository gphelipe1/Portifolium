package com.ufma.portifolium.utils;

import com.ufma.portifolium.entities.Tecnologia;

public class TecnologiaFactory {
    public static Tecnologia buildTecnologia() {
        Tecnologia tecnologia = Tecnologia.builder()
                                            .descricao("Uma tecnologia qualquer")
                                            .build();

        return tecnologia;
    }
}