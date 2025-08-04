
public class AlternatePairsBuilder {
    public static String getAlternatesPairs(String str) {
        //every 4 characters take index i and i+1
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i+=4) {
            result.append(str.charAt(i));
            //only add next characters if it excists
            if (i + 1 < str.length())
                result.append(str.charAt(i + 1));
        }
        return result.toString();
    }

    public static void main(String[] arg) {
        System.out.println(getAlternatesPairs("kitten"));
        System.out.println(getAlternatesPairs("Chocolate"));
        System.out.println(getAlternatesPairs("CodingHorror"));
    }
}