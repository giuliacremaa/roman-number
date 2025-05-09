package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        // Test primi 3 numeri
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    // Test per numeri troppo grandi
    @Test
    public void testConvertiNumeroGrande() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            for (int n = 4; n<=1000; n++){
                IntegerToRoman.convert(n);
            }
        });
        assertEquals("Non valido", exception.getMessage());
    }

    // Test per zero
    @Test
    public void testConvertiZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
        assertEquals("Non valido", exception.getMessage());
    }

    // Test per numeri negativi
    @Test
    public void testConvertiNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(-1);
        });
        assertEquals("Non valido", exception.getMessage());
    }
        
}