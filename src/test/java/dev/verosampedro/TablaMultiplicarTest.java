package dev.verosampedro;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {

    @Test
    public void testImprimirTablaMultiplicar() {
        int n = 7;
        String[] expectedOutput = {
            "7 x 1 = 7",
            "7 x 2 = 14",
            "7 x 3 = 21",
            "7 x 4 = 28",
            "7 x 5 = 35",
            "7 x 6 = 42",
            "7 x 7 = 49",
            "7 x 8 = 56",
            "7 x 9 = 63",
            "7 x 10 = 70"
        };

        
        String[] actualOutput = TablaMultiplicar.imprimirTablaMultiplicar(n);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}
