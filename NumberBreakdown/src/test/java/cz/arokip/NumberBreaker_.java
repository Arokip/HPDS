package cz.arokip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class NumberBreaker_ {
    private static final int MIN = 0;
    private final int number;
    private final int[][] breakdown;

    public NumberBreaker_(int number, int[][] breakdown) {
        this.number = number;
        this.breakdown = breakdown;
    }

    @Test
    public void execute() {
        assertThat(breakOf(number)).isEqualTo(breakdown);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {0, new int[][]{}},
                {1, new int[][]{{1, 0}}},
                {2, new int[][]{{2, 0}}},
//                {10, new int[][]{{1, 1}}}

        };
    }

    public static int[][] breakOf(int number) {
        if (number == 0) {
            return new int[][]{};
        }
        return new int[][]{{number, 0}};

    }

}