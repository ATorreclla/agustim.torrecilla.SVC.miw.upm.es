package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {

    private C22 c22Prueba;

    @BeforeEach
    void before(){
        c22Prueba = new C22();
    }

    @Test
    void testM1() {
        assertEquals("mA", c22Prueba.mA());
    }
}
