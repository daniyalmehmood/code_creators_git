public class CatDog {
    public static boolean CountCatDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public static void main(String[] args) {
        System.out.println(CountCatDog("catdog"));
        System.out.println(CountCatDog("catcat"));
        System.out.println(CountCatDog("1cat1cadodog"));
    }
}
