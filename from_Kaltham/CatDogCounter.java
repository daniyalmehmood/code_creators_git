public class CatDogCounter {
    public boolean hasEqualCatAndDog(String str) {
        int countcat = 0;
        int countdog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if ((str.substring(i, i + 3).equals("cat"))) {
                countcat++;
            }
            if ((str.substring(i, i + 3).equals("dog"))) {
                countdog++;
            }
        }
        return countcat == countdog;
    }
}
