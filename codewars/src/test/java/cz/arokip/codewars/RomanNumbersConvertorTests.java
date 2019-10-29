package cz.arokip.codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersConvertorTests {

    public static Object[][] cases()
    {
        return new Object[][] {
                {-1, null, IllegalParameterException.class},
                {0, null, IllegalParameterException.class},
                {4001, null, IllegalParameterException.class},
                {1, "I", null},
                {2, "II", null},
                {3, "III", null},
                {10, "X", null},
                {20, "XX", null},
                {30, "XXX", null},
                {}
        };
    }

    @ParameterizedTest
    @MethodSource("cases")
    public void execute(int arabicNumber, String romanNumber, Class exceptionExpected) {
        try {
            assertEquals(RomanNumbersConvertor.toRoman(arabicNumber), romanNumber);
            assertEquals(exceptionExpected, null);
        }catch (IllegalParameterException e) {
            assertEquals(exceptionExpected, IllegalParameterException.class);
        }
    }

}
