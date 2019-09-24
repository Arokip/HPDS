package cz.arokip.codewars;

public class NumberBreakdown {
    public static int[][] brake(int number) {
        if (number >= 10 && number % 10 > 0)
            return  new int[][] {{getTens(number), 1}, {getOnes(number), 0}};
        else if (number >= 10)
            return new int[][] {{getTens(number), 1}};
        else return new int[][] {{getOnes(number), 0}};
    }

    static int getOnes(int number) {
        return number % 10;
    }

    static int getTens(int number) {
        return (number % 100) / 10;
    }
}
