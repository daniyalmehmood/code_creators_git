//Recursion-1 > count11

public class ElevenStringCounter {
    public int countEleven(String str) {

        if (str.length() <= 1) {
            return 0;
        }
        if (str.substring(0, 2).equals("11")) {

            return 1 + countEleven(str.substring(2));
        }

        return countEleven(str.substring(1));

    }
}