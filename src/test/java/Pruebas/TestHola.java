package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;


public class TestHola {
    @Test
    public void testSaludar() {
        Hola hola = new Hola();
        assertEquals("Hola", hola.saludar(""));

    }
}
