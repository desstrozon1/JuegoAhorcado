/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ahorcado;

/**
 *
 * @author desst
 */
public class Letras {
    
    public static void erroresLetra(int errores, String cadena) {
        if (errores == 7) {
            //errores es igual a 7?
            System.out.println("Juego terminado, has perdido, la palabra correcta era: " + cadena);
        } else {
            System.out.println("Enhorabuena. Juego terminado");
        }
    }

    public static boolean aciertosLetras(String cadenaAciertos, String cadena) {
        if (cadenaAciertos.equals(cadena)) {
            return true;
        }
        return false;
    }

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
