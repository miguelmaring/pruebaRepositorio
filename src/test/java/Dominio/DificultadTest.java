package Dominio;

/**
 * @author miguel.angel.marin.gonzalez
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class DificultadTest {
    @Test
    public void testFacil() {
        Facil facil = new Facil();
        assertTrue(facil.isRepetirColor());
        assertEquals(10, facil.getNumeroIntentos());
        assertEquals(10, facil.getTamTablero());
        assertEquals(5, facil.getNumeroPistas());
    }

    @Test
    public void testMedio() {
        Medio medio = new Medio();
        assertTrue(medio.isRepetirColor());
        assertEquals(7, medio.getNumeroIntentos());
        assertEquals(7, medio.getTamTablero());
        assertEquals(3, medio.getNumeroPistas());
    }

    @Test
    public void testDificil() {
        Dificil dificil = new Dificil();
        assertFalse(dificil.isRepetirColor());
        assertEquals(4, dificil.getNumeroIntentos());
        assertEquals(4, dificil.getTamTablero());
        assertEquals(1, dificil.getNumeroPistas());
    }
}