public class CatDogChecker {
    public static Boolean hasEqualCatAndDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }


        }
        //Return true if the string "cat" and "dog"  string
        return countCat == countDog;
    }
}

