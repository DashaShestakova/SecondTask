package com.epam.idea.task.second;

import com.epam.idea.task.second.view.ConsoleResultPrinter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class ConsoleResultPrinterTest {

        private final static PrintStream stdout = System.out;
        private final static ByteArrayOutputStream output = new ByteArrayOutputStream();
        private static ConsoleResultPrinter result;

        @Before
        public void setUp() throws UnsupportedEncodingException {
            result = new ConsoleResultPrinter();
            System.setOut(new PrintStream(output, true, "UTF-8"));
        }

        @Test
        public void testPrintShouldPrintWhenEnterName() {
            result.print("Dasha");
            assertEquals("Hello Dasha", output.toString());
        }

        @After
        public void cleanUp() {
            System.setOut(stdout);
        }
    }
