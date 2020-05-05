package com.dam.ejemplo;

public class uso_baraja {

    public static void main (String [] args){

        baraja baraja = new baraja(1);

        System.out.println(baraja.barajar());

        System.out.println(baraja.numeroCartasRestantes());
    }
}
