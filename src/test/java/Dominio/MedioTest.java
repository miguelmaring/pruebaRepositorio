package Dominio;

/**
 * @author miguel.angel.marin.gonzalez
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class MedioTest {
    Medio medio = new Medio();
    @Test
    public void isRepetirColor(){
        assertTrue(medio.isRepetirColor());
    }
    @Test
    public void numIntentos(){
        assertEquals(7,medio.getNumeroIntentos());
    }
    @Test
    public void tamTablero(){
        assertEquals(7,medio.getTamTablero());
    }
    @Test
    public void numPistas(){
        assertEquals(3,medio.getNumeroPistas());
    }
}