package com.dam.ejemplo;

public class carta {

    private int numero;
    private int palo;

    //Constructor

    /*Sobrecarga de constrcutores
    * creaos varios constructores para poder
    * instanciar la clase*/

    public carta(int id){

        if (id>0 && id<=10){
            palo=1;
            numero=id;
        } else if (id>10 && id<=20){
            palo=2;
            numero=id-10;
        } else if (id>20 && id<=30){
            palo=3;
            numero=id-20;
        } else if (id>30 && id<=40){
            palo=4;
            numero=id-30;
        }
    }

    public carta(int numero, int palo) {

        this.numero = numero;
        this.palo = palo;
    }

    //getters y setteres

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public String getValorNumero(){

        switch (numero){
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "sota";
            case 9:
                return "caballo";
            case 10:
                return "rey";
            default:
                return "uno";
        }
    }

    public String getValorPalo(){

        switch (palo){
            case 1:
                return "oros";
            case 2:
                return "copas";
            case 3:
                return "espadas";
            case 4:
                return "bastos";
            default:
                return "oros";
        }
    }

    @Override
    public String toString() {
        return "carta{" + getValorNumero()+ " de " + getValorPalo()+ "}\n";
    }
}
