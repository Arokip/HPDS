import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class TupleMapper_ {

    private final int[][] breakdown;
    private final String romanNumber;

    public TupleMapper_(int[][] breakdown, String romanNumber) {
        this.breakdown = breakdown;
        this.romanNumber = romanNumber;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {new int[][] {{1,0}}, "I"},
                {new int[][] {{2,0}}, "II"},
                {new int[][] {{3,0}}, "III"},
                {new int[][] {{3,1},{3,0}}, "XXXIII"},
        };
    }

    @Test
    public void execute() {
        assertThat(TupleMapper.maptuple(breakdown)).isEqualTo(romanNumber);
    }

}
