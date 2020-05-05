package com.dam.ejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class baraja {

    /*Baraja con las cartas, escogemos list
    * para poder redimensionar dinámicamente
    * asi podemos usarlo para 40 o 80 cartas y
    * añadir/eleminar cartas de forma más sencilla*/

    private List<carta> lista_cartas;

    //constructor

    public baraja() {

        lista_cartas = new ArrayList<>();
    }

    public baraja (int tipoBaraja){

        lista_cartas = new ArrayList<>();

        crearBaraja(tipoBaraja);
        System.out.println(lista_cartas.toString());
    }

    public baraja (int tipoBaraja, boolean barajar){

        lista_cartas = new ArrayList<>();

        crearBaraja(tipoBaraja);

        if(barajar){

            this.barajar();
        }
    }

    //

    public void crearBaraja (int tipo){

        for(int i = 1; i < 5; i ++){

            for(int e = 1; e < 11; e ++){

                /*Aquí invertimos el orden de (i,e) para poder crear
                * todos los números del mismo palo, de lo contrario crearímos
                * primero un 1 pero de los 4 palos distintos*/
                lista_cartas.add(new carta(e,i));
            }
        }

        //baraja de 80 cartas
        if(tipo == 2) {

            /*Aquí lo que hacemos es sumar las cartas anterios
            * el equivalente a un 2x*/
            lista_cartas.addAll(lista_cartas);
        }
    }

    public List<carta> barajar(){

        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        while(randomNumbers.size() < lista_cartas.size()) {

            int num = random.nextInt(lista_cartas.size());

            if(!randomNumbers.contains(num)){

                randomNumbers.add(num);
            }
        }

        List<carta> lista_temp = lista_cartas;
        //lista_cartas = null;

        lista_cartas = new ArrayList<>();

        //System.out.println(lista_temp.size());

        for(int i = 0; i < lista_temp.size(); i ++){

            int num = randomNumbers.get(i);
            lista_cartas.add(lista_temp.get(num));
        }

        return lista_cartas;
    }

    public carta robar(){

        if(!lista_cartas.isEmpty()){

            return lista_cartas.get(lista_cartas.size()-1);
        }

        return null;
    }

    public void insertarCartaFinal (carta carta){

        lista_cartas.add(carta);
    }

    public void insertarCartaFinal (int id){

        lista_cartas.add(new carta(id));
    }

    public void insertarCartaPrincipio (carta carta){

        lista_cartas.add(0,carta);
    }

    public void insertarCartaPrincipio (int id){

        lista_cartas.add(0,new carta(id));
    }

    //getters y setters

    public int numeroCartasRestantes(){

        return lista_cartas.size();
    }

    public boolean isEmpty(){

        return lista_cartas.isEmpty();
    }
}
