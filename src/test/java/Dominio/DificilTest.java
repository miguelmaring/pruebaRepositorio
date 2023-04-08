package Dominio;

/**
 * @author miguel.angel.marin.gonzalez
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class DificilTest {
    Dificil dificil = new Dificil();
    @Test
    public void isRepetirColor(){
        assertFalse(dificil.isRepetirColor());
    }
    @Test
    public void numIntentos(){
        assertEquals(4,dificil.getNumeroIntentos());
    }
    @Test
    public void tamTablero(){
        assertEquals(4,dificil.getTamTablero());
    }
    @Test
    public void numPistas(){
        assertEquals(1,dificil.getNumeroPistas());
    }
}