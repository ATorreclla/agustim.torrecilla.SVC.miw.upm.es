package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {

    private C32 c32Prueba;

    @BeforeEach
    void before(){
        c32Prueba = new C32();
    }

    @Test
    void testMA() {
        assertEquals("mA", c32Prueba.mA());
    }
}
