package almeida.adenilson.uno.conceitosclassesabstrataseinterfaces;

import org.junit.Test;

import static org.junit.Assert.*;

import almeida.adenilson.uno.conceitosclassesabstrataseinterfaces.forma.Triangulo;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    // Valida se a área do triangulo é maior que 0, ou seja, um valor positivo.
    @Test
    public void areaTrianguloTest(){
        Triangulo triangulo = new Triangulo(5, 6, 7);
        boolean x = triangulo.area() > 0;
        assertTrue(x);
    }
}