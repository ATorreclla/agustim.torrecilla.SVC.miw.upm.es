package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C31Test {

    private C31 c31Prueba;

    @BeforeEach
    void before(){
        c31Prueba = new C31();
    }

    @Test
    void testM1() {
        assertEquals("m1", c31Prueba.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", c31Prueba.m2());
    }
}
