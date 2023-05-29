/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_ahorcado;

import java.util.Scanner;
import static juego_ahorcado.Letras.aciertosLetras;
import static juego_ahorcado.Letras.buscarLetra;
import static juego_ahorcado.Letras.erroresLetra;

/**
 * Clase Principal que representa la clase principal del juego ahorcado.
 * Extiende la clase Letras para utilizar sus métodos.
 
 * @author desst Cano Martin Jesus Manuel
 * @version 2.0
 */
/**
 **<ul>
 * <li>Juego del Ahorcado</li>
 * <li>Tiene que adivinar la letra oculta escogida al azar</li>
 * <li>Tienes 7 oportunidades para adivinar la letra oculta</li>
 * <li>Si fallas los 7 intentos tendras que volver a empezar y será otra palabra distinta</li>
 * </ul> 
 */
public class Principal extends Letras {

    
    /**
     * Constructor de la clase principal.
     * 
     * @see Principal principal de la clase
     */
    public Principal() {
    }
    
    /**
     * Método principal que inicia el juego del ahorcado.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ahorcado clase_Ahorcado = new Ahorcado();
        //Numero de errores acomulados
        int errores = 0;
        // Declaramos la letra que nos van a pedir
        String letra = "";
        //declaramos una cadena con los ----
        String cadenaAciertos = clase_Ahorcado.rellenarCaracteres();
        char[] caracteres = cadenaAciertos.toCharArray();
        String cadena = clase_Ahorcado.getAhorcado();

        //Pedimos las distintas letras
        while (errores <= clase_Ahorcado.erroresPermitidos) {
            //mientras que errores acomulados sean menor o igual que 6 se le irá pidiendo cosas
            System.out.println("Introduzca una letra:");
            letra = scanner.next().toLowerCase();
            // comprobar que la letra no haya sido introducida antes

            // preguntamos si la cadena contiene la letra introducida
            if (cadena.contains(letra)) {
                buscarLetra(cadena, letra, caracteres);

                cadenaAciertos = String.valueOf(caracteres);
                //mostramos la variable cadenaAciertos para que vea que letras tiene acertadas
                System.out.println(cadenaAciertos);
                if (aciertosLetras(cadenaAciertos, cadena)) {
                    break;
                }
            } else { // ha fallado
                // aumentamos los errores en 1
                errores++;
                System.out.println("Esa letra no es correcta, llevas: " + errores + " errores.");

            }
        }
        erroresLetra(errores, cadena);
        System.out.print(clase_Ahorcado.toString());
    }

}
