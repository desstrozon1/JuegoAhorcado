/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ahorcado;

/**
 * Clase Letras que contiene métodos relacionados con el juego del ahorcado.
 *
 * @author desst Cano Martin Jesus Manuel
 * @version 2.0
 */
public class Letras {

    /**
     * Constructor creado para la clase letras
     *
     *
     */
    public Letras() {
    }

    /**
     * Comprueba si el jugador ha alcanzado el número máximo de errores y
     * muestra el mensaje correspondiente.
     *
     * @param errores el número de errores cometidos por el jugador
     * @param cadena la palabra correcta que se estaba buscando
     * <code>errores permitidos son 7</code> La función para los errores
     * permitidos.
     *
     *
     */
    public static void erroresLetra(int errores, String cadena) {
        if (errores == 7) {
            //errores es igual a 7?
            System.out.println("Juego terminado, has perdido, la palabra correcta era: " + cadena);
        } else {
            System.out.println("Enhorabuena. Juego terminado");
        }
    }

    /**
     * Compruebo que una cadena es igual a la otra cadena
     *
     * @param cadenaAciertos la cadena del usuario
     * @param cadena la palabra correcta que se estaba buscando
     * @return retornamos true si las cadenas son iguales
     *
     * @see aciertosLetras(String cadenaAciertos, String cadena)
     */
    public static boolean aciertosLetras(String cadenaAciertos, String cadena) {
        if (cadenaAciertos.equals(cadena)) {
            return true;
        }
        return false;
    }

    /**
     * Busca una letra en la cadena objetivo y la coloca en la posición
     * correspondiente en la cadena de aciertos.
     *
     * @param cadena la cadena objetivo
     * @param letra la letra a buscar
     * @param caracteres el arreglo de caracteres que representa la cadena de
     * aciertos
     *
     * @see buscarLetra(String cadena, String letra, char[] caracteres)
     */
    public static void buscarLetra(String cadena, String letra, char[] caracteres) {
        //colocamos la letra acertada en la variable cadenaAciertos
        // buscamos la posición en la variable ahorcado
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra.charAt(0)) {
                caracteres[i] = letra.charAt(0);
            }
        }
        // colocamos la letra en la posición correcta de cadenaAciertos
    }

}
