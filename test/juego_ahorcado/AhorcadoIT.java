
package juego_ahorcado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author desst
 */
public class AhorcadoIT {

    public AhorcadoIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of rellenarCaracteres method, of class Ahorcado.
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
     * Test of getArrayAhorcado method, of class Ahorcado.
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
     * Test of setArrayAhorcado method, of class Ahorcado.
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
     * Test of getNumeroAleatorio method, of class Ahorcado.
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
     * Test of setNumeroAleatorio method, of class Ahorcado.
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
     * Test of getAhorcado method, of class Ahorcado.
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
     * Test of setAhorcado method, of class Ahorcado.
     */
    @Test
    public void testSetAhorcado () {
        System.out.println("setAhorcado");
        String ahorcadoString = "nuevaCadena";
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.setAhorcado(ahorcadoString);
        assertEquals(ahorcadoString, ahorcado.getAhorcado());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rellenarCaracteres method, of class Ahorcado.
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
