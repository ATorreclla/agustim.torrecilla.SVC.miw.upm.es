package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C21Test {

    private C21 c21Prueba;

    @BeforeEach
    void before(){
        c21Prueba = new C21();
    }

    @Test
    void testM1() {
        assertEquals("m1", c21Prueba.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", c21Prueba.m2());
    }
}
