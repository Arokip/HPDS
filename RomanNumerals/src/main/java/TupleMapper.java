import java.util.Arrays;
import java.util.stream.Collectors;

public class TupleMapper {

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

    public static String maptuple(int[][] tuples) {
        return Arrays.stream(tuples)
                .map(ar -> TABLE[ar[0] - 1][ar[1]])
                .collect(Collectors.joining(""));
    }
}
