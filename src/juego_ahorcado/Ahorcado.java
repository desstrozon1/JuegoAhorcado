/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_ahorcado;

import java.util.Random;

/**
 *
 * @author desst
 */
public class Ahorcado{

    //Numero de errores permitido
    final int erroresPermitidos = 6;
    final String caracterRelleno = "*";

    private String[] arrayAhorcado = {"materia", "tormenta", "silencio", "juego", "madrid", "paciencia"};
    private int numeroAleatorio = new Random().nextInt(arrayAhorcado.length - 1);
    private String ahorcado = arrayAhorcado[numeroAleatorio];

    public Ahorcado() {

    }

    /*   public String rellenarCaracteres() {

        String cadena = "";
        for (int i = 1; i <= ahorcado.length(); i++) {
            //cadena += caracter ;
            cadena = cadena + caracterRelleno;
        }
        //System.out.println("La cadena es:" + cadena);

        return cadena;
       
    }*/
    public String rellenarCaracteres() {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < ahorcado.length(); i++) {
            cadena.append(caracterRelleno);
        }
        return cadena.toString();
    }


    public String[] getArrayAhorcado() {
        return arrayAhorcado;
    }

   
    public void setArrayAhorcado(String[] arrayAhorcado) {
        this.arrayAhorcado = arrayAhorcado;
    }

   
    public String getAhorcado() {
        return ahorcado;
    }

   
    public void setAhorcado(String ahorcado) {
        this.ahorcado = ahorcado;
    }
   
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

   
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------Jugando al ahorcado------");
        sb.append("\n" + "Los errores Permitidos son: ").append(erroresPermitidos);
        sb.append("\n" + "El caracter relleno es: ").append(caracterRelleno);
        sb.append("\n" + "La cadena con la que hemos jugado es: ").append(ahorcado);
        return sb.toString();
    }
}
