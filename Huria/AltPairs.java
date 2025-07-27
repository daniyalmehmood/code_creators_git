public class AltPairs {
    public static String altPairs(String str) {
        String newString = "";

        if (str.length() <= 2) {
            return str;
        }
        for (int i = 0; i < str.length(); i = i + 4) {
            int last = i + 2;
            if (last > str.length()) {
                last = str.length();
            }
            newString = newString + str.substring(i, last);
        }
        return newString;

    }


    public static void main(String[] args) {

        System.out.println(AltPairs.altPairs("kitten"));
        System.out.println(AltPairs.altPairs("Chocolate"));
        System.out.println(AltPairs.altPairs("CodingHorror"));
        System.out.println(AltPairs.altPairs("yak"));
        System.out.println(AltPairs.altPairs("y"));
        System.out.println(AltPairs.altPairs(""));
    }
}
