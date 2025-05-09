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
        // Test primi 6 numeri
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        // Test primi 10 numeri
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        // Test primi 20 numeri
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    // Test per numeri troppo grandi
    @Test
    public void testConvertiNumeroGrande() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            for (int n = 21; n<=1000; n++){
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