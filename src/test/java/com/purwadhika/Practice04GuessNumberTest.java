package com.purwadhika;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.*;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class Practice04GuessNumberTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent)); // Redirect output untuk diuji
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut); // Kembalikan output ke konsol
        System.setIn(originalIn);   // Kembalikan input ke sistem
    }





}
