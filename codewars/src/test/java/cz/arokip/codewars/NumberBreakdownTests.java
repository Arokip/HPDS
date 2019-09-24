package cz.arokip.codewars;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberBreakdownTests {

    public static Object[][] paramsSourceGeneration() {
        return new Object[][] {
                {   1, new int[][] {{1, 0}}    },
                {   2, new int[][] {{2, 0}}    },
                {   3, new int[][] {{3, 0}}    },
                {   10, new int[][] {{1, 1}}    },
                {   -10, new int[][] {{-1, 1}}    },
        };
    }

    @ParameterizedTest
    @MethodSource("paramsSourceGeneration")
    public void exec(int number, int[][] breakDown) {

        assertArrayEquals(NumberBreakdown.brake(number), breakDown);
    }
}
