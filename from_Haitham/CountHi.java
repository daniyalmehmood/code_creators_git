public class CountHi {
 public int countHowManyHiInString(String str) {
        int countHi = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i))
                countHi++;
        }
        return countHi;
    }
	}