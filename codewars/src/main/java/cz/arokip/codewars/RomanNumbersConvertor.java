package cz.arokip.codewars;

public class RomanNumbersConvertor {
    public static final int MAX_NUMBER = 4000;
    public static final int MIN_NUMBER = 1;


    public static String toRoman(int arabicNumber) {
        if (arabicNumber < MIN_NUMBER || arabicNumber > MAX_NUMBER) throw new IllegalParameterException();
        if (arabicNumber == 1) return "I";
        else return "II";
    }
}
