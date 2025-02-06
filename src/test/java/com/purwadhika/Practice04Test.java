package com.purwadhika;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Practice04Test {
    private Practice04 practice04;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        practice04 = new Practice04();
        System.setOut(new PrintStream(outContent)); // Redirect output untuk diuji
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut); // Kembalikan output ke konsol
    }

    @Test
    void testPrintMultiplicationTable_ValidInput() {
        practice04.printMultiplicationTable(3);
        String expectedOutput = "1 2 3\n2 4 6\n3 6 9";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testPrintMultiplicationTable_InvalidInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            practice04.printMultiplicationTable(0);
        });
        assertEquals("n must be more than 0", thrown.getMessage());
    }

    @Test
    void testPrintStar_ValidInput() {
        practice04.printStar(3);
        String expectedOutput = "*\n**\n***";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    void testPrintStar_InvalidInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            practice04.printStar(0);
        });
        assertEquals("n must be more than 0", thrown.getMessage());
    }

    @Test
    void testReadNumber() {
        String input = "1\ny\n2\nn\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); // Simulasi input
        practice04.readNumber();
        assertTrue(outContent.toString().contains("Output: 1,2"));
    }

    @Test
    void testSwapCase_ValidInput() {
        assertEquals("tHE qUIcK bRoWn fOX", practice04.swapCase("The QuiCk BrOwN Fox"));
        assertEquals("hELLO wORLD", practice04.swapCase("Hello World"));
    }

    @Test
    void testSwapCase_NullInput() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            practice04.swapCase(null);
        });
        assertEquals("input is null", thrown.getMessage());
    }
}
