public class DigitComparator {
    public boolean hasSameLastDigit(int a, int b, int c) {
        int aDigit = a % 10;
        int bDigit = b % 10;
        int cDigit = c % 10;
        // return true if two or more of them have the same rightmost digit
        return (aDigit == bDigit) || (aDigit == cDigit) || (bDigit == cDigit);
    }
}
