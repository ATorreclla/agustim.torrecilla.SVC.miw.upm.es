package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C52Test {

    private C52 c52Prueba;

    @BeforeEach
    void before(){
        c52Prueba = new C52();
    }

    @Test
    void testM1() {
        assertEquals("mA", c52Prueba.mA());
    }
}
