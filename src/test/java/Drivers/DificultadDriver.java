package Drivers;

/**
 * @author miguel.angel.marin.gonzalez
 */

import Dominio.*;

public class DificultadDriver {
    public static void main(String[] args) {
        Facil facil = new Facil();
        Medio medio = new Medio();
        Dificil dificil = new Dificil();

        System.out.println("Hacemos Driver de la Clase Dificultad.\n" +
                "Primeramente instanciamos las 3 subclases; Facil, Medio y Dificil.");

        System.out.println(("\n------Driver de dificultad FACIL------\n"));

        System.out.println("Dificultad Fácil:");
        System.out.println("Repetir color = " + facil.isRepetirColor());
        System.out.println("Número de intentos = " + facil.getNumeroIntentos());
        System.out.println("Tamaño del tablero = " + facil.getTamTablero());
        System.out.println(("Numero de pistas = " + facil.getNumeroPistas()));
        System.out.println(("Numero de pistas = " + facil.getNumeroPistas()));

        System.out.println(("\n------Driver de dificultad MEDIO------\n"));

        System.out.println("Dificultad Media:");
        System.out.println("Repetir color = " + medio.isRepetirColor());
        System.out.println("Número de intentos = " + medio.getNumeroIntentos());
        System.out.println("Tamaño del tablero = " + medio.getTamTablero());
        System.out.println(("Numero de pistas = " + medio.getNumeroPistas()));

        System.out.println(("\n------Driver de dificultad DIFICIL------\n"));


        System.out.println("Creando una nueva branca y hacer merge");

        System.out.println("Dificultad Dificil:");
        System.out.println("Repetir color = " + dificil.isRepetirColor());
        System.out.println("Número de intentos = " + dificil.getNumeroIntentos());
        System.out.println("Tamaño del tablero = " + dificil.getTamTablero());
        System.out.println(("Numero de pistas = " + dificil.getNumeroPistas()));

        System.out.println(("\nCon esto completamos el driver de Dificultad\n"));


        System.out.println("ahora añado linea en otra branca");
    }

}
