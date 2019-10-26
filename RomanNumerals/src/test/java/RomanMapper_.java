import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class RomanMapper_ {

    public static final String[][] ROMAN_TABLE = {
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}
    };

    private final int[][] breakdown;
    private final String romanString;

    public RomanMapper_(int[][] breakdown, String romanString) {
        this.breakdown = breakdown;
        this.romanString = romanString;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {new int[][]{}, ""},
                {new int[][]{{1, 0}}, "I"},
                {new int[][]{{2, 0}}, "II"},
                {new int[][]{{1, 1}}, "X"},
                {new int[][]{{1, 1}, {1, 0}}, "XI"},
                {new int[][]{{2, 1}}, "XX"},
                {new int[][]{{8, 2}, {4, 1}, {4, 0}}, "DCCCXLIV"},
                {new int[][]{{3, 2}, {2, 0}}, "CCCII"},
                {new int[][]{{3, 3}, {5, 2}, {2, 1}, {2, 0}}, "MMMDXXII"},
                {new int[][]{{3, 3}, {9, 2}, {9, 1}, {9, 0}}, "MMMCMXCIX"},
                {new int[][]{{8, 2}, {9, 1}, {6, 0}}, "DCCCXCVI"}
        };
    }

    @Test
    public void execute() {
        assertThat(mapBreakdownToRoman(breakdown)).isEqualTo(romanString);
    }

    public String mapBreakdownToRoman(int[][] breakdown) {
        return Arrays.stream(breakdown)
                .map(this::tupleToString)
                .collect(Collectors.joining(""));
    }

    public String tupleToString(int[] tuple) {
        return ROMAN_TABLE[tuple[1]][tuple[0]];

    }


}