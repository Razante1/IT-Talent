import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.Calculadora;

public class CalculadoraTest {

    @Before
    @Test
    public void testSomador() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.Somador(2, 3);
        assertEquals(5, resultado);

        resultado = calculadora.Somador(-1, 1);
        assertEquals(0, resultado);

        resultado = calculadora.Somador(0, 0);
        assertEquals(0, resultado);
    }


}
