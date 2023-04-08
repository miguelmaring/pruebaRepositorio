package Dominio;

/**
 * @author miguel.angel.marin.gonzalez
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class FacilTest {
    Facil facil = new Facil();
    @Test
    public void isRepetirColor(){
        assertTrue(facil.isRepetirColor());
    }
    @Test
    public void numIntentos(){
        assertEquals(10,facil.getNumeroIntentos());
    }
    @Test
    public void tamTablero(){
        assertEquals(10,facil.getTamTablero());
    }
    @Test
    public void numPistas(){
        assertEquals(5,facil.getNumeroPistas());
    }
}