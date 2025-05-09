package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        // Test primi 3 numeri
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", RomanPrinter.print(2));
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", RomanPrinter.print(3));
        // Test primi 6 numeri
        assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", RomanPrinter.print(4));
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", RomanPrinter.print(5));
        assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", RomanPrinter.print(6));
        // Test primi 10 numeri
        assertEquals(" __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n", RomanPrinter.print(7));
        assertEquals(" __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n", RomanPrinter.print(8));
        assertEquals("  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n", RomanPrinter.print(9));
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", RomanPrinter.print(10));
        // Test primi 20 numeri
        assertEquals(" __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", RomanPrinter.print(15));
        assertEquals(" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", RomanPrinter.print(19));
        assertEquals(" __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(20));
        // Test primi 50 numeri
        assertEquals(" __   __ __   __ __   __\n \\ \\ / / \\ \\ / / \\ \\ / /\n  \\ V /   \\ V /   \\ V / \n   > <     > <     > <  \n  / . \\   / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(30));
        assertEquals(" __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n", RomanPrinter.print(40));
        assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n", RomanPrinter.print(50));
        // Test primi 100 numeri
        assertEquals("  _       __   __\n | |      \\ \\ / /\n | |       \\ V / \n | |        > <  \n | |____   / . \\ \n |______| /_/ \\_\\\n", RomanPrinter.print(60));
        assertEquals("  _       __   __ __   __\n | |      \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V / \n | |        > <     > <  \n | |____   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(70));
        assertEquals("  _       __   __ __   __ __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V /   \\ V / \n | |        > <     > <     > <  \n | |____   / . \\   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", RomanPrinter.print(80));
        assertEquals(" __   __   _____ \n \\ \\ / /  / ____|\n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\  \\_____|\n", RomanPrinter.print(90));
        assertEquals("   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n", RomanPrinter.print(100));
        // Test primi 500 numeri
        assertEquals("   _____    _____ \n  / ____|  / ____|\n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____|  \\_____|\n", RomanPrinter.print(200));
        assertEquals("   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n", RomanPrinter.print(300));
        assertEquals("   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n", RomanPrinter.print(400));
        assertEquals("  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n", RomanPrinter.print(500));
    }

    // Test per numeri troppo piccoli
    @Test
    public void testStampaNumeroBasso() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertEquals("Non valido", e.getMessage());
    }

    // Test per numeri troppo grandi
    @Test
    public void testStampaNumeroAlto() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(501));
        assertEquals("Non valido", e.getMessage());
    }
}