package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




public class TestHola {
    @Test
    public void testSaludar() {
        Hola hola = new Hola();
        assertEquals("Hola", hola.saludar(""));
    }
}
