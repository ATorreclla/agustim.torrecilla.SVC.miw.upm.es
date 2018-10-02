package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class C12Test {

    private C12 c12Prueba;

    @BeforeEach
    void before(){
        c12Prueba = new C12();
    }

    @Test
    void testM1() {
        assertEquals("mA", c12Prueba.mA());
    }
}
