import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class TupleMapper_ {
    private static String[][] TABLE = {
            {"I", "X", "C", "M"},
            {"II", "XX", "CC", "MM"},
            {"III", "XXX", "CCC", "MMM"},
            {"IV", "XL", "DC"},
            {"VI", "LX", "DC", "M"},
            {"VII", "LXX", "DCC", "MM"},
            {"VIII", "LXXX", "DCCC", "MMM"},
            {"IX", "XC", "CM"}
    };

    private final int[][] breakdown;
    private final String romanNumber;

    public TupleMapper_(int[][] breakdown, String romanNumber) {
        this.breakdown = breakdown;
        this.romanNumber = romanNumber;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {new int[][] {{1,0}}, "I"}
        };
    }

    @Test
    public void execute() {
        assertThat(mapTuple(breakdown)).isEqualTo(romanNumber);
    }

    private String mapTuple(int[][] tuples) {
        return null;
    }
}
