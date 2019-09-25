package cz.arokip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;

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
                {10, new int[][]{{1, 1}}},
                {11, new int[][]{{1, 1}, {1, 0}}},
                {111, new int[][]{{1, 2}, {1, 1}, {1, 0}}},
                {101, new int[][]{{1, 2}, {1, 0}}},
                {20, new int[][]{{2, 1}}},
                {100, new int[][]{{1, 2}}},
                {200, new int[][]{{2, 2}}},
                {258, new int[][]{{2, 2}, {5, 1}, {8, 0}}},
                {1000, new int[][]{{1, 3}}},
                {123456, new int[][]{{1, 5}, {2, 4}, {3, 3}, {4, 2}, {5, 1}, {6, 0}}}
        };
    }

    private static int[][] breakOf(int number) {
        if (number == 0) return new int[][]{};
        int divCounter = 0;
        ArrayList<Integer> numberList = new ArrayList<>();
        while (number > 0) {
            numberList.add(number % 10);
            if (number % 10 != 0) divCounter++;
            number = number / 10;
        }

        int[][] returnArray = new int[divCounter][2];
        int sizeOfList = numberList.size();
        int index = 0;
        for (int i = 0; i < sizeOfList; i++) {
            if (numberList.get(sizeOfList - i - 1) == 0) continue;
            returnArray[index][0] = numberList.get(sizeOfList - i - 1);
            returnArray[index][1] = sizeOfList - i - 1;
            index++;
        }
        return returnArray;
    }
}