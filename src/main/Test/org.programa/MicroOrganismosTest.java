package org.programa;


import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MicroOrganismosTest {
    //private int vidaMax=500;
    private MicroOrganismos micro = new MicroOrganismos("MicroDePrueba");

    @Test
    void TestIrOrgano(){
        int vida=micro.getVidas();
        micro.irLugar("boca");
        assertFalse(micro.getVidas()<vida);
    }
    @ParameterizedTest
    @ValueSource(strings={"boca","cerebro","cerebro","boca","estomago"})
    void TestIrLugares(String lugares){
        micro.setVidas(1);
        micro.irLugar(lugares);
        assertEquals(true,micro.estaVivo());
    }

    @RepeatedTest(10)
    void TestBajarVida(){
        micro.irLugar("higado");
        assertTrue(micro.estaVivo());
    }
}