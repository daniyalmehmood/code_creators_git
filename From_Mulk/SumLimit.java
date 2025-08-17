ublic class SumLimit {
    public int sumWithDigitLimit(int a, int b) {
        if (String.valueOf(a + b).length() == String.valueOf(a).length()) {
            return a + b;
        }
        return a;
    }
}
