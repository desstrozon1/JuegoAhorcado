/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_ahorcado;

import java.util.Random;

/**
 * Clase Ahorcado que representa el juego del ahorcado.
 *
 * <p>
 * El juego consiste en adivinar una palabra oculta seleccionada al azar de un
 * conjunto predefinido de palabras. El jugador debe ingresar letras para
 * intentar descubrir la palabra antes de cometer un número máximo de errores
 * permitidos.
 *
 * <p>
 * La clase proporciona métodos para rellenar los caracteres de la palabra
 * oculta, obtener y establecer la palabra a adivinar, y generar una
 * representación en forma de cadena del estado del juego.
 *
 * <p>
 * Para jugar al ahorcado, se deben crear instancias de esta clase y llamar a
 * sus métodos correspondientes.
 *
 * <p>
 * Ejemplo de uso:
 * <pre>{@code
 * Ahorcado juego = new Ahorcado();
 * String palabraOculta = juego.getAhorcado();
 * String cadenaAciertos = juego.rellenarCaracteres();
 * // ...
 * }</pre>
 *
 * @author desst Cano Martin Jesus Manuel
 * @version 2.0
 */
public class Ahorcado {

    /**
     * Número máximo de errores permitidos.
     */
    //Numero de errores permitido
    final int erroresPermitidos = 6;

    /**
     * Caracter utilizado para rellenar los espacios vacíos de la palabra
     * oculta.
     */
    final String caracterRelleno = "*";

    /**
     * Conjunto de palabras para el juego del ahorcado.
     */
    private String[] arrayAhorcado = {"materia", "tormenta", "silencio", "juego", "madrid", "paciencia"};

    /**
     * Índice aleatorio para seleccionar una palabra del conjunto.
     */
    private int numeroAleatorio = new Random().nextInt(arrayAhorcado.length - 1);

    /**
     * Palabra oculta seleccionada para el juego.
     */
    private String ahorcado = arrayAhorcado[numeroAleatorio];

    /**
     * Crea una instancia de la clase Ahorcado.
     */
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
    /**
     * Rellena los caracteres de la palabra oculta con el caracter de relleno.
     *
     * @return la cadena con los caracteres rellenos
     */
    public String rellenarCaracteres() {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < ahorcado.length(); i++) {
            cadena.append(caracterRelleno);
        }
        return cadena.toString();
    }

    /**
     * Obtiene el conjunto de palabras para el juego del ahorcado.
     *
     * @return el conjunto de palabras
     */
    public String[] getArrayAhorcado() {
        return arrayAhorcado;
    }

    /**
     * Establece el conjunto de palabras para el juego del ahorcado.
     *
     * @param arrayAhorcado el nuevo conjunto de palabras
     */
    public void setArrayAhorcado(String[] arrayAhorcado) {
        this.arrayAhorcado = arrayAhorcado;
    }

    /**
     * Obtiene la palabra oculta seleccionada para el juego.
     *
     * @return la palabra oculta
     */
    public String getAhorcado() {
        return ahorcado;
    }

    /**
     * Establece la palabra oculta para el juego.
     *
     * @param ahorcado la nueva palabra oculta
     */
    public void setAhorcado(String ahorcado) {
        this.ahorcado = ahorcado;
    }

    /**
     * Obtiene el índice aleatorio utilizado para seleccionar una palabra del
     * conjunto.
     *
     * @return el índice aleatorio
     */
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    /**
     * Establece el índice aleatorio utilizado para seleccionar una palabra del
     * conjunto.
     *
     * @param numeroAleatorio el nuevo índice aleatorio
     */
    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    /**
     * Genera una representación en forma de cadena del estado del juego.
     *
     * @return la representación en forma de cadena del estado del juego
     */
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
