package juego_ahorcado;

import juego_ahorcado.Letras;
import org.junit.Test;
import static org.junit.Assert.*;

public class LetrasIT {

    @Test
    public void testErroresLetra() {
        System.out.println("erroresLetra");
        int errores = 7;
        String cadena = "d";
        Letras.erroresLetra(errores, cadena);
    }

    @Test
    public void testAciertosLetras() {
        System.out.println("aciertosLetras");
        String cadenaAciertos = "a";
        String cadena = "a";
        boolean expResult = true;
        boolean result = Letras.aciertosLetras(cadenaAciertos, cadena);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscarLetra() {
        System.out.println("buscarLetra");
        String cadena = "hola";
        String letra = "o";
        char[] caracteres = new char[]{'_', '_', '_', '_'};
        Letras.buscarLetra(cadena, letra, caracteres);
        assertArrayEquals(new char[]{'_', 'o', '_', '_'}, caracteres);
    }

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
