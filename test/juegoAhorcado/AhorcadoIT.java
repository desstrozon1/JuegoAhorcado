package juegoAhorcado;

import juego_ahorcado.Ahorcado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba para la clase Ahorcado.
 *
 * <p>
 * Esta clase contiene métodos de prueba para los métodos de la clase Ahorcado.
 * Se utiliza el framework JUnit para realizar las pruebas.
 *
 * <p>
 * Para ejecutar las pruebas, se debe ejecutar esta clase como un programa Java.
 *
 * <p>
 * Ejemplo de uso:
 * <pre>{@code
 * Ahorcado ahorcado = new Ahorcado();
 * // ...
 * }</pre>
 *
 * @author desst Cano Martin Jesus Manuel
 * @version 2.0
 */
public class AhorcadoIT {

    /**
     * Constructor de la clase AhorcadoIT.
     */
    public AhorcadoIT() {
    }

    /**
     * Método que se ejecuta antes de todas las pruebas.
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Método que se ejecuta después de todas las pruebas.
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Método que se ejecuta antes de cada prueba.
     */
    @Before
    public void setUp() {
    }

    /**
     * Método que se ejecuta después de cada prueba.
     */
    @After
    public void tearDown() {
    }

    /**
     * Prueba del método rellenarCaracteres() de la clase Ahorcado.
     */
    @Test
    public void testRellenarCaracteres_0args() {
        System.out.println("rellenarCaracteres");
        Ahorcado ahorcado = new Ahorcado();
        String expResult = (ahorcado.getAhorcado());
        String result = ahorcado.rellenarCaracteres();
        assertEquals(expResult.length(), result.length());

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método getArrayAhorcado() de la clase Ahorcado.
     */
    @Test
    public void testGetArrayAhorcado() {
        System.out.println("getArrayAhorcado");
        Ahorcado ahorcado = new Ahorcado();
        String[] expResult = {"materia", "tormenta", "silencio", "juego", "madrid", "paciencia"};
        String[] result = ahorcado.getArrayAhorcado();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método setArrayAhorcado() de la clase Ahorcado.
     */
    @Test
    public void testSetArrayAhorcado() {
        System.out.println("setArrayAhorcado");
        String[] arrayAhorcado = {"nuevo1", "nuevo2", "nuevo3"};
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.setArrayAhorcado(arrayAhorcado);
        assertArrayEquals(arrayAhorcado, ahorcado.getArrayAhorcado());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método getNumeroAleatorio() de la clase Ahorcado.
     */
    @Test
    public void testGetNumeroAleatorio() {
        System.out.println("getNumeroAleatorio");
        Ahorcado ahorcado = new Ahorcado();
        int result = ahorcado.getNumeroAleatorio();
        assertTrue(result >= 0 && result < ahorcado.getArrayAhorcado().length);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método setNumeroAleatorio() de la clase Ahorcado.
     */
    @Test
    public void testSetNumeroAleatorio() {
        System.out.println("setNumeroAleatorio");
        int numeroAleatorio = 2;
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.setNumeroAleatorio(numeroAleatorio);
        assertEquals(numeroAleatorio, ahorcado.getNumeroAleatorio());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método getAhorcado() de la clase Ahorcado.
     */
    @Test
    public void testGetAhorcado() {
        System.out.println("getAhorcado");
        Ahorcado ahorcado = new Ahorcado();
        String ahorcadoString = ahorcado.getAhorcado();
        boolean bAhorcado = false;
        for (String word : ahorcado.getArrayAhorcado()) {
            if (word.equals(ahorcadoString)) {
                bAhorcado = true;
                break;
            }
        }
        assertTrue(bAhorcado);
    }
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");

    /**
     * Prueba del método setAhorcado() de la clase Ahorcado.
     */
    @Test
    public void testSetAhorcado() {
        System.out.println("setAhorcado");
        String ahorcadoString = "nuevaCadena";
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.setAhorcado(ahorcadoString);
        assertEquals(ahorcadoString, ahorcado.getAhorcado());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Prueba del método rellenarCaracteres(int, String) de la clase Ahorcado.
     */
    @Test
    public void testRellenarCaracteres_int_String() {
        System.out.println("testRellenarCaracteres_int_String");
        Ahorcado ahorcado = new Ahorcado();
        //String ahorcadoString = "materia";
        //ahorcado.setAhorcado(ahorcadoString);

        String expResult = ahorcado.rellenarCaracteres();
        long count2 = expResult.codePoints().filter(ch -> ch == '*').count();
        assertEquals(count2, ahorcado.getAhorcado().length());
        //assertEquals(count2, ahorcadoString.length());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
