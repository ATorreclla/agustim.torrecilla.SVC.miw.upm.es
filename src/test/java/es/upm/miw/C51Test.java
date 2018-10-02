package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C51Test {

    private C51 c51Prueba;

    @BeforeEach
    void before(){
        c51Prueba = new C51();
    }

    @Test
    void testM1() {
        assertEquals("m1", c51Prueba.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", c51Prueba.m2());
    }


}
