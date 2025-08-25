public class CatDog {
public boolean catDogFinder(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) countCat++;
            else if (str.startsWith("dog", i)) countDog++;
        }
        if (countDog == countCat) return true;
        return false;
    }
	}