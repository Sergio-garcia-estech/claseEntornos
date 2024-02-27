package operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {
    @Test
    public void testPotencia1(){
        System.out.println("Potencia camino 1");
        int resultado = Operaciones.potencia(2,3);
        int resultEsperado = 8;
        assertEquals(resultEsperado, resultado);
    }
    @Test
    public void testPotencia2(){
        System.out.println("Potencia camino 2");
        int resultado = Operaciones.potencia(2,0);
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testPotencia3(){
        System.out.println("Potencia camino 3");
        int resultado = Operaciones.potencia(2, -2);
        int resultadoEsperado = 1;
        assertEquals(resultadoEsperado, resultado);
    }
}