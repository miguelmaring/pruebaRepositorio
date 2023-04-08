package Dominio;

/**
 * @author miguel.angel.marin.gonzalez
 */

public abstract class Dificultad {
    private boolean repetirColor;
    private int numeroIntentos;
    private int tamTablero;
    private int numeroPistas;

    //Constructora
    public Dificultad(boolean repetirColor, int numeroIntentos, int tamTablero, int numeroPistas){
        this.repetirColor = repetirColor;
        this.numeroIntentos = numeroIntentos;
        this.tamTablero = tamTablero;
        this.numeroPistas = numeroPistas;
    }

    //Getters
    public boolean isRepetirColor(){
        return repetirColor;
    }
    public int getNumeroIntentos(){
        return numeroIntentos;
    }
    public int getTamTablero(){
        return tamTablero;
    }
    public int getNumeroPistas(){
        return numeroPistas;
    }
}
