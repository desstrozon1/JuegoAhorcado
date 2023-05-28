package juegoAhorcado;

import juego_ahorcado.Letras;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la clase Letras.
 * 
 * <p>Esta clase contiene métodos de prueba para los métodos de la clase Letras.
 * Se utiliza el framework JUnit para realizar las pruebas.
 * 
 * <p>Para ejecutar las pruebas, se debe ejecutar esta clase como un programa Java.
 * 
 * <p>Ejemplo de uso:
 * <pre>{@code
 * Letras.erroresLetra(errores, cadena);
 * // ...
 * }</pre>
 * 
 * @see Letras
 * @author desst Cano Martin Jesus Manuel
 * @version 2.0
 */

public class LetrasIT {
    
    /**
     * Prueba del método erroresLetra() de la clase Letras.
     */
    @Test
    public void testErroresLetra() {
        System.out.println("erroresLetra");
        int errores = 7;
        String cadena = "d";
        Letras.erroresLetra(errores, cadena);
    }

    /**
     * Prueba del método aciertosLetras() de la clase Letras.
     */
    @Test
    public void testAciertosLetras() {
        System.out.println("aciertosLetras");
        String cadenaAciertos = "a";
        String cadena = "a";
        boolean expResult = true;
        boolean result = Letras.aciertosLetras(cadenaAciertos, cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método buscarLetra() de la clase Letras.
     */
    @Test
    public void testBuscarLetra() {
        System.out.println("buscarLetra");
        String cadena = "hola";
        String letra = "o";
        char[] caracteres = new char[]{'_', '_', '_', '_'};
        Letras.buscarLetra(cadena, letra, caracteres);
        assertArrayEquals(new char[]{'_', 'o', '_', '_'}, caracteres);
    }

    /**
     * Prueba del método buscarLetra() de la clase Letras cuando la letra no se encuentra en la cadena.
     */
    @Test
    public void testBuscarLetra_LetraNoEncontrada() {
        System.out.println("buscarLetra");
        String cadena = "hola";
        String letra = "z";
        char[] caracteres = new char[]{'_', '_', '_', '_'};
        Letras.buscarLetra(cadena, letra, caracteres);
        assertArrayEquals(new char[]{'_', '_', '_', '_'}, caracteres);
    }
}
