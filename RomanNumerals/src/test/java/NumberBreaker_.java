import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.stream.Collectors;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class NumberBreaker_ {
    private final int number;
    private final int[][] breakdown;

    public NumberBreaker_(int number, int[][] breakdown) {
        this.number = number;
        this.breakdown = breakdown;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {1, new int[][]{{1, 0}}},
                {2, new int[][]{{2, 0}}},
                {10, new int[][]{{1, 1}}},
                {11, new int[][]{{1, 1}, {1, 0}}},
                {20, new int[][]{{2, 1}}},
                {844, new int[][]{{8, 2}, {4, 1}, {4, 0}}},
                {302, new int[][]{{3, 2}, {2, 0}}},
                {3522, new int[][]{{3, 3}, {5, 2}, {2, 1}, {2, 0}}},
                {3999, new int[][]{{3, 3}, {9, 2}, {9, 1}, {9, 0}}},
                {896, new int[][]{{8, 2}, {9, 1}, {6, 0}}}
        };
    }

    @Test
    public void execute() {
        assertThat(new NumberBreaker(number).breakdown()).isEqualTo(breakdown);
    }

    public String mapBreakdownToRoman(int[][] breakdown) {
        return Arrays.stream(breakdown)
                .map(this::tupleToString)
                .collect(Collectors.joining(""));
    }

    public String tupleToString(int[] tuple) {
        return tuple[0] + "" + tuple[1] + "";
    }
}